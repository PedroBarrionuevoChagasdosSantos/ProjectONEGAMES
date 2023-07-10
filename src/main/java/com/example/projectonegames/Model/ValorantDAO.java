package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ValorantDAO {
    public static Jogos Valorant() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select texto from noticias where Noticias_id =  1;");
             ResultSet resultSet = preparedStatement.executeQuery()) {

        }
        return null;
    }
}

