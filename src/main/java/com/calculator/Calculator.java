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
        frame.setSize(450, 600);
        frame.setLayout(null);

        // textField to hold all the number that we type in and the results
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiplyButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        frame.add(textField);
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