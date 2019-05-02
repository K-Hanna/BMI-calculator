package com.company;

import javax.swing.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("BMI counter");
        JTextField name = new JTextField();
        JTextField height = new JTextField();
        JTextField weight = new JTextField();
        JLabel lblname = new JLabel("Name");
        JLabel lblheight = new JLabel("Height");
        JLabel lblm = new JLabel("m");
        JLabel lblweight = new JLabel("weight");
        JLabel lblkg = new JLabel("kg");
        JLabel lblResult = new JLabel();
        JLabel lblResult2 = new JLabel();
        JButton count = new JButton("count");
        JButton reset = new JButton("reset");

        f.add(name);
        f.add(height);
        f.add(lblm);
        f.add(weoght);
        f.add(lblkg);
        f.add(count);
        f.add(reset);
        f.add(lblname);
        f.add(lblheight);
        f.add(lblweight);
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
                String n = name.getText();
                int w = Integer.parseInt(weight.getText());
                double h = Double.parseDouble(height.getText());
                double bmi = w / (h * h);
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

                lblResult.setText(n + ", your bmi is " + bmi);
                lblResult2.setText(opt);

            }

        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                height.setText("");
                weight.setText("");
                lblRestlt.setText("");
                lblResilt2.setText("");
                
            }
        });

    }
}
