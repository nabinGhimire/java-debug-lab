import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiListenerTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Listeners");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Initial");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked once");
            }
        });

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
