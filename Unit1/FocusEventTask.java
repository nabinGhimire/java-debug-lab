import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventTask implements FocusListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 180);
        frame.setLayout(new FlowLayout());

        JTextField field = new JTextField(15);
        JLabel label = new JLabel("Field not focused");

        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                label.setText("Field focused");
            }

            // Wrong method name
            public void focusLosted(FocusEvent e) {
                label.setText("Field lost focus");
            }
        });

        frame.add(field);
        frame.add(label);
        frame.setVisible(true);
    }

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
    }
}
