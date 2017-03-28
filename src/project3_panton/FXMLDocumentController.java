/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_panton;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author Dark Nebula
 */
public class FXMLDocumentController implements Initializable {
    
    Player humanPlayer = new Player();
    
    Player  computerPlayer = new Player();
    
    Game game = new Game(humanPlayer,computerPlayer);
    
    
    
     @FXML
    private Button bt1; //Array index of [0]

    @FXML
    private Button bt2; //Array index of [1]

    @FXML
    private Button bt3; //Array index of [2]

    @FXML
    private Button bt4; //Array index of [3]

    @FXML
    private Button bt5; //Array index of [4]
    
    @FXML
    private Button btC1;

    @FXML
    private Button btC2;

    @FXML
    private Button btC3;

    @FXML
    private Button btC4;

    @FXML
    private Button btC5;
    
    @FXML
    private AnchorPane Main;

    @FXML
    private HBox playerBox;
    
    @FXML
    private HBox ComputerBox;

    
    
    @FXML
    private Button newCardAction;

    @FXML
    private Button discardStackBT;
    
    

      public void alert()
      {
          Alert alert = new Alert(AlertType.ERROR,"You must first Draw a card before you can discard a card.",ButtonType.OK);
          alert.setTitle("Game Logic Error");
          
          alert.showAndWait();
      }
      
       public void alert2()
      {
          Alert alert = new Alert(AlertType.ERROR ,"You can not have more than 5 cards at a time. Discard one before drawing another card.",ButtonType.OK);
          alert.setTitle("Game Logic Error");
          
          alert.showAndWait();
      }
       
        public void humanWinner()
      {
          Alert alert = new Alert(AlertType.INFORMATION ,"Congratulations You Won!!!!!!!",ButtonType.OK);
          alert.setTitle("Winner!!!!!");
          
          
          alert.showAndWait();
          
          if (alert.getResult() == ButtonType.OK)
          {
              
             System.exit(5);
          }
      }
     
         public void computerWinner()
      {
          Alert alert = new Alert(AlertType.INFORMATION ,"The Commputer Won",ButtonType.OK);
          alert.setTitle("Sorry =( ");
          
          
          alert.showAndWait();
          
          if (alert.getResult() == ButtonType.OK)
          {
              
             System.exit(5);
          }
      }
     
    
    @FXML
    void button1Action(ActionEvent event)
    {
        
        
         if(humanPlayer.hand.size()==5)
        {
            game.discard(humanPlayer,0);
            setButtonsHuman();
            setDiscard();
            
                if(game.isGameOver(humanPlayer.hand))
                {
                    humanWinner();
                }
                
               computerPlayer.compPlay(game);
               setButtonComputer();
               setDiscard();
               if(game.isGameOver(computerPlayer.hand))
                {
                    computerWinner();
                }

        }
         else
         {
             alert();
         }
    }
    
    
    @FXML
    void button2Action(ActionEvent event)
    {
        
         if(humanPlayer.hand.size()==5)
        {
            game.discard(humanPlayer,1);
            setButtonsHuman();
            setDiscard();
                if(game.isGameOver(humanPlayer.hand))
                {
                    humanWinner();
                }
                computerPlayer.compPlay(game);
               setButtonComputer();
               setDiscard();
               if(game.isGameOver(computerPlayer.hand))
                {
                    computerWinner();
                }
        }
         else
         {
              alert();
         }
    }
    
    
    @FXML
    void button3Action(ActionEvent event)
    {
        
        
        
         if(humanPlayer.hand.size()==5)
        {
            game.discard(humanPlayer,2);
            setButtonsHuman();
            setDiscard();
                if(game.isGameOver(humanPlayer.hand))
                {
                    humanWinner();
                }
                computerPlayer.compPlay(game);
               setButtonComputer();
               setDiscard();
               if(game.isGameOver(computerPlayer.hand))
                {
                    computerWinner();
                }
        }
         else
         {
              alert();
         }
    }

   
    @FXML
    void button4Action(ActionEvent event)
    {
        
        
         if(humanPlayer.hand.size()==5)
        {
            game.discard(humanPlayer,3);
            setButtonsHuman();
            setDiscard();

                if(game.isGameOver(humanPlayer.hand))
                {
                    humanWinner();
                }
                computerPlayer.compPlay(game);
               setButtonComputer();
               setDiscard();
               if(game.isGameOver(computerPlayer.hand))
                {
                    computerWinner();
                }
        }
         else
         {
              alert();
         }
    }
    
    
    @FXML
    void button5Action(ActionEvent event)
    {
     
        
        
        
        if(humanPlayer.hand.size()==5)
        {
            game.discard(humanPlayer,4);
            setButtonsHuman();
            setDiscard();
                if(game.isGameOver(humanPlayer.hand))
                {
                    humanWinner();
                }
                computerPlayer.compPlay(game);
               setButtonComputer();
               setDiscard();
               if(game.isGameOver(computerPlayer.hand))
                {
                    computerWinner();
                }
        }
        else
        {
             alert();
        }
        
    }
    
