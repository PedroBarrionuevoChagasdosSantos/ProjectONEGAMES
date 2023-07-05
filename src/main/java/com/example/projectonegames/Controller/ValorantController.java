package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    TableView<Jogos> tabelaValorant;

    @FXML
    TableColumn<Jogos, String> colunaTitulo;

    @FXML
    TableColumn<Jogos, String> colunaTexto;

    @FXML
    TableColumn<Jogos, Double> colunaData;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colunaTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colunaTexto.setCellValueFactory(new PropertyValueFactory<>("texto"));
        colunaData.setCellValueFactory(new PropertyValueFactory<>("data"));

        ValorantDAO valorantDAO = new ValorantDAO();
        try {
            List<Jogos> jogosvalorant = valorantDAO.Valorant();
            tabelaValorant.getItems().addAll(jogosvalorant);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        @FXML
        public void Voltar() throws IOException {

            HelloApplication.setRoot("home-view");
        }
    }


