package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JogosDAO {

    public List<Jogos> getAll() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select qtdjogados ,nomeJogo, nomecategoria from jogos\n" +
                "left join categoria on jogos.Categoria_categoria_id = categoria.categoria_id \n" +
                "order by qtdjogados desc;");

             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Jogos> jogosmaisjogados = new ArrayList<Jogos>();
            while (resultSet.next()) {
                Jogos jogosmaisjogados1 = new Jogos();
                jogosmaisjogados1.classificação = resultSet.getInt(1);
                jogosmaisjogados1.nome = resultSet.getString(2);
                jogosmaisjogados1.categoria = resultSet.getString(3);

                jogosmaisjogados.add(jogosmaisjogados1);
            }
            return jogosmaisjogados;
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    public List<Jogos> melhoresavaliacoes() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select mediaavaliacoes ,nomeJogo, nomecategoria from jogos\n" +
                "left join categoria on jogos.Categoria_categoria_id = categoria.categoria_id \n" +
                "order by mediaavaliacoes desc;");

             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Jogos> melhoresavaliacoes = new ArrayList<Jogos>();
            while (resultSet.next()) {
                Jogos melhoresavaliacoes1 = new Jogos();
                melhoresavaliacoes1.mediaavaliacoes = resultSet.getInt(1);
                melhoresavaliacoes1.nome = resultSet.getString(2);
                melhoresavaliacoes1.categoria = resultSet.getString(3);

                melhoresavaliacoes.add(melhoresavaliacoes1);
            }
            return melhoresavaliacoes;
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    public List<Jogos> maisbaixados() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select qtdbaixados ,nomeJogo, nomecategoria from jogos\n" +
                "left join categoria on jogos.Categoria_categoria_id = categoria.categoria_id \n" +
                "order by qtdbaixados desc;");

             ResultSet resultSet = preparedStatement.executeQuery()) {

            List<Jogos> maisbaixados = new ArrayList<Jogos>();
            while (resultSet.next()) {
                Jogos maisbaixados1 = new Jogos();
                maisbaixados1.maisbaixados = resultSet.getInt(1);
                maisbaixados1.nome = resultSet.getString(2);
                maisbaixados1.categoria = resultSet.getString(3);

                maisbaixados.add(maisbaixados1);
            }
            return maisbaixados;
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }

    }




