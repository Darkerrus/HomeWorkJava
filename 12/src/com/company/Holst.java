package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Holst extends JFrame {
    private static final Random random = new Random();
    private static final int secret = random.nextInt(19) + 1;
    public Holst(){
        super("PLANETI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("GO");
        final JComboBox spisokPlanet = new JComboBox(Planets.values());
        final JLabel jLabel = new JLabel("Гравитации Земли = 9.8");
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Planets planets = (Planets)spisokPlanet.getSelectedItem();

                double gravity = planets.gravity() / 1000000000000.00;
                jLabel.setText("Гравитация " + planets.getName() + " = " + gravity);
            }
        });
        jPanel.add(jLabel);
        jPanel.add(btn);
        jPanel.add(spisokPlanet);
        setContentPane(jPanel);
        setSize(1200,600);
        setVisible(true);
        System.out.println(secret);
    }

}
