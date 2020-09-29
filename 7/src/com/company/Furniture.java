package com.company;

abstract class Furniture {

    protected String name;
    protected String color;
    protected int height;
    protected int width;
    Furniture(String color, int height, int width)
    {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return
                "Вид мебели: " + name +
                ", цвет: " + color +
                ", Размер: " + height + "x"
                 + width+ " см²";
    }
}

