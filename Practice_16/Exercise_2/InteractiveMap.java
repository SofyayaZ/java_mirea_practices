package Practice_16.Exercise_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class InteractiveMap extends JFrame {
    public InteractiveMap() {
        setTitle("Map");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(new Dimension(500, 400));
        setLocationRelativeTo(null);

        JLabel center = new JLabel("CENTER");
        center.setHorizontalAlignment(SwingConstants.CENTER);
        center.setVerticalAlignment(SwingConstants.CENTER);
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(InteractiveMap.this, "Welcome to CAD");
            }
        });
        add(center, BorderLayout.CENTER);

        JLabel north = new JLabel("NORTH");
        north.setHorizontalAlignment(SwingConstants.CENTER);
        north.setVerticalAlignment(SwingConstants.CENTER);
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(InteractiveMap.this, "Welcome to NAD");
            }
        });
        add(north, BorderLayout.NORTH);

        JLabel south = new JLabel("SOUTH");
        south.setHorizontalAlignment(SwingConstants.CENTER);
        south.setVerticalAlignment(SwingConstants.CENTER);
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(InteractiveMap.this, "Welcome to SAD");
            }
        });
        add(south, BorderLayout.SOUTH);

        JLabel west = new JLabel("WEST");
        west.setHorizontalAlignment(SwingConstants.CENTER);
        west.setVerticalAlignment(SwingConstants.CENTER);
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(InteractiveMap.this, "Welcome to WAD");
            }
        });
        add(west, BorderLayout.WEST);

        JLabel east = new JLabel("EAST");
        east.setHorizontalAlignment(SwingConstants.CENTER);
        east.setVerticalAlignment(SwingConstants.CENTER);
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(InteractiveMap.this, "Welcome to EAD");
            }
        });
        add(east, BorderLayout.EAST);

    }
}
