package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ValorantController implements Initializable {

    @FXML
    Label labelTexto;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            String text = "ADAWDAWDAWD ADAWDWEWE3123123 123213 DAWD WDQWD 2123 DASDWEW SD WDSDAWSDWD WDQWE1232DCSD EE122DASD23123 DAD123DS";
            labelTexto.setWrapText(true);
            labelTexto.setText(text);

        }


    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}
