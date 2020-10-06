package com.company;

import java.util.ArrayList;

public class Circle extends Shape {

    @Override
    public void setColor(String color) {
        super.color = color;
    }

    @Override
    public String getColor() {
        return super.color;
    }

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
}