    @FXML
    void drawDiscard(ActionEvent event)
    {
        if(humanPlayer.hand.size()==4)
        {
        game.drawDiscard(humanPlayer);
         setButtonsHuman();
         setDiscard();
       
        }
        else
        {
            alert2();
        }
    }

    @FXML
    void newCardAction(ActionEvent event) 
    {
        if(humanPlayer.hand.size()==4)
        {
        game.drawNew(humanPlayer);
        setButtonsHuman();
        }
        else
        {
            alert2();
        }
       
        
    }
    
    private void setDiscard()
    {
        if(game.discard.peekFirst()!= null){
        // discardStackBT.setText(game.discard.peekFirst().toString());
         discardStackBT.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(game.discard.peek().toStyle(game)))));
        }
        else
        {
            discardStackBT.setGraphic(null); 
        }
    }
    
    private void setButtonsHuman()
    {
        
        if(humanPlayer.hand.size() == 4)
        {
           
            playerBox.getChildren().remove(bt5);
            
            
            bt1.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(0).toStyleP(game, 0)))));
            bt2.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(1).toStyleP(game, 1)))));
            bt3.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(2).toStyleP(game, 2)))));
            bt4.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(3).toStyleP(game, 3)))));
            
//            bt1.setText(humanPlayer.hand.get(0).toString());
//            bt2.setText(humanPlayer.hand.get(1).toString());
//            bt3.setText(humanPlayer.hand.get(2).toString());
//            bt4.setText(humanPlayer.hand.get(3).toString());
            
        }
        else if(humanPlayer.hand.size() == 5)
        {
         
          playerBox.getChildren().add(bt5);
            bt1.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(0).toStyleP(game, 0)))));
            bt2.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(1).toStyleP(game, 1)))));
            bt3.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(2).toStyleP(game, 2)))));
            bt4.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(3).toStyleP(game, 3)))));
            bt5.setGraphic(new ImageView(new Image(getClass().getResourceAsStream(humanPlayer.hand.get(4).toStyleP(game, 4)))));

            
//            bt1.setText(humanPlayer.hand.get(0).toString());
//            bt2.setText(humanPlayer.hand.get(1).toString());
//            bt3.setText(humanPlayer.hand.get(2).toString());
//            bt4.setText(humanPlayer.hand.get(3).toString());
//            bt5.setText(humanPlayer.hand.get(4).toString());
//            
           
            
            
        }
        
       
        
        
    }
    
     public void setButtonComputer()
        {
            if(computerPlayer.hand.size()==4)
            {
                ComputerBox.getChildren().remove(btC5);
          
            }
            
            else if(computerPlayer.hand.size()==5)
            {
                ComputerBox.getChildren().add(btC5);
           
            }
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
       
        
        game.makeDeck();
        game.giveHand(humanPlayer);
        game.giveHand(computerPlayer);
        
        

        setButtonsHuman();
        setButtonComputer();
        
    }    
    
}
