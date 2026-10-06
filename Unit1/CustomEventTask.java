import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CustomButton extends JButton {
    public CustomButton(String text) {
        super(text);
    }

    // Wrong: custom event is not implemented correctly
    public void fireActionPerformed(ActionEvent e) {
        System.out.println("Custom event fired");
    }
}

public class CustomEventTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 200);
        frame.setLayout(new FlowLayout());

        CustomButton button = new CustomButton("Trigger");
        JLabel label = new JLabel("Ready");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Triggered");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
