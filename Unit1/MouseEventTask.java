import javax.swing.*;
import java.awt.event.*;

public class MouseEventTask implements MouseListener {
    JFrame frame;
    JLabel label;

    public MouseEventTask() {
        frame = new JFrame("Mouse Event");
        frame.setSize(400, 300);

        label = new JLabel("No event");
        label.setBounds(50, 50, 200, 30);

        frame.addMouseListener(this);

        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEnter(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEventTask();
    }
}
