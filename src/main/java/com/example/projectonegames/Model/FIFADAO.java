package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FIFADAO {

    public String titulo1() throws SQLException {

        try(PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Titulo from noticias where Noticias_id =  5;");
            ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String titulo = resultSet.getString(1);

            return titulo;
        }
    }

    public String texto1() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select texto from noticias where Noticias_id =  5;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String texto = resultSet.getString(1);

            return texto;
        }
    }

    public String data1() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Data from noticias where Noticias_id =  5;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String data = resultSet.getString(1);

            return data;
        }
    }

    public String autor1() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Autor from noticias where Noticias_id =  5;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String autor = resultSet.getString(1);

            return autor;
        }
    }
    //////////////////////////////////////////////////////////

    public String titulo2() throws SQLException {

        try(PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Titulo from noticias where Noticias_id =  6;");
            ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String titulo = resultSet.getString(1);

            return titulo;
        }
    }

    public String texto2() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select texto from noticias where Noticias_id =  6;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String texto = resultSet.getString(1);

            return texto;
        }
    }

    public String data2() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Data from noticias where Noticias_id =  6;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String data = resultSet.getString(1);

            return data;
        }
    }

    public String autor2() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select Autor from noticias where Noticias_id = 6;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
            resultSet.next();

            String autor = resultSet.getString(1);

            return autor;
        }
    }

}
