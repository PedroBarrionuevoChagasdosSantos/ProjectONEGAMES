package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import javafx.fxml.FXML;

import java.io.IOException;

public class FIFAController {



    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}
