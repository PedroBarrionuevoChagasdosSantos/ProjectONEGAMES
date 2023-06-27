package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.Model.Jogos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogosDAO {

        public List<Jogos> getAll() throws SQLException {

            try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select nomeJogo, qtdjogados from jogos ORDER BY qtdjogados DESC;");
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                List<Jogos> jogos = new ArrayList<Jogos>();
                while (resultSet.next()) {
                    Jogos jogos2 = new Jogos();
                    jogos2.nome = resultSet.getString(1);
                    jogos2.categoria = resultSet.getString(2);
                    // produto.preco = resultSet.getInt(3);
                    jogos.add(jogos2);
                }
                return jogos;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


//            public void maisjogados (Jogos jogos) throws SQLException {
//
//                String sql = "select nomeJogo, qtdjogados from jogos ORDER BY qtdjogados DESC;";
//                try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql)) {
////            preparedStatement.setInt(1, novoProduto.codigo);
//                    preparedStatement.setString(1, jogos.nome);
//                    preparedStatement.setDouble(2, jogos.classificação);
//
//                    preparedStatement.execute();
//                }
//            }
        }
    }

    //public List<Jogos> getAll() {

        //return maisjogados();



//}

//"select nomeJogo, qtdjogados from jogos ORDER BY qtdjogados DESC;"