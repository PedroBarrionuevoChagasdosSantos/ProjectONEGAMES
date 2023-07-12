package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.FIFADAO;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class FIFAController  implements Initializable {

    @FXML
    Label labelTitulo1;
    @FXML
    Label labelTexto1;
    @FXML
    Label labelData1;
    @FXML
    Label labelAutor1;
    @FXML
    Label labelTitulo2;
    @FXML
    Label labelTexto2;
    @FXML
    Label labelData2;
    @FXML
    Label labelAutor2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FIFADAO fifadao = new FIFADAO();
        try {
            String texto1 = fifadao.texto1();

            labelTexto1.setWrapText(true);
            labelTexto1.setText(texto1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String titulo1 = fifadao.titulo1();

            labelTitulo1.setWrapText(true);
            labelTitulo1.setText(titulo1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String data1 = fifadao.data1();

            labelData1.setWrapText(true);
            labelData1.setText(data1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String autor1 = fifadao.autor1();

            labelAutor1.setWrapText(true);
            labelAutor1.setText(autor1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ////////////////////////////////////////////////

        try {
            String titulo2 = fifadao.titulo2();

            labelTitulo2.setWrapText(true);
            labelTitulo2.setText(titulo2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String texto2 = fifadao.texto2();

            labelTexto2.setWrapText(true);
            labelTexto2.setText(texto2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String data2 = fifadao.data2();

            labelData2.setWrapText(true);
            labelData2.setText(data2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String autor2 = fifadao.autor2();

            labelAutor2.setWrapText(true);
            labelAutor2.setText(autor2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


        @FXML
        public void Voltar() throws IOException {
            HelloApplication.setRoot("home-view");
        }
    }

