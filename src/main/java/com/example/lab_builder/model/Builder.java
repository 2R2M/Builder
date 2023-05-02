package com.example.lab_builder.model;

public interface Builder
{

    void drawRectBackground(int x, int y, int height, int widht);


    void drawRectIndicator(int x, int y, int height, int width);

    void drawStarStopLabel(int x_start, int y_start, String text_start, int x_end, int y_end, String text_end);

    void drawTitle(int x_title, int y_title, String text_title);

    public Indicator build();
}
