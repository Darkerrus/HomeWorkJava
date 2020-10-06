package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class Img extends JFrame {
    private int x =0,i=0;
    private String []arr = new String[4];

    public  Img(String name){
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,380,500);
        Timer timer = new Timer(300, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        arr[0]="C:\\Users\\stepa\\Desktop\\HWJava\\8.3\\Снимок экрана 2020-10-07 001726.png";
        arr[1]="C:\\Users\\stepa\\Desktop\\HWJava\\8.3\\Снимок экрана 2020-10-07 001802.png";
        arr[2]="C:\\Users\\stepa\\Desktop\\HWJava\\8.3\\Снимок экрана 2020-10-07 001831.png";
        arr[3]="C:\\Users\\stepa\\Desktop\\HWJava\\8.3\\Снимок экрана 2020-10-07 001849.png";
        timer.start();
        setVisible(true);
        add(new abc());
    }
    class abc extends JComponent{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Image image = new ImageIcon(arr[i]).getImage();

            if(i==3){
                i=0;
            }
            else{
                i++;
            }
            g.drawImage(image,0,0,null);
        }
    }
}