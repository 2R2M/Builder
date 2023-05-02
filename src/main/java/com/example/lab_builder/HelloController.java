package com.example.lab_builder;

import com.example.lab_builder.model.ConcreteBuilder;
import com.example.lab_builder.model.Director;
import com.example.lab_builder.model.Indicator;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class HelloController {
    public Pane MyPane;
    public TextField timeField;
    @FXML
    private Label welcomeText;
    private Timeline timeline;
    private LocalTime targetTime;
    private LocalTime currentTime;
    private LocalTime startTime;
    private Duration tempDuration;
    double growth;
    double tempWidght;
    @FXML
    Director director = new Director();
    ConcreteBuilder builder = new ConcreteBuilder();

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void setFill(ActionEvent actionEvent) {

        director.construct(builder).show(MyPane);

    }

    public void Start(ActionEvent actionEvent) {
        LocalTime tempTime = LocalTime.parse(timeField.getText());
        targetTime = LocalTime.now().plusHours(tempTime.getHour()).plusMinutes(tempTime.getMinute()).plusSeconds(tempTime.getSecond());
        System.out.println(targetTime);
        MyPane.getChildren().clear();
        startTimer();
    }

    private void startTimer() {
        startTime = LocalTime.now();
        tempDuration = Duration.millis(startTime.until(targetTime, ChronoUnit.SECONDS));
        growth = 300.0/tempDuration.toMillis();
        System.out.println(tempDuration.toMillis());
        System.out.println(growth);
        tempWidght = 0;
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            currentTime = LocalTime.now();
            System.out.println(tempWidght);
            if (currentTime.compareTo(targetTime) >= 0) {
                stopTimer();
                System.out.println("stop");
            } else {
                Duration duration = Duration.millis(currentTime.until(targetTime, ChronoUnit.SECONDS));
                long seconds = (long) duration.toSeconds();
                MyPane.getChildren().clear();
                System.out.println(duration);
                tempWidght += growth;
                System.out.println(tempWidght);
                director.construct(builder,tempWidght).show(MyPane);
            }
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void stopTimer() {
        if (timeline != null) {
            timeline.stop();
        }
    }
}