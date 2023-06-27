package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import com.example.projectonegames.Model.JogosDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class JogosMaisJogadosModalController implements Initializable {

    @FXML
    TableView<Jogos> tabelaJogosmaisjogados;

    @FXML
    TableColumn<Jogos, String> colunaClassificação;

    @FXML
    TableColumn<Jogos, String> colunaNome;

    @FXML
    TableColumn<Jogos, String> colunaCategoria;


    public void initialize(URL url, ResourceBundle resourceBundle) {

        colunaClassificação.setCellValueFactory(new PropertyValueFactory<>("Classificação"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("Categoria"));

        JogosDAO jogosDAO = new JogosDAO();
        try {
            List<Jogos> jogos = jogosDAO.getAll();
            tabelaJogosmaisjogados.getItems().addAll(jogos);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        @FXML
        public void Voltar() {
            HelloApplication.closeCurrentWindow();
        }

    }



