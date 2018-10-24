package com.neo.demo;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class StartController {

    @FXML
    private Button btn_hello;

    @FXML
    private TextField tf_hello;


    public void onClick(ActionEvent actionEvent) {
        tf_hello.setText("Hello World");
    }
}
