/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_panton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alton Panton
 */
public class Project3_Panton extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader ldr =new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        
        Parent root = ldr.load();
        
        
        
        Scene scene = new Scene(root);
        
        
        stage.setResizable(false);
        stage.setTitle("Card Game");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
  
         
        
        
    }
    
}
