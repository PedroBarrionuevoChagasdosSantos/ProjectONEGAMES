package com.example.projectonegames.Controller;

import com.example.projectonegames.Model.Jogos;
import com.example.projectonegames.Model.JogosDAO;
import com.example.projectonegames.Model.Usuario;
import com.example.projectonegames.Model.UsuarioDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

    public class  NovousuariomodalController implements Initializable {

        @FXML
        TextField usuariofield;
        @FXML
        PasswordField senhafield;

        public void initialize(URL url, ResourceBundle resourceBundle) {


        }
}
