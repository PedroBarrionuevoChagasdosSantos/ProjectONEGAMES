package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean existe(Usuario usuario) throws SQLException, IOException {

<<<<<<< Updated upstream

        String sql = "select count(*) from usuario where Nome = ? AND Senha = ?";
=======
         String sql = "select count(*) from usuario where Usuario = ? AND Senha = ?";
>>>>>>> Stashed changes

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql);) {
            preparedStatement.setString(1, usuario.usuario);
            preparedStatement.setString(2, usuario.senha);


            try (ResultSet resultado = preparedStatement.executeQuery();) {
                resultado.next();
                int quantidadeUsuarios = resultado.getInt(1);

                if (quantidadeUsuarios > 0) {
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }


<<<<<<< Updated upstream
        public boolean novousuario(Usuario novousuario1) throws SQLException {

            String sql = "INSERT INTO onegames.usuario (Nome, Senha) VALUES (?,?);";

            try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql);) {
                preparedStatement.setString(1, novousuario1.usuario);
                preparedStatement.setString(2, novousuario1.senha);


                try (ResultSet resultado = preparedStatement.executeQuery();) {
                    resultado.next();
                    int quantidadeUsuarios = resultado.getInt(1);

                }
            }
            return false;
        }
=======
//        public boolean novousuario(Usuario novousuario1) throws SQLException {
//
//            String sql = "insert into usuario( Usuario_id,Nome, Senha) values (?,?,?);";
//
//            try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql);) {
//                preparedStatement.setInt(1, novousuario1.codigo);
//                preparedStatement.setString(2, novousuario1.usuario);
//                preparedStatement.setString(3, novousuario1.senha);
//
//
//                try (ResultSet resultado = preparedStatement.executeQuery();) {
//                    resultado.next();
//                    int quantidadeUsuarios = resultado.getInt(1);
//
//
//                }
//            }
//            return false;
//        }
>>>>>>> Stashed changes
    }