package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.HelloApplication;
import javafx.fxml.FXML;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ValorantDAO {

    public List<Jogos> getAll() throws SQLException {

        try(PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Titulo AS titulo, Texto AS Texto, Autor AS Autor from noticias order by Jogos_Jogos_id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery()){

            List<Jogos> jogos = new ArrayList<>();
            while (resultSet.next()){
                Jogos jogo = new Jogos();
                jogo.classificação = resultSet.getInt(1);
                jogo.nome = resultSet.getString(2);
                jogo.categoria = resultSet.getString(3);
                jogos.add(jogo);
            }
            return jogos;
        }
    }
    @FXML
    public void Voltar() throws IOException {

        HelloApplication.setRoot("home-view");
    }



}
