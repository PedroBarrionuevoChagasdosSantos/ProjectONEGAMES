package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

    public boolean existe(Usuario usuario) throws SQLException, IOException {


        String sql = "select count(*) from usuario where Nome = ? AND Senha = ?";


        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql);) {
            preparedStatement.setString(1, usuario.usuario);
            preparedStatement.setString(2, usuario.senha);


            try (ResultSet resultado = preparedStatement.executeQuery();) {
                resultado.next();
                int quantidadeUsuarios = resultado.getInt(1);

                if (quantidadeUsuarios > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


    public void novousuario(Usuario novousuario) throws SQLException {

        String sql = "INSERT INTO onegames.usuario (Nome, Senha) VALUES (?,?);";
        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, novousuario.usuario);
            preparedStatement.setString(2, novousuario.senha);
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys();) {
                resultSet.next();
                novousuario.codigo = resultSet.getInt(1);

            }
        }
    }
}
