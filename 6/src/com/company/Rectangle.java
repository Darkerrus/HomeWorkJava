package com.company;

class MovableRectangle extends Shape implements Movable {
    protected double width;
    protected double length;
    private double x;
    private double y;

    MovableRectangle() {
    }

    MovableRectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    MovableRectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double gerPerimeter() {
        return (this.length + this.width) * 2.0D;
    }

    public String ToString() {
        return this.color != null ? "width: " + this.width + ", length: " + this.length + ", color: " + this.color + ", filled: " + this.filled : "width: " + this.width + ", length: " + this.length;
    }


    @Override
    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
        System.out.println("x = " + x + ", y = " + y);
    }
}
