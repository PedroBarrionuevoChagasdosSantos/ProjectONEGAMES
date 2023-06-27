package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Usuario;
import com.example.projectonegames.Model.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {

    @FXML
    TextField usuariofield;
    @FXML
    PasswordField senhafield;
    @FXML
    Label labelencorreto;

    @FXML
    public void entrar() throws IOException, SQLException {
        //parte que verefica o usuario e senha...
        Usuario usuariologin  = new Usuario();
        usuariologin.usuario =  usuariofield.getText();
        usuariologin.senha = senhafield.getText();
        boolean usuarioexiste = new UsuarioDAO().existe(usuariologin);

        //se o usuario estiver certo abre a tela principal...
        if (usuarioexiste) {
            System.out.println("Entrando...");
            HelloApplication.setRoot("home-view");
        }
        //se não estiver certo ele amostra uma mensagem dizendo que algo esta incorreto...
        else {
            labelencorreto.setText("Usuario ou senha incorretos");
            System.out.println("Usuario ou senha incorretos!!");
        }

    }
    }
