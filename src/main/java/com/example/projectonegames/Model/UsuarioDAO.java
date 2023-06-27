package com.example.projectonegames.Model;

import com.example.projectonegames.Model.Usuario;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        }
        else{
            return  false;
        }
    }

}