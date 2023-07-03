package com.example.projectonegames.Model;

import com.example.projectonegames.ConnectionSingleton;
import com.example.projectonegames.Model.Usuario;

import java.io.IOException;
import java.sql.*;

public class UsuarioDAO {

    public boolean existe(Usuario usuario) throws SQLException, IOException {

        //connection do banco de dados para vereficar usuario.
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/onegames", //
                "root", //
                "");


        String sql = "select count(*) from usuario " //
                + "where Nome = '" + usuario.usuario + "' " //
                + "AND Senha = '" + usuario.senha + "'";

        ResultSet resultado = connection.createStatement().executeQuery(sql);
        resultado.next();
        int quantidadeUsuarios = resultado.getInt(1);

        if (quantidadeUsuarios > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean novousuario(Usuario novousuario) throws SQLException, IOException {

        String sql = "insert into tbcliente(Usuario, Senha) values (?,?);";

        try (PreparedStatement preparedStatement = ConnectionSingleton.getConnection().prepareStatement(sql);){
            preparedStatement.setString(1, novousuario.usuario);
            preparedStatement.setString(2, novousuario.senha);


            try(ResultSet resultado = preparedStatement.executeQuery();){
                resultado.next();
                int quantidadeUsuarios = resultado.getInt(1);

                if (quantidadeUsuarios > 0) {
                    return true;
                }
                else{
                    return  false;
                }
            }
        }
    }


}