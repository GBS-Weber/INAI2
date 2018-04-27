/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blj_demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nikiv
 */
public class BLJ_Demo extends Application {
    
//    Deklaration der Fensterklasse
    private Test testWindow;
    
    @Override
    public void start(Stage primaryStage) {
//        Fensterklasse wird erstellt
        testWindow = new Test(this);
        
        primaryStage.setTitle("Hello World!");
//        Hier greift die Hauptklasse auf die Fensterklasse zu und setzt deren Scene auf die Stage
        primaryStage.setScene(testWindow.getScene());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
