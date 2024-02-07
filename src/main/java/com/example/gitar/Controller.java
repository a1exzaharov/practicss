package com.example.gitar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


import java.io.File;
import java.io.IOException;

public class Controller {
    @FXML
    private Button electric;

    @FXML
    private Button bass;




    @FXML
    public void initialize() {
        electric.setOnAction(actionEvent -> {
            Handle(actionEvent, "electric_gitar.fxml");
        });


        bass.setOnAction(actionEvent -> {
            Handle(actionEvent, "bass_gitar.fxml");
        });
    }

    private static void Handle(ActionEvent actionEvent, String path) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Application.class.getResource(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root, 450, 450));
        stage.show();
        // Hide this current window (if this is what you want)
        ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
    }

}