package com.company;

import javax.swing.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("BMI counter");
        JTextField imie = new JTextField();
        JTextField wzrost = new JTextField();
        JTextField waga = new JTextField();
        JLabel lblimie = new JLabel("Name");
        JLabel lblwzrost = new JLabel("Height");
        JLabel lblm = new JLabel("m");
        JLabel lblwaga = new JLabel("weight");
        JLabel lblkg = new JLabel("kg");
        JLabel lblResult = new JLabel();
        JLabel lblResult2 = new JLabel();
        JButton oblicz = new JButton("count");
        JButton reset = new JButton("exit");

        f.add(imie);
        f.add(wzrost);
        f.add(lblm);
        f.add(waga);
        f.add(lblkg);
        f.add(oblicz);
        f.add(reset);
        f.add(lblimie);
        f.add(lblwzrost);
        f.add(lblwaga);
        f.add(lblResult);
        f.add(lblResult2);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        lblimie.setBounds(20,20,100,20);
        imie.setBounds(20,60,100,20);
        lblwzrost.setBounds(20,100,100,20);
        wzrost.setBounds(20,140,100,20);
        lblm.setBounds(120, 140, 20, 20);
        lblwaga.setBounds(20,180,100,20);
        waga.setBounds(20, 220, 100, 20);
        lblkg.setBounds(120, 220, 20, 20);
        lblResult.setBounds(20,260,200,20);
        lblResult2.setBounds(20, 280, 200, 20);
        oblicz.setBounds(20, 320, 100, 20);
        reset.setBounds(150, 320, 100, 20);


        oblicz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = imie.getText();
                int weight = Integer.parseInt(waga.getText());
                double height = Double.parseDouble(wzrost.getText());
                double bmi = weight / (height * height);
                bmi *= 100;
                bmi = Math.round(bmi);
                bmi /= 100;
                String opt;

                if(bmi<16){
                    opt = "starvation";
                } else if (bmi<16.99){
                    opt = "wasting";
                } else if (bmi<17.49){
                    opt = "underweight";
                } else if (bmi<24.99){
                    opt = "correct weight";
                } else if (bmi<29.99){
                    opt = "overweight";
                } else if (bmi<34.99){
                    opt = "first degree obesity";
                } else if (bmi<39.99){
                    opt = "second degree obesity";
                } else {
                    opt = "third degree obesity";
                }

                lblResult.setText(name + ", your bmi is " + bmi);
                lblResult2.setText(opt);

            }

        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
