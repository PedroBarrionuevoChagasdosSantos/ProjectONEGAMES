package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import com.example.projectonegames.Model.ValorantDAO;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class ValorantController extends Application implements Initializable {

    @FXML
    Label labelTexto;


    public void start(Stage stage) {
//        String text = "comforts of their drawing rooms fseawdasd awdasdwad awsdwdasdawd asdwadasdqweqwe dasdvcvxcv wqrtjjghfg ";
//
//        Label label = new Label(text);
//        System.out.println(text);
//
//        label.setWrapText(true);
//        //Setting the alignment to the label
//        label.setTextAlignment(TextAlignment.JUSTIFY);
//        //Setting the maximum width of the label
//        label.setMaxWidth(200);
//        //Setting the position of the label
//        label.setTranslateX(25);
//        label.setTranslateY(25);
//        Group root = new Group();
//        root.getChildren().add(label);
//        //Setting the stage
//        Scene scene = new Scene(root, 595, 150, Color.BEIGE);
//        stage.setTitle("Onegames");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }


    @FXML
    public void Voltar() throws IOException {
        HelloApplication.setRoot("home-view");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Label label = new Label();

        try (Connection valorantnoticia = DriverManager.getConnection("jdbc:mysql://localhost:3306/onegames", //
                "root", //
                "");
             PreparedStatement stmt = valorantnoticia.prepareStatement("select texto from noticias where Noticias_id =  1;")) {

            labelTexto.getText().equals(valorantnoticia);
            System.out.println(label);


            label.setWrapText(true);
            //Setting the alignment to the label
            label.setTextAlignment(TextAlignment.JUSTIFY);
            //Setting the maximum width of the label
            label.setMaxWidth(200);
            //Setting the position of the label
            label.setTranslateX(25);
            label.setTranslateY(25);
            Group root = new Group();
            root.getChildren().add(label);
            //Setting the stage

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
