/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_panton;

/**
 *
 * @author Dark Nebula
 */
public class Card  {
    
    protected String suite;
    protected String value;
    protected int num;

    public Card()
    {
        
    }
    
    public Card(String suite, String value, int num) {
        this.suite = suite;
        this.value = value;
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   public String toStyleP(Game game, int i)
    {
        
            if("Spades".equals(game.p1.hand.get(i).suite))
            {
                if("Ace".equals(game.p1.hand.get(i).value))
                {
                    return "images/ace_of_spades2.jpg";
                }
                else if("2".equals(game.p1.hand.get(i).value))
                {
                    return "images/2_of_spades.jpg";
                }
                else if("3".equals(game.p1.hand.get(i).value))
                {
                    return "images/3_of_spades.jpg";
                }
                else if("4".equals(game.p1.hand.get(i).value))
                {
                    return "images/4_of_spades.jpg";
                }
                else if("5".equals(game.p1.hand.get(i).value))
                {
                    return "images/5_of_spades.jpg";
                }
                else if("6".equals(game.p1.hand.get(i).value))
                {
                    return "images/6_of_spades.jpg";
                }
                else if("7".equals(game.p1.hand.get(i).value))
                {
                    return "images/7_of_spades.jpg";
                }
                else if("8".equals(game.p1.hand.get(i).value))
                {
                    return "images/8_of_spades.jpg";
                }
                else if("9".equals(game.p1.hand.get(i).value))
                {
                    return "images/9_of_spades.jpg";
                }
                else if("10".equals(game.p1.hand.get(i).value))
                {
                    return "images/10_of_spades.jpg";
                }
                else if("Jack".equals(game.p1.hand.get(i).value))
                {
                    return "images/jack_of_spades2.jpg";
                }
                else if("Queen".equals(game.p1.hand.get(i).value))
                {
                    return "images/queen_of_spades2.jpg";
                }
                else if("King".equals(game.p1.hand.get(i).value))
                {
                    return "images/king_of_spades2.jpg";
                }
                
            }
            else if("Hearts".equals(game.p1.hand.get(i).suite))
            {
                if("Ace".equals(game.p1.hand.get(i).value))
                {
                    return "images/ace_of_hearts.jpg";
                }
                else if("2".equals(game.p1.hand.get(i).value))
                {
                    return "images/2_of_hearts.jpg";
                }
                else if("3".equals(game.p1.hand.get(i).value))
                {
                    return "images/3_of_hearts.jpg";
                }
                else if("4".equals(game.p1.hand.get(i).value))
                {
                    return "images/4_of_hearts.jpg";
                }
                else if("5".equals(game.p1.hand.get(i).value))
                {
                    return "images/2_of_hearts.jpg";
                }
                else if("6".equals(game.p1.hand.get(i).value))
                {
                    return "images/6_of_hearts.jpg";
                }
                else if("7".equals(game.p1.hand.get(i).value))
                {
                    return "images/7_of_hearts.jpg";
                }
                else if("8".equals(game.p1.hand.get(i).value))
                {
                    return "images/8_of_hearts.jpg";
                }
                else if("9".equals(game.p1.hand.get(i).value))
                {
                    return "images/9_of_hearts.jpg";
                }
                else if("10".equals(game.p1.hand.get(i).value))
                {
                    return "images/10_of_hearts.jpg";
                }
                else if("Jack".equals(game.p1.hand.get(i).value))
                {
                    return "images/jack_of_hearts2.jpg";
                }
                else if("Queen".equals(game.p1.hand.get(i).value))
                {
                    return "images/queen_of_hearts2.jpg";
                }
                else if("King".equals(game.p1.hand.get(i).value))
                {
                    return "images/king_of_hearts2.jpg";
                }
            }
            else if("Diamonds".equals(game.p1.hand.get(i).suite))
            {
                if("Ace".equals(game.p1.hand.get(i).value))
                {
                   return "images/ace_of_diamonds.jpg";
                }
                else if("2".equals(game.p1.hand.get(i).value))
                {
                    return "images/2_of_diamonds.jpg";
                }
                else if("3".equals(game.p1.hand.get(i).value))
                {
                    return "images/3_of_diamonds.jpg";
                }
                else if("4".equals(game.p1.hand.get(i).value))
                {
                    return "images/4_of_diamonds.jpg";
                }
                else if("5".equals(game.p1.hand.get(i).value))
                {
                    return "images/5_of_diamonds.jpg";
                }
                else if("6".equals(game.p1.hand.get(i).value))
                {
                    return "images/6_of_diamonds.jpg";
                }
                else if("7".equals(game.p1.hand.get(i).value))
                {
                    return "images/7_of_diamonds.jpg";
                }
                else if("8".equals(game.p1.hand.get(i).value))
                {
                    return "images/8_of_diamonds.jpg";
                }
                else if("9".equals(game.p1.hand.get(i).value))
                {
                    return "images/9_of_diamonds.jpg";
                }
                else if("10".equals(game.p1.hand.get(i).value))
                {
                    return "images/10_of_diamonds.jpg";
                }
                else if("Jack".equals(game.p1.hand.get(i).value))
                {
                    return "images/jack_of_diamonds2.jpg";
                }
                else if("Queen".equals(game.p1.hand.get(i).value))
                {
                    return "images/queen_of_diamonds2.jpg";
                }
                else if("King".equals(game.p1.hand.get(i).value))
                {
                    return "images/king_of_diamonds2.jpg";
                }
            }
            else if("Clubs".equals(game.p1.hand.get(i).suite))
            {
                if("Ace".equals(game.p1.hand.get(i).value))
                {
                    return "images/ace_of_clubs.jpg";
                }
                else if("2".equals(game.p1.hand.get(i).value))
                {
                    return "images/2_of_clubs.jpg";
                }
                else if("3".equals(game.p1.hand.get(i).value))
                {
                    return "images/3_of_clubs.jpg";
                }
                else if("4".equals(game.p1.hand.get(i).value))
                {
                    return "images/4_of_clubs.jpg";
                }
                else if("5".equals(game.p1.hand.get(i).value))
                {
                    return "images/5_of_clubs.jpg";
                }
                else if("6".equals(game.p1.hand.get(i).value))
                {
                    return "images/6_of_clubs.jpg";
                }
                else if("7".equals(game.p1.hand.get(i).value))
                {
                    return "images/7_of_clubs.jpg";
                }
                else if("8".equals(game.p1.hand.get(i).value))
                {
                    return "images/8_of_clubs.jpg";
                }
                else if("9".equals(game.p1.hand.get(i).value))
                {
                    return "images/9_of_clubs.jpg";
                }
                else if("10".equals(game.p1.hand.get(i).value))
                {
                    return "images/10_of_clubs.jpg";
                }
                else if("Jack".equals(game.p1.hand.get(i).value))
                {
                    return "images/jack_of_clubs2.jpg";
                }
                else if("Queen".equals(game.p1.hand.get(i).value))
                {
                    return "images/queen_of_clubs2.jpg";
                }
                else if("King".equals(game.p1.hand.get(i).value))
                {
                    return "images/king_of_clubs2.jpg";
                }
            }
            return null;
        
    }

    
    public String toStyle(Game game)
    {
        
            if("Spades".equals(game.discard.peekFirst().suite))
            {
                if("Ace".equals(game.discard.peekFirst().value))
                {
                    return "images/ace_of_spades2.jpg";
                }
                else if("2".equals(game.discard.peekFirst().value))
                {
                    return "images/2_of_spades.jpg";
                }
                else if("3".equals(game.discard.peekFirst().value))
                {
                    return "images/3_of_spades.jpg";
                }
                else if("4".equals(game.discard.peekFirst().value))
                {
                    return "images/4_of_spades.jpg";
                }
                else if("5".equals(game.discard.peekFirst().value))
                {
                    return "images/5_of_spades.jpg";
                }
                else if("6".equals(game.discard.peekFirst().value))
                {
                    return "images/6_of_spades.jpg";
                }
                else if("7".equals(game.discard.peekFirst().value))
                {
                    return "images/7_of_spades.jpg";
                }
                else if("8".equals(game.discard.peekFirst().value))
                {
                    return "images/8_of_spades.jpg";
                }
                else if("9".equals(game.discard.peekFirst().value))
                {
                    return "images/9_of_spades.jpg";
                }
                else if("10".equals(game.discard.peekFirst().value))
                {
                    return "images/10_of_spades.jpg";
                }
                else if("Jack".equals(game.discard.peekFirst().value))
                {
                    return "images/jack_of_spades2.jpg";
                }
                else if("Queen".equals(game.discard.peekFirst().value))
                {
                    return "images/queen_of_spades2.jpg";
                }
                else if("King".equals(game.discard.peekFirst().value))
                {
                    return "images/king_of_spades2.jpg";
                }
                
            }
            else if("Hearts".equals(game.discard.peekFirst().suite))
            {
                if("Ace".equals(game.discard.peekFirst().value))
                {
                    return "images/ace_of_hearts.jpg";
                }
                else if("2".equals(game.discard.peekFirst().value))
                {
                    return "images/2_of_hearts.jpg";
                }
                else if("3".equals(game.discard.peekFirst().value))
                {
                    return "images/3_of_hearts.jpg";
                }
                else if("4".equals(game.discard.peekFirst().value))
                {
                    return "images/4_of_hearts.jpg";
                }
                else if("5".equals(game.discard.peekFirst().value))
                {
                    return "images/2_of_hearts.jpg";
                }
                else if("6".equals(game.discard.peekFirst().value))
                {
                    return "images/6_of_hearts.jpg";
                }
                else if("7".equals(game.discard.peekFirst().value))
                {
                    return "images/7_of_hearts.jpg";
                }
                else if("8".equals(game.discard.peekFirst().value))
                {
                    return "images/8_of_hearts.jpg";
                }
                else if("9".equals(game.discard.peekFirst().value))
                {
                    return "images/9_of_hearts.jpg";
                }
                else if("10".equals(game.discard.peekFirst().value))
                {
                    return "images/10_of_hearts.jpg";
                }
                else if("Jack".equals(game.discard.peekFirst().value))
                {
                    return "images/jack_of_hearts2.jpg";
                }
                else if("Queen".equals(game.discard.peekFirst().value))
                {
                    return "images/queen_of_hearts2.jpg";
                }
                else if("King".equals(game.discard.peekFirst().value))
                {
                    return "images/king_of_hearts2.jpg";
                }
            }
            else if("Diamonds".equals(game.discard.peekFirst().suite))
            {
                if("Ace".equals(game.discard.peekFirst().value))
                {
                   return "images/ace_of_diamonds.jpg";
                }
                else if("2".equals(game.discard.peekFirst().value))
                {
                    return "images/2_of_diamonds.jpg";
                }
                else if("3".equals(game.discard.peekFirst().value))
                {
                    return "images/3_of_diamonds.jpg";
                }
                else if("4".equals(game.discard.peekFirst().value))
                {
                    return "images/4_of_diamonds.jpg";
                }
                else if("5".equals(game.discard.peekFirst().value))
                {
                    return "images/5_of_diamonds.jpg";
                }
                else if("6".equals(game.discard.peekFirst().value))
                {
                    return "images/6_of_diamonds.jpg";
                }
                else if("7".equals(game.discard.peekFirst().value))
                {
                    return "images/7_of_diamonds.jpg";
                }
                else if("8".equals(game.discard.peekFirst().value))
                {
                    return "images/8_of_diamonds.jpg";
                }
                else if("9".equals(game.discard.peekFirst().value))
                {
                    return "images/9_of_diamonds.jpg";
                }
                else if("10".equals(game.discard.peekFirst().value))
                {
                    return "images/10_of_diamonds.jpg";
                }
                else if("Jack".equals(game.discard.peekFirst().value))
                {
                    return "images/jack_of_diamonds2.jpg";
                }
                else if("Queen".equals(game.discard.peekFirst().value))
                {
                    return "images/queen_of_diamonds2.jpg";
                }
                else if("King".equals(game.discard.peekFirst().value))
                {
                    return "images/king_of_diamonds2.jpg";
                }
            }
            else if("Clubs".equals(game.discard.peekFirst().suite))
            {
                if("Ace".equals(game.discard.peekFirst().value))
                {
                    return "images/ace_of_clubs.jpg";
                }
                else if("2".equals(game.discard.peekFirst().value))
                {
                    return "images/2_of_clubs.jpg";
                }
                else if("3".equals(game.discard.peekFirst().value))
                {
                    return "images/3_of_clubs.jpg";
                }
                else if("4".equals(game.discard.peekFirst().value))
                {
                    return "images/4_of_clubs.jpg";
                }
                else if("5".equals(game.discard.peekFirst().value))
                {
                    return "images/5_of_clubs.jpg";
                }
                else if("6".equals(game.discard.peekFirst().value))
                {
                    return "images/6_of_clubs.jpg";
                }
                else if("7".equals(game.discard.peekFirst().value))
                {
                    return "images/7_of_clubs.jpg";
                }
                else if("8".equals(game.discard.peekFirst().value))
                {
                    return "images/8_of_clubs.jpg";
                }
                else if("9".equals(game.discard.peekFirst().value))
                {
                    return "images/9_of_clubs.jpg";
                }
                else if("10".equals(game.discard.peekFirst().value))
                {
                    return "images/10_of_clubs.jpg";
                }
                else if("Jack".equals(game.discard.peekFirst().value))
                {
                    return "images/jack_of_clubs2.jpg";
                }
                else if("Queen".equals(game.discard.peekFirst().value))
                {
                    return "images/queen_of_clubs2.jpg";
                }
                else if("King".equals(game.discard.peekFirst().value))
                {
                    return "images/king_of_clubs2.jpg";
                }
            }
            return null;
        
    }

    @Override
    public String toString() {
        String str = num + ". "+value+" of "+suite;
        return str;
    }
   
    
    

   
    
    
    
    
}
