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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ValorantDAO valorantDAO = new ValorantDAO();
        try {
            String texto = valorantDAO.valorant();

            labelTexto.setWrapText(true);
            labelTexto.setText(texto);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        }


    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}
