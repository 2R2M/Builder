package com.example.lab_builder.model;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;

public class Indicator {
    private Pane panel = new Pane();



    private Rectangle rectangle_background = new Rectangle();

    private Label label_start = new Label();

    public Label getLabel_end() {
        return label_end;
    }

    public void setLabel_end(Label label_end) {
        this.label_end = label_end;
    }

    public Label getLabel_title() {
        return label_title;
    }

    public void setLabel_title(Label label_title) {
        this.label_title = label_title;
    }

    private Label label_end=  new Label();
    private Label label_title= new Label();
    private Rectangle rectangle_indicator = new Rectangle();

    public Rectangle getRectangle_indicator() {
        return rectangle_indicator;
    }

    public void setRectangle_indicator(Rectangle rectangle_indicator) {
        this.rectangle_indicator = rectangle_indicator;
    }

    public Rectangle getRectangle_background() {
        return rectangle_background;
    }

    public void setRectangle_background(Rectangle rectangle_background) {
        this.rectangle_background = rectangle_background;
    }

    public Label getLabel_start() {
        return label_start;
    }

    public void setLabel_start(Label label_start) {
        this.label_start = label_start;
    }


    public Indicator() {
        /*
        rectangle_background.setX(80);
        rectangle_background.setY(80);
        rectangle_background.setHeight(30);
        rectangle_background.setWidth(300);
        rectangle_background.setFill(Color.TOMATO);
        rectangle_indicator.setX(80);
        rectangle_indicator.setY(80);
        rectangle_indicator.setHeight(30);
        rectangle_indicator.setWidth(100);
        rectangle_indicator.setFill(Color.AQUA);
        System.out.println(rectangle_indicator);
        label_start.setLayoutX(80);
        label_start.setLayoutY(110);
        label_start.setText("0");
        label_end.setLayoutX(300);
        label_end.setLayoutY(110);
        label_end.setText("100");
*/


    }

    public void add(Pane pane){

        panel.getChildren().add(pane);


    }

    public void show(Pane pane) {

        pane.getChildren().add(panel);
        pane.getChildren().add(rectangle_background);
        pane.getChildren().add(rectangle_indicator);
        pane.getChildren().add(label_start);
        pane.getChildren().add(label_end);
        pane.getChildren().add(label_title);

        // pane.getChildren().add(label_title);
      //  pane.getChildren().add(label_start);
      //  pane.getChildren().add(label_end);
    }


}
