package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ValorantController implements Initializable {

    @FXML
    Label labelTexto;
    @FXML
    Label labelTitulo;
    @FXML
    Label labelData;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ValorantDAO valorantDAO = new ValorantDAO();
        try {
            String texto = valorantDAO.valorant1();

            labelTexto.setWrapText(true);
            labelTexto.setText(texto);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            String titulo = valorantDAO.titulo1();

            labelTitulo.setWrapText(true);
            labelTitulo.setText(titulo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String data = valorantDAO.data1();

            labelData.setWrapText(true);
            labelData.setText(data);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String titulo = valorantDAO.titulo1();

            labelTitulo.setWrapText(true);
            labelTitulo.setText(titulo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }










    }


    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}
