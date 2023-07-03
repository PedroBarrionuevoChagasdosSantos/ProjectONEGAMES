package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogosDAO {

    public List<Jogos> getAll() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select qtdjogados, nomeJogo, nomecategoria  from jogos, categoria ORDER BY qtdjogados DESC;");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Jogos> jogosmaisjogados = new ArrayList<Jogos>();
            while (resultSet.next()) {
                Jogos jogosmaisjogados1 = new Jogos();
                jogosmaisjogados1.nome = resultSet.getString(1);
                jogosmaisjogados1.categoria = resultSet.getString(2);
                jogosmaisjogados1.classificação = resultSet.getInt(3);

                jogosmaisjogados.add(jogosmaisjogados1);
            }
            return jogosmaisjogados;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

