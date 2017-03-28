/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_panton;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Dark Nebula
 */
public class Game {
    protected Queue<Card> deck  = new LinkedList<>();
    protected ArrayDeque<Card> discard = new ArrayDeque<>();
    protected Player p1;
    protected Player p2;
    
    final private String[] suite = {"Spades","Hearts","Diamonds","Clubs"};
    final private String[] value ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    
    

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
         
    }
    
    public void makeDeck()
    {
        int num =1;
        
        for (int i = 0; i < suite.length; i++) 
        {
            for (int j = 0; j < value.length; j++) 
            {
                deck.offer(new Card(suite[i],value[j],num));
                num++;
            }
        }
        
        Collections.shuffle((List<Card>) deck);
    }
    
    public void drawDiscard(Player player)
    {
        player.hand.add(discard.poll());
        
        
    }
    
    public void drawNew(Player player)
    {
       
        
        if(deck.isEmpty())
        {
            while(!discard.isEmpty())
            {
                deck.offer(discard.pollFirst());
                
            }
            
            Collections.shuffle((List<Card>) deck);
        }
         player.hand.add(deck.poll());
    }
    
    public void discard(Player player,int num)
    {
        
        discard.push(player.hand.get(num));
        player.hand.remove(player.hand.get(num) );
        
    }
           
   
    public void giveHand(Player player)
    {
        for (int i = 0; i < 4; i++) 
        {
            Card poll = deck.poll();
            player.hand.add(poll);
        }
        
        
    }
    
    public boolean isGameOver(ArrayList<Card> hand)
    {
        boolean gameOver = false;
        if(hand.size() == 4)
        {
            if((hand.get(0).value.equals(hand.get(1).value)) && (hand.get(0).value.equals(hand.get(2).value)) && (hand.get(0).value.equals(hand.get(3).value)))
            {
                gameOver = true;
            }
            else 
            {
                gameOver = false;
               
            }
        }
        
        return gameOver;
         
    }
    //need 
    
    
    

    public Queue<Card> getDeck() {
        return deck;
    }

    public void setDeck(Queue<Card> deck) {
        this.deck = deck;
    }

    public ArrayDeque<Card> getDiscard() {
        return discard;
    }

    public void setDiscard(ArrayDeque<Card> discard) {
        this.discard = discard;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }
    
    
    
}
