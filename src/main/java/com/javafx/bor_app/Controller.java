package com.javafx.bor_app;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {


    @FXML
    private Pane pane;
    @FXML
    private Label songLabel;
    @FXML
    private Button playButton, pauseButton, resetButton, previousButton, nextButton;
    @FXML
    private ComboBox<String> speedBox;
    @FXML
    Slider volumeSlider;
    @FXML
    private ProgressBar songProgressBar;
    private Media media;
    private MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private int songNumber;
    private final int[] speeds = {25,50,75,100,125,150,175,200};

    private Timer timer;
    private TimerTask task;
    private boolean running;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs = new ArrayList<File>();

        directory = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/bor_app/music");

        files = directory.listFiles();

        if(files != null){
            for (File file : files ) {
                songs.add(file);
                System.out.println(file);
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        songLabel.setText(songs.get(songNumber).getName());

        for (int i = 0; i < speeds.length; i++) {
            speedBox.getItems().add(Integer.toString(speeds[i]) + "%" );
        }
        speedBox.setOnAction(this::changeSpeed);

        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                 mediaPlayer.setVolume(volumeSlider.getValue() * 0.01);
            }
        });
    }

    public void playMedia(){
        beginTimer();
        changeSpeed(null);
        mediaPlayer.play();
    }
    public void pauseMedia(){
        cancelTimer();
        mediaPlayer.pause();
    }
    public void resetMedia(){
        songProgressBar.setProgress(0);
        mediaPlayer.seek(Duration.seconds(0.0));
    }
    public void nextMedia() throws MalformedURLException {
        if(songNumber < songs.size() - 1){
            songNumber++;
            mediaPlayer.stop();
            if(running){
                cancelTimer();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            mediaPlayer.play();
        }else {
            songNumber = 0;
            mediaPlayer.stop();
            if(running){
                cancelTimer();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            mediaPlayer.play();
        }
    }
    public void previousMedia(){
        if(songNumber >  0){
            songNumber--;
            mediaPlayer.stop();

            if(running){
                cancelTimer();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            mediaPlayer.play();
        }else {
            songNumber = songs.size() - 1;
            mediaPlayer.stop();
            if(running){
                cancelTimer();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songLabel.setText(songs.get(songNumber).getName());
            mediaPlayer.play();
        }
    }

    public void changeSpeed(ActionEvent event){

        if(speedBox.getValue() == null){
            mediaPlayer.setRate(1);
        }else {
            // mediaPlayer.setRate(Integer.parseInt(speedBox.getValue()) * 0.01);
            mediaPlayer.setRate(Integer.parseInt(speedBox.getValue().substring(0,speedBox.getValue().length() -1 )) * 0.01);
        }
    }

    public void beginTimer(){
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                   running = true;
                   double current = mediaPlayer.getCurrentTime().toSeconds();
                   double end = media.getDuration().toSeconds();
                   songProgressBar.setProgress(current/end);

                   if(current/end == 1){
                       cancelTimer();
                   }
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000);
        running = false;
        timer.cancel();;
    }
    public void cancelTimer(){}
}