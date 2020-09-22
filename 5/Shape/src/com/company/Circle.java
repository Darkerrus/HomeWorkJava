package com.company;

public class Circle extends Shape {

    protected double radius;
    Circle(){};
    Circle(double radius)
    {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double gerPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String ToString() {
        if(color != null)
            return "radius: " + radius + ", color: " + color + ", filled: " + filled;
        else return "radius: " + radius;
    }
}
