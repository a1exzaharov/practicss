module com.example.gitar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.gitar to javafx.fxml;
    exports com.example.gitar;
}