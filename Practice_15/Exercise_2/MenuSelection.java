package Practice_15.Exercise_2;

import java.awt.event.*;
import javax.swing.*;
public class MenuSelection extends JFrame{
    public MenuSelection() {
        setTitle("Menu selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        String[] countries = {"Russia", "Germany", "USA"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) comboBox.getSelectedItem();
                if (selectedCountry=="USA") {
                    JOptionPane.showMessageDialog(null, "The United States is a country in North America that is a federal republic of 50 states.");
                } else if (selectedCountry=="Russia") {
                    JOptionPane.showMessageDialog(null, "Russia is the largest country in the world.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Germany is a country in the Europe which is famous for its beer.");
                }
            }
        });
        panel.add(comboBox);
        add(panel);
    }
}

