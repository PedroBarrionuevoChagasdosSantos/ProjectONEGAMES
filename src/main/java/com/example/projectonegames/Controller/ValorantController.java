package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;


public class ValorantController implements Initializable {
    //COLOCAR OS fxml QUE TEM NA TELA DO SCENEBUILDER

    @FXML
    ScrollPane labelTitulo;

    @FXML
    ScrollPane labelTexto;

    @FXML
    ScrollPane labelData;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelTitulo.();


    }

        @FXML
        public void Voltar() throws IOException {

            HelloApplication.setRoot("home-view");
        }
    }


