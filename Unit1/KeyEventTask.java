import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventTask extends KeyAdapter {
    JFrame frame;
    JTextField textField;
    JLabel label;

    public KeyEventTask() {
        frame = new JFrame("Key Event");
        frame.setSize(400, 200);

        textField = new JTextField(20);
        label = new JLabel("Type something");

        textField.addKeyListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void keyTyped(KeyEvent e, int key) {
        label.setText("Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Pressed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventTask();
    }
}
