package Practice_22;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;
import static Practice_22.InfixToPostfix.convertToPostfix;

public class Calculator extends JFrame {
    private String expression = "";
    private String postfix = "";
    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(450, 400));
        setLayout(null);
        setBackground(Color.darkGray);

        pack();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(20, 20, 380, 20);
        add(jTextArea);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        button1.setBounds(20, 60, 80, 50);
        button2.setBounds(120, 60, 80, 50);
        button3.setBounds(220, 60, 80, 50);
        button4.setBounds(20, 130, 80, 50);
        button5.setBounds(120, 130, 80, 50);
        button6.setBounds(220, 130, 80, 50);
        button7.setBounds(20, 200, 80, 50);
        button8.setBounds(120, 200, 80, 50);
        button9.setBounds(220, 200, 80, 50);
        button0.setBounds(20, 270, 80, 50);

        JButton buttonSum = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonDiv = new JButton("/");

        buttonSum.setBounds(320, 130, 80, 50);
        buttonSub.setBounds(320, 200, 80, 50);
        buttonMul.setBounds(120, 270, 80, 50);
        buttonDiv.setBounds(220, 270, 80, 50);

        JButton buttonDelete = new JButton("<-");
        JButton buttonResult = new JButton("=");

        buttonDelete.setBounds(320, 60, 80, 50);
        buttonResult.setBounds(320, 270, 80, 50);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="0";
                jTextArea.append("0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="1";
                jTextArea.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="2";
                jTextArea.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="3";
                jTextArea.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="4";
                jTextArea.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="5";
                jTextArea.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="6";
                jTextArea.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="7";
                jTextArea.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="8";
                jTextArea.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="9";
                jTextArea.append("9");
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="+";
                jTextArea.append("+");
            }
        });

        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="-";
                jTextArea.append("-");
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="*";
                jTextArea.append("*");
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="/";
                jTextArea.append("/");
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression = expression.substring(0, expression.length()-1);
                System.out.println(expression);
                String text = jTextArea.getText();
                if (text.length() > 0) {
                    text = text.substring(0, text.length() - 1);
                    jTextArea.setText(text);
                }
            }
        });
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(expression);
                jTextArea.setText(String.valueOf(getResult()));
                expression = String.valueOf(getResult());
                System.out.println(expression);
            }
        });

        add(button1);add(button2);add(button3);add(buttonDelete);
        add(button4);add(button5);add(button6);add(buttonSum);
        add(button7);add(button8);add(button9);add(buttonSub);
        add(button0);add(buttonMul);add(buttonDiv);add(buttonResult);
    }

    public String getExpression() {
        return expression;
    }

    public int getResult() {
        postfix = convertToPostfix(expression);
        Stack<Integer> stack = new Stack<>();

        System.out.println(postfix);
        String[] tokens = postfix.split(" ");
        for (String token: tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }
            else if (isOperator(token)) {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                int result;
                switch (token) {
                    case "+" -> result = firstOperand + secondOperand;
                    case "-" -> result = firstOperand - secondOperand;
                    case "*" -> result = firstOperand * secondOperand;
                    case "/" -> result = firstOperand / secondOperand;
                    default -> throw new IllegalArgumentException("Illegal operator: " + token);
                }
                stack.push(result);
            }
            else {
                throw new IllegalArgumentException("Illegal argument: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Incorrect expression");
        }
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
