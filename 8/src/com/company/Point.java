package com.company;

public class Point {
    private double x;
    private double y;
    private int xc;
    private int yc;
    private int r;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(int xc, int yc, int r)
    {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public int getXc() {
        return xc;
    }

    public int getYc() {
        return yc;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
