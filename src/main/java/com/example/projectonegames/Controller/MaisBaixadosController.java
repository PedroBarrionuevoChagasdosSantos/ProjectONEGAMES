package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MaisBaixadosController implements Initializable {

        @FXML
        TableView<Jogos> tabelaMaisBaixados;

        @FXML
        TableColumn<Jogos, String> colunaClassificação;

        @FXML
        TableColumn<Jogos, String> colunaNome;

        @FXML
        TableColumn<Jogos, String> colunaCategoria;


        public void initialize(URL url, ResourceBundle resourceBundle) {

            colunaClassificação.setCellValueFactory(new PropertyValueFactory<>("Classificação"));
            colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));

//            Jogos valorant = new Jogos();
//            valorant.classificação = 1;
//            valorant.nome = "Valorant";
//            valorant.categoria = "FPS";
//
//            Jogos gta = new Jogos();
//            gta.classificação = 2;
//            gta.nome = "GTA";
//            gta.categoria = "Ação-Aventura";
//
//
//            Jogos godofwar = new Jogos();
//            godofwar.classificação = 3;
//            godofwar.nome = "God of War: Ragnarok";
//            godofwar.categoria = "Ação-Aventura";
//
//
//            Jogos fifa = new Jogos();
//            fifa.classificação = 4;
//            fifa.nome = "FIFA 23";
//            fifa.categoria = "Esporte";
//
//            Jogos minecraft = new Jogos();
//            minecraft.classificação = 5;
//            minecraft.nome = "Minecraft";
//            minecraft.categoria = "Sobrevevivencia";
//
//
//            tabelaMaisBaixados.getItems().add(valorant);
//            tabelaMaisBaixados.getItems().add(gta);
//            tabelaMaisBaixados.getItems().add(godofwar);
//            tabelaMaisBaixados.getItems().add(fifa);
//            tabelaMaisBaixados.getItems().add(minecraft);

        }

        @FXML
        public void Voltar() {

            HelloApplication.closeCurrentWindow();
        }

    }
