import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 180);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter password:");
        JPasswordField passwordField = new JPasswordField(15);
        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Wrong: getPassword() returns char[], not String
                String password = passwordField.getPassword();
                JOptionPane.showMessageDialog(frame, "Password: " + password);
            }
        });

        frame.add(label);
        frame.add(passwordField);
        frame.add(button);
        frame.setVisible(true);
    }
}
