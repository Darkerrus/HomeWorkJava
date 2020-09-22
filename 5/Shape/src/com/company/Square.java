package com.company;

public class Square<color> extends  Rectangle {
    private double side;
    Square(){}
    Square(double side)
    {
        this.side = side;
    }
    Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String ToString() {
        if(color != null)
            return "side:" + side + ", color: " + color + ", filled: " + filled;
        else
            return "side: " + side;
    }
}
