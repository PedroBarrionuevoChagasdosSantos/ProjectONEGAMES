package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class ValorantController extends Application {


    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Sei la oq aqui vai ter que estar o texto se n aparecer como quebra linha é pq n funcionou" +
                "ent mlhr dar certo pq falta pouco");

        label.setWrapText(true);

        ScrollPane root = new ScrollPane();
        root.getChildrenUnmodifiable().add(label);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Valorant noticias1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }
}


