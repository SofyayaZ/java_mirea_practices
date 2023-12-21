package Practice_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        final TextField textField = new TextField("result");
        textField.setBounds(50, 40, 250, 20);
        final TextField textNumber1 = new TextField("number1");
        textNumber1.setBounds(50, 70, 250, 20);
        final TextField textNumber2 = new TextField("number2");
        textNumber2.setBounds(50, 100, 250, 20);

        JButton sum = new JButton("+");
        sum.setBounds(50,150,60,30);
        sum.setSize(100,50);
        JButton sub = new JButton("-");
        sub.setBounds(50,250,60,30);
        sub.setSize(100,50);
        JButton mul = new JButton("*");
        mul.setBounds(200,150,60,30);
        mul.setSize(100,50);
        JButton div = new JButton("/");
        div.setBounds(200,250,60,30);
        div.setSize(100,50);

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(textNumber1.getText().trim());
                    int n2 = Integer.parseInt(textNumber2.getText().trim());
                    textField.setText(String.valueOf(n1 + n2));
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(textNumber1.getText().trim());
                    int n2 = Integer.parseInt(textNumber2.getText().trim());
                    textField.setText(String.valueOf(n1 - n2));
                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(textNumber1.getText().trim());
                    int n2 = Integer.parseInt(textNumber2.getText().trim());
                    textField.setText(String.valueOf(n1 * n2));
                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(textNumber1.getText().trim());
                    int n2 = Integer.parseInt(textNumber2.getText().trim());
                    textField.setText(String.valueOf(n1 / n2));
                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(sum);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(textField);
        frame.add(textNumber1);
        frame.add(textNumber2);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
