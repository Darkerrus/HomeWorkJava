package com.company;

class MovableCircle extends Shape implements Movable {
    protected double radius;
    private double x;
    private  double y;

    MovableCircle() {
    }

    MovableCircle(double radius) {
        this.radius = radius;
    }

    MovableCircle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }

    public double gerPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public String ToString() {
        return this.color != null ? "radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled : "radius: " + this.radius;
    }


    @Override
    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
        System.out.println("x = " + x + ", y = " + y);
    }
}
