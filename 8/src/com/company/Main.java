package com.company;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        Point p1 = new Point(50,50);
        Point p2 = new Point(100,50);
        Point p3 = new Point(100,100);
        Point p4 = new Point(50,100);
        square.addPoint(p1);
        square.addPoint(p2);
        square.addPoint(p3);
        square.addPoint(p4);
        square.setColor("#00ff80");

        Rectangle rectangle = new Rectangle();
        Point p5 = new Point(150,25);
        Point p6 = new Point(150,50);
        Point p7 = new Point(200,50);
        Point p8 = new Point(200,25);
        rectangle.addPoint(p5);
        rectangle.addPoint(p6);
        rectangle.addPoint(p7);
        rectangle.addPoint(p8);
        rectangle.setColor("#653f6b");

        Circle circle = new Circle();
        Point p9 = new Point(100, 150, 50);
        circle.setColor("#ff3700");
        circle.addPoint(p9);




        Drawing dr = new Drawing("My project");
        dr.drawSquare(square, rectangle, circle);
    }
}
