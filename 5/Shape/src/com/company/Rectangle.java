package com.company;

public class Rectangle extends Shape {

    protected double width;
    protected double length;
    Rectangle(){};
    Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double gerPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String ToString() {
        if (color != null)
            return "width: " + width + ", length: " + length + ", color: " + color + ", filled: " + filled;
        else return "width: " + width + ", length: " + length;
    }
}
