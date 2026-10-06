import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventComboTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo + Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        String[] items = {"Java", "C++", "Python"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        JButton button = new JButton("Show");
        JLabel label = new JLabel("Choose one");

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Wrong method: should use getSelectedItem, not getSelectedValue()
                String selected = comboBox.getSelectedValue();
                label.setText("Selected: " + selected);
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Chosen: " + comboBox.getSelectedItem());
            }
        });

        frame.add(comboBox);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
