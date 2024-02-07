package com.example.gitar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class ElectricController {

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;


    @FXML
    public void initialize() {
        one.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric1.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });

        two.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric2.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });

        three.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric3.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });


        four.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric3.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });


        five.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric3.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });

        six.setOnAction(actionEvent -> {
            String pathMusic = Application.class.getResource("electric3.mp3").getPath();
            Media media = new Media(new File(pathMusic).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        });
    }
}
