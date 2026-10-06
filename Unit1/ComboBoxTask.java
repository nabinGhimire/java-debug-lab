import javax.swing.*;
import java.awt.event.*;

public class ComboBoxTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        String[] languages = {"Java", "Python", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(50, 50, 150, 30);

        JButton button = new JButton("Show");
        button.setBounds(220, 50, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = comboBox.getSelectedValue();
                JOptionPane.showMessageDialog(null, "Selected: " + selected);
            }
        });

        frame.add(comboBox);
        frame.add(button);
        frame.setVisible(true);
    }
}
