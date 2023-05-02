package com.example.lab_builder.model;

public class Director {
    public Indicator construct(ConcreteBuilder builder)
    {
        builder.drawRectBackground(80,80, 30, 300);
        builder.drawRectIndicator(80, 80, 30, 100);
        builder.drawStarStopLabel(80, 110, "0", 380, 110, "100");
        builder.drawTitle(230, 40, "Индикатор");
        return builder.build();
    }
    public Indicator construct(ConcreteBuilder builder, double width_indicator)
    {
        builder.drawRectBackground(80,80, 30, 300);
        builder.drawRectIndicator(80, 80, 30, (int) width_indicator);
        builder.drawStarStopLabel(80, 110, "0", 380, 110, "100");
        builder.drawTitle(230, 40, "Индикатор");
        return builder.build();
    }

     /*rectangle_background.setY(80);
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
        label_end.setText("100");*/

}
