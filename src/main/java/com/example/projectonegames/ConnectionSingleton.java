package com.example.projectonegames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {

        if (connection == null) {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/onegames", //
                    "root", //
                    "");
        }
        return connection;
    }
}
