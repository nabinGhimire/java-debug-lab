import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Not clicked yet");

        button.addActionListener(new ActionListener() {
            public void actionPerformed() {
                label.setText("Button was clicked!");
            }
        });

        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }
}
