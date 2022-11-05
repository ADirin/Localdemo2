package com.example.localdemo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;
    String str;

   public void initialize() {

       welcomeText.setText("The Bundle file should be in Resouces folder ");
   }

    @FXML
    protected void onHelloButtonClick() {

       welcomeText.setText("welcome");
        Locale l = new Locale("su","FI");
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
        str = r.getString("wish");
        welcomeText.setText(str);



    }


    public void btnBosina(ActionEvent actionEvent) {
        //welcomeText.setText("welcome");
        Locale l = new Locale("bo","BO");
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
        str = r.getString("wish");
        welcomeText.setText(str);


    }
}