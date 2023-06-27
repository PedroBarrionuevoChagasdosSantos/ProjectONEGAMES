package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import javafx.fxml.FXML;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VALORANTController {

    @FXML
    public void Voltar() throws IOException {

        HelloApplication.setRoot("home-view");
    }

        public void noticias() throws SQLException {
            Connection connection = DriverManager.getConnection( //
                    "jdbc:mysql://localhost:3306/onegames", //
                    "root", //
                    "");


           String sql =  "select Titulo AS titulo, Texto AS Texto, Autor AS Autor from noticias order by Jogos_Jogos_id ASC;";

            ResultSet resultado = connection.createStatement().executeQuery(sql);

    }

}
