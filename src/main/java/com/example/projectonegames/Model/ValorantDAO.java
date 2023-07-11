package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValorantDAO {
    public String valorant() throws SQLException {

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement("select texto from noticias where Noticias_id =  1;");
             ResultSet resultSet = preparedStatement.executeQuery()) {
                resultSet.next();

            String texto = resultSet.getString(1);

            return texto;
        }
    }
}

