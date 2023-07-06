package com.example.projectonegames.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;


public class ValorantController implements Initializable, ValorantController1 {
    //COLOCAR OS fxml QUE TEM NA TELA DO SCENEBUILDER

    @FXML
    ScrollPane labelTitulo;

    @FXML
    ScrollPane labelTexto;

    @FXML
    ScrollPane labelData;


    public void initialize(URL url, ResourceBundle resourceBundle) {

        public void start (Stage Stage stage;
        stage){
            Scene scene = new Scene(new Group());
            stage.setTitle("Label Sample");
            stage.setWidth(400);
            stage.setHeight(180);

            HBox hbox = new HBox();

            Label label1 = new Label("Search long long long long long long long long long ");
            label1.setPrefWidth(100);
            label1.setWrapText(true);

            hbox.setSpacing(10);
            hbox.getChildren().add((label1));
            ((Group) scene.getRoot()).getChildren().add(hbox);

            stage.setScene(scene);
            stage.show();
        }

    }
}


