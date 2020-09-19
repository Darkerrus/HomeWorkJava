package com.company;

public class Circle {
    private double S;
    private double P;
    private double R;
    private double d;

    public Circle(double R, double d)
    {
        setD(d);
        setR(R);
    }

    public void setD(double d) {
        this.d = d;
    }


    public void setR(double r) {
        R = r;
    }

    public double printS1()
    {
        S = (Math.PI * (d*d))/4;
        return S;
    }

    public double printP()
    {
        P = 2 * Math.PI * R;
        return P;
    }
    public double printSP()
    {
        S = (P * P) / (4* Math.PI);
        return S;
    }
}
