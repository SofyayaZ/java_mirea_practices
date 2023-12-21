package Practice_16.Exercise_3;

import javax.swing.*;
import javax.swing.text.html.FormView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea jTextArea;
    private JMenuBar jMenuBar;
    public TextEditor() {
        setTitle("Simple text editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(400, 300));
        setResizable(true);

        pack();

        jTextArea = new JTextArea();
        jTextArea.setBounds(1,1,400,300);
        jTextArea.setFont(new Font("MS San Serif" , Font.PLAIN, 18));
        jMenuBar = new JMenuBar();

        add(jTextArea);
        add(jMenuBar);

        JMenu color = new JMenu("Color");
        JMenuItem redColor = new JMenuItem("Red");
        color.add(redColor);
        redColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.RED);
            }
        });
        JMenuItem greenColor = new JMenuItem("Green");
        color.add(greenColor);
        greenColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.GREEN);
            }
        });
        JMenuItem blackColor = new JMenuItem("Black");
        color.add(blackColor);
        blackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.BLACK);
            }
        });

        JMenu font = new JMenu("Font");
        JMenuItem TimesNewRomanFont = new JMenuItem("Times New Roman");
        font.add(TimesNewRomanFont);
        TimesNewRomanFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Times New Roman", Font.PLAIN,18));
            }
        });
        JMenuItem MSSanSerifFont = new JMenuItem("MS San Serif");
        font.add(MSSanSerifFont);
        MSSanSerifFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("MS San Serif", Font.PLAIN, 18));
            }
        });
        JMenuItem CourierNewFont = new JMenuItem("Courier New");
        font.add(CourierNewFont);
        CourierNewFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Courier New", Font.PLAIN, 18));
            }
        });

        jMenuBar.add(color);
        jMenuBar.add(font);
        setJMenuBar(jMenuBar);
    }
}
