package com.application;
import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton button1  = new JButton();
    MyFrame(){

        button1.setBounds(275,600,150,100);
        button1.setBackground(new Color(255,255,255));
        this.setTitle("Banking Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Program will stop running and end when exit out of the application
        this.setSize(700,900);  //set frame size
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.add(button1);
        this.getContentPane().setBackground(new Color(0,0,0));


    }

    void write(){

        Scanner scanner = new Scanner(System.in);
        do
        {
            String input_text = scanner.nextLine();
            button1.setText(input_text);
        } while (true);

    }

}