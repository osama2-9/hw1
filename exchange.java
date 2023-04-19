/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class exchange extends Stage {

    Label titel;
    Label to;
    Label nis;
    Label usd;
    Button convert, logout;
    TextField nist, usdt;

    exchange() {
        titel = new Label("Curruncy Convert Page");
        to = new Label("TO");
        nis = new Label("NIS");
        usd = new Label("USD");
        convert = new Button("Convert");
        logout = new Button("Logout");
        nist = new TextField();
        usdt = new TextField();
        HBox hb = new HBox(150, titel, logout);
        hb.setPadding(new Insets(20));
        convert.setStyle("-fx-background-color:darkblue; -fx-text-fill: white; ");
        logout.setStyle("-fx-background-color:darkblue; -fx-text-fill: white; ");
        HBox hb2 = new HBox(10, nist, to, usd, usdt);
        hb.setAlignment(Pos.CENTER);
        HBox curr = new HBox(220, nis, usd);

        VBox vb = new VBox(10, hb, curr, hb2, convert);
        vb.setPadding(new Insets(20));

        Scene sc = new Scene(vb, 650, 300);
        this.setScene(sc);
        this.setTitle("Convertat Panel");
        this.show();
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    viewManager.CloseExchangePage();
                    viewManager.openLoginPage();
                } catch (IOException ex) {
                    Logger.getLogger(exchange.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        convert.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                TextField value = new TextField();

                if (usdt.getText().equals("")) {
                    Integer nis = Integer.valueOf(nist.getText());
                    double val = nis / 3.50;
                    String valcon = String.valueOf(val);
                    usdt.appendText(valcon);

                } else if (nist.getText().equals("")) {
                    Integer usd = Integer.valueOf(usdt.getText());
                    double val = usd * 3.50;
                    String valcon = String.valueOf(val);
                    nist.appendText(valcon);

                }

            }
        });

        this.show();

    }

}
