package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

    public class  NovousuariomodalController implements Initializable {

        @FXML
        TextField usuariofield;
        @FXML
        PasswordField senhafield;
        @FXML
        Label labeljaexiste;


        @FXML
        public void Cancelar() {
            HelloApplication.closeCurrentWindow();
        }

        public void initialize(URL url, ResourceBundle resourceBundle) {


        }

}
