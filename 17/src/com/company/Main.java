package com.company;


import javax.swing.*;

class asd extends JFrame{
    public asd()
    {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 320);
        setLocation(100,100);
        add(new GAME());
        setVisible(true);

    }
}


public class Main {

    public static void main(String[] args) {
	asd as = new asd();
    }
}
