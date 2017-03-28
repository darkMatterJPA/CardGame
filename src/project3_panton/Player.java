/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_panton;

import java.util.ArrayList;

/**
 *
 * @author Dark Nebula
 */
public class Player {
    
    String name;
    ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }
    
    public void displayCard()
    {
        for (int i = 0; i <hand.size(); i++) 
        {
            System.out.println(hand.get(i).toString());
        }
    }
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    
       public void compPlay(Game game)
    {
       
       
            compDraw(game);
        
            compDiscard(game);
            
        for (Card hand1 : game.p2.hand) 
        {
            System.out.println(hand1.toString());
        }
        System.out.println();
            
        
    }
    
    private void compDraw(Game game)
    {
         if(game.p2.hand.size()==4)
        {
            if(!game.discard.isEmpty())
            {
                for (int i =0; i < game.p2.hand.size(); i++) 
                {
                    if(game.p2.hand.get(i).equals(game.discard.peekFirst()))
                    {
                        game.drawDiscard(game.p2);
                        return;
                    }
                   
                }
                game.drawNew(game.p2);
            }
        }
         
    }
    
    private void compDiscard(Game game)
    {
        if(game.p2.hand.size()==5)
        {
            for (int i =0; i < game.p2.hand.size(); i++) 
                {
                    if(!(game.p2.hand.get(i).value.equals(game.p2.hand.get(i+1).value )))
                    {
                        game.discard(game.p2,i+1);
                        return;
                    }
                   
                }
            //game.discard(game.p2,3);
        }
    }
    
}
