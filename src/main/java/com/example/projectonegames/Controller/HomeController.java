package com.example.projectonegames.Controller;

import com.example.projectonegames.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;

import java.io.IOException;

import static com.example.projectonegames.HelloApplication.setRoot;

public class HomeController {

        @FXML
        public void jogosmaisjogados() throws IOException {

            HelloApplication.showModal("jogosmaisjogados-modal-view");
        }

        @FXML
        public void jogoscommelhoresavaliações() throws IOException {
            HelloApplication.showModal("melhoresavaliações-modal-view");
        }

        @FXML
        public void jogosmaisbaixados() throws IOException {
            HelloApplication.showModal("maisbaixados-view");
        }

        public void valorant() throws IOException {
            HelloApplication.setRoot("valorant-view");
        }

        public void fifa() throws IOException {
            HelloApplication.setRoot("FIFA-view");
        }

        public void csgo() throws IOException {
            HelloApplication.setRoot("CSGO-view");
        }

        @FXML
        public void sairparalogin() throws  IOException{
            HelloApplication.setRoot("hello-view");
        }

}
