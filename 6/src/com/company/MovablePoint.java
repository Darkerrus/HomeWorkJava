package com.company;

public class MovablePoint implements Movable{

    private double x;
    private  double y;

    @Override
    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }
}

