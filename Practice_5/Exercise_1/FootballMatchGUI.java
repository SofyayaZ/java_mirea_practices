package Practice_5.Exercise_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FootballMatchGUI extends JFrame {
    private int madridScore = 0;
    private int milanScore = 0;
    private JLabel result;
    private JLabel lastScorer;
    private JLabel winner;

    public FootballMatchGUI() {
        setTitle("Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(160,200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(150,300));

        JButton button1 = new JButton("Real Madrid");
        JButton button2 = new JButton("AC Milan");
        panel.add(button1);
        panel.add(button2);

        result = new JLabel("Result: 0 X 0");
        lastScorer = new JLabel("Last Scorer: N/A");
        winner = new JLabel("Winner: DRAW");
        panel.add(result);
        panel.add(lastScorer);
        panel.add(winner);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer.setText("Last Scorer: Real Madrid");
                setScore();
                setWinner();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer.setText("Last Scorer: AC Milan");
                setScore();
                setWinner();
            }
        });

        getContentPane().add(panel);
        setVisible(true);
    }
    public void setScore() {
        result.setText("Result: " + milanScore + " X " + madridScore);
    }
    private void setWinner() {
        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        }
        if (milanScore < madridScore) {
            winner.setText("Winner: Real Madrid");
        }
        if (milanScore == madridScore) {
            winner.setText("Winner: DRAW");
        }
    }
}

