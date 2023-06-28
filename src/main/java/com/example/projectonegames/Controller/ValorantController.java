package com.example.projectonegames.Controller;

import com.example.projectonegames.ConnectionSingleton;
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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ValorantController implements Initializable {
    //COLOCAR OS fxml QUE TEM NA TELA DO SCENEBUILDER
    @FXML
    TableView<Jogos> tabelaValorant;

    @FXML
    TableColumn<Jogos, Integer> colunaCategoria;

    @FXML
    TableColumn<Jogos, String> colunaNome;

    @FXML
    TableColumn<Jogos, Double> colunaClassificação;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("Categoria"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        colunaClassificação.setCellValueFactory(new PropertyValueFactory<>("Classificação"));

        ValorantDAO valorantDAO = new ValorantDAO();
        try {
            List<Jogos> produtos = valorantDAO.getAll();
            tabelaValorant.getItems().addAll(produtos);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public class VALORANTController {

        @FXML
        public void Voltar() throws IOException {

            HelloApplication.setRoot("home-view");
        }
    }
}


