package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, multiplyButton, divButton;
    JButton decimalButton, equButton, delButton, clearButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;

    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}