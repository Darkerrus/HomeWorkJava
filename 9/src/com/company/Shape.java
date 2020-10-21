package com.company;

import java.awt.*;
import java.util.ArrayList;

public abstract class Shape {
    protected ArrayList<Point> points;
    protected String color;

    public abstract void setColor(String color);
    public abstract String getColor();

    public Shape() { this.points = new ArrayList<Point>();}
    public void addPoint (Point point)
    {
        points.add(point);
    }
    public  Point getLastPoint()
    {
        return points.get(points.size()-1);
    }
    public  ArrayList<Point> getPoints()
    {
        return points;
    }
    public void Clear()
    {
        points.clear();
    }

}
