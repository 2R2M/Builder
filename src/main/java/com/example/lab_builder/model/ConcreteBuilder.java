package com.example.lab_builder.model;

import javafx.scene.paint.Color;

public class ConcreteBuilder implements Builder {
    private Indicator indicator = new Indicator();

    private float start, stop;
    private int ktemp=0;


    @Override
    public void drawRectBackground(int x, int y, int height, int width) {
        indicator.getRectangle_background().setX(x);
        indicator.getRectangle_background().setY(y);
        indicator.getRectangle_background().setHeight(height);
        indicator.getRectangle_background().setWidth(width);
        indicator.getRectangle_background().setFill(Color.TOMATO);

    }

    @Override
    public void drawRectIndicator(int x, int y, int height, int width) {
        indicator.getRectangle_indicator().setX(x);
        indicator.getRectangle_indicator().setY(y);
        indicator.getRectangle_indicator().setHeight(height);
        indicator.getRectangle_indicator().setWidth(width);
        indicator.getRectangle_indicator().setFill(Color.AQUA);
    }

    @Override
    public void drawStarStopLabel(int x_start, int y_start, String text_start, int x_end, int y_end, String text_end) {
        indicator.getLabel_start().setLayoutX(x_start);
        indicator.getLabel_start().setLayoutY(y_start);
        indicator.getLabel_start().setText(text_start);
        indicator.getLabel_end().setLayoutX(x_end);
        indicator.getLabel_end().setLayoutY(y_end);
        indicator.getLabel_end().setText(text_end);
    }

    @Override
    public void drawTitle(int x_title, int y_title, String text_title) {
        indicator.getLabel_title().setLayoutX(x_title);
        indicator.getLabel_title().setLayoutY(y_title);
        indicator.getLabel_title().setText(text_title);
    }

    public Indicator build() {

        return indicator;

    }
}
