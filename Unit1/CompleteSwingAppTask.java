import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CompleteSwingAppTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel("Waiting...");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Wrong: should use getText() from field, not whole component
                resultLabel.setText("Hello, " + nameField);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(submitButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
