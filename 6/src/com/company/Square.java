package com.company;

import java.awt.*;

public class Square extends MovableRectangle {
    private double side;

    Square() {
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String ToString() {
        return this.color != null ? "side:" + this.side + ", color: " + this.color + ", filled: " + this.filled : "side: " + this.side;
    }
}
