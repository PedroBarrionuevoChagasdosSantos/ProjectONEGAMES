package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.Model.Jogos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogosDAO {

    public List<Jogos> getAll() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select qtdjogados, nomeJogo, nomecategoria  from jogos, categoria ORDER BY qtdjogados DESC;");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Jogos> jogos = new ArrayList<Jogos>();
            while (resultSet.next()) {
                Jogos jogos2 = new Jogos();
                jogos2.nome = resultSet.getString(1);
                jogos2.categoria = resultSet.getString(2);
                jogos2.classificação = resultSet.getInt(3);

                jogos.add(jogos2);
            }
            return jogos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

