/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blj_demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author nikiv
 */
public class Test {
    
    private BLJ_Demo master;
    private VBox root;
    private Scene scene;
    
    private int testInt = 10;
    
    public Test(BLJ_Demo master){
//        Master wird direkt im Konstruktor übergeben
        this.master = master;
//        Hauptcontainer 'root' wird erstellt und konfiguriert
        root = new VBox();
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        
//        Weiterer Container 'hbox' wird erstellt und konfiguriert
        HBox box = new HBox();
        box.setSpacing(20);
                
//        2 Buttons werden erstellt und durch Methoden mit Text versehen
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Say 'Hello World'");
        btn2.setText("Say 'Hello World 2'");
        
//        2 Labels werden esrtellt und direkt im Konstruktor mit Text versehen
        Label lbl = new Label("Hallo");

//        Es wird definniert was beim Click auf Button passieren soll
        btn.setOnMouseClicked((event) -> {
//            Unterscheidung zwischen Links- und Rechtsklick
            if(event.getButton().equals(MouseButton.PRIMARY)){
                System.out.println("Hallo Welt mit Linksklick");
            }else{
                System.out.println("Hallo Welt mit Rechtsklick");
            }
            
        });       
   
//        Layout wird zusammengesetzt, entpricht dem "Draufziehen" im SceneBuilder
        box.getChildren().addAll(btn, btn2);
        root.getChildren().addAll(box, lbl);
        scene = new Scene(root);
        
    }
    
//    Getter-Methode, damit der Manager (hauptklasse) Zugriff auf die Scene hat
    public Scene getScene(){
        return scene;
    }
    
}
