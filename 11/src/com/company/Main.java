package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    static int value;
    static int schet = 3;
    static int a = (int) ( Math.random() * 21 );

    public static void main(String[] args) {
        final JFrame jFrame = new JFrame("11");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1200,800);
        jFrame.setLayout(new GridBagLayout());
        jFrame.setVisible(true);
        final JTextField textField = new JTextField(10);
        final JButton myButton = new JButton("Угадай");
        final JLabel label = new JLabel();
        jFrame.add(textField);
        jFrame.add(myButton);
        myButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str;
                str = textField.getText();
                value = Integer.parseInt (str);
                if(value == a) {
                    label.setText("Вы выиграли!");
                    jFrame.add(label);
                    textField.setEditable(false);
                    myButton.setEnabled(false);
                }
                else
                {
                    schet--;
                    if (schet == 0)
                    {
                        label.setText("Вы проиграли! Загаданное число было: " + a);
                        jFrame.add(label);
                        textField.setEditable(false);
                        myButton.setEnabled(false);
                    }
                    else
                    {
                        if(value > a) {
                            label.setText("Не верно! Ваше чило больше загаданного! У вас попыток: " + schet);
                            jFrame.add(label);
                        }
                        else {
                            label.setText("Не верно! Ваше число меньше загадонного! У вас попыток: " + schet);
                            jFrame.add(label);
                        }
                    }

                }

            }
        });
    }
}
