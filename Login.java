/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class Login extends Stage {
        Button btn;
        TextField user;
        PasswordField ps;
        Label userl, psl;
    Login(){
    
    btn  =new Button("Login");
    btn.setPadding(new Insets(8));
    btn.setPrefWidth(80);
    btn.setStyle("-fx-background-color:darkblue; -fx-text-fill: white; ");
    user  = new TextField();
    ps = new PasswordField();
    
    userl =new Label("Username");
    psl = new Label("Password");
    VBox vb= new VBox(15,  userl ,user ,psl ,ps ,btn);
   
    vb.setAlignment(Pos.CENTER);
    vb.setPadding(new Insets(10));
    Scene sc =new Scene(vb ,500, 500);
    this.setTitle("Login");
    this.setScene(sc);
    this.show();
    
    btn.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent event) {
               if(user.getText().equals("") && ps.getText().equals("")){
               Label lb = new Label("Invalid Inputs");
               lb.setStyle("-fx-text-fill:red;");
               vb.getChildren().add(lb);
               
               
               }
            if(user.getText().equals("user") && ps.getText().equals("userpass")){
            
            try {
                
            viewManager.CloseLoginPage();
                viewManager.openExchangePage();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
    
    
    });
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
