package com.example.projectonegames.Controller;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import javafx.fxml.FXML;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VALORANTController {

    @FXML
    public void Voltar() throws IOException {

        HelloApplication.setRoot("home-view");
    }
}
