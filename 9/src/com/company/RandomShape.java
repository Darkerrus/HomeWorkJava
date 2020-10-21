package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomShape extends Shape {

    @Override
    public void addPoint(Point point) {
        super.addPoint(point);
    }

    @Override
    public Point getLastPoint() {
        return super.getLastPoint();
    }

    @Override
    public ArrayList<Point> getPoints() {
        return super.getPoints();
    }

    @Override
    public void setColor(String color) {
        super.color = color;
    }

    /*public Color getRandColor()
    {
        return Color.format("#%06x", new Random().nextInt(0xffffff + 1));
    }*/

    @Override
    public void Clear() {
        super.Clear();
    }

    @Override
    public String getColor() {
        return super.color;
    }
}
