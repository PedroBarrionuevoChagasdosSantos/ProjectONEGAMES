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
            String texto1 = valorantDAO.valorant1();

            labelTexto.setWrapText(true);
            labelTexto.setText(texto1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            String titulo1 = valorantDAO.titulo1();

            labelTitulo.setWrapText(true);
            labelTitulo.setText(titulo1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String data1 = valorantDAO.data1();

            labelData.setWrapText(true);
            labelData.setText(data1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String titulo2 = valorantDAO.titulo1();

            labelTitulo.setWrapText(true);
            labelTitulo.setText(titulo2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }










    }


    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}
