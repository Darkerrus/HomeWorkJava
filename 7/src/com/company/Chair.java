package com.company;

public class Chair extends Furniture {
    Chair(String color, int height, int width) {
        super(color, height, width);
        super.name = "Стул";
    }
}
