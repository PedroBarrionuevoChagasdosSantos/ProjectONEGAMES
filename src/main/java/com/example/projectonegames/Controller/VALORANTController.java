package com.example.projectonegames.Controller;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Jogos;
import javafx.fxml.FXML;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public List<Jogos> getAll() throws SQLException {

        try(PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Titulo AS titulo, Texto AS Texto, Autor AS Autor from noticias order by Jogos_Jogos_id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery()){

            List<Jogos> jogos = new ArrayList<>();
            while (resultSet.next()){
                Jogos jogos = new Jogos();
                jogos.classificação = resultSet.getInt(1);
                jogos.nome = resultSet.getString(2);
                jogos.categoria = resultSet.getString(3);
                jogos.add(jogos);
            }
            return jogos;
        }
    }

}
