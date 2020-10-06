package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.List;

public class Drawing extends JFrame {
    Square square;
    Rectangle rectangle;
    Circle circle;
    public  Drawing(String name)
    {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 700, 500);
        setVisible(true);
    }
    class MyComponent extends JComponent
    {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            List<Point> points;
            points = square.getPoints();
            Point lastPoint;
            lastPoint = square.getLastPoint();
            g.setColor(Color.decode(square.getColor()));
            Graphics2D g2 = (Graphics2D) g;

            for (Point p : points )
            {
                Line2D line2D = new Line2D.Double(lastPoint.getX(), lastPoint.getY(), p.getX(), p.getY());
                g2.draw(line2D);
                lastPoint = p;
            }
            points = rectangle.getPoints();
            lastPoint = rectangle.getLastPoint();
            g.setColor(Color.decode(rectangle.getColor()));
            for (Point p : points )
            {
                Line2D line2D = new Line2D.Double(lastPoint.getX(), lastPoint.getY(), p.getX(), p.getY());
                g2.draw(line2D);
                lastPoint = p;
            }
            Image image = new ImageIcon("C:\\Users\\stepa\\Desktop\\HWJava\\8\\src\\com\\company\\Безымянный.png").getImage();
            g.drawImage(image, 400, 30, null);



            g.setColor(Color.decode(circle.getColor()));
            points = circle.getPoints();
            for (Point p : points)
            {
                g2.fillOval(p.getXc(), p.getYc(), p.getR(), p.getR());
            }
        }
    }
    public void drawSquare(Square square, Rectangle rectangle, Circle circle)
    {
        this.square = square;
        this.rectangle = rectangle;
        this.circle = circle;
        add(new MyComponent());
    }
}
