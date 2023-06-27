module com.example.projectonegames {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.projectonegames to javafx.fxml;
    exports com.example.projectonegames;
    exports com.example.projectonegames.Controller;
    opens com.example.projectonegames.Controller to javafx.fxml;
    exports com.example.projectonegames.Model;
    opens com.example.projectonegames.Model to javafx.fxml;
}