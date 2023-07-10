package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

    public class  NovousuariomodalController implements Initializable {

        @FXML
        TextField usuariofield;
        @FXML
        PasswordField senhafield;


        public static Usuario usuario;

        public void cadastrar(){

            Usuario novousuario = new Usuario();

            novousuario.usuario = usuariofield.getText();
            novousuario.senha = senhafield.getText();
            if (!usuariofield.getText().isEmpty() && !senhafield.getText().isEmpty()){
                usuario = novousuario;
                HelloApplication.closeCurrentWindow();
            }

            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Erro!");
                alert.setHeaderText(null);
                alert.setContentText("Um ou mais campos vazios. Todos os campos com * devem ser preenchidos corretamente");

                alert.showAndWait();
            }
        }
        @FXML
        public void Cancelar() {
            HelloApplication.closeCurrentWindow();
        }

        public void initialize(URL url, ResourceBundle resourceBundle) {
            Usuario usuariocriado = NovousuariomodalController.usuario;

            if (usuariocriado != null){
                usuariofield.setText(usuariocriado.usuario);
                senhafield.setText(usuariocriado.senha);
            }

        }

}
