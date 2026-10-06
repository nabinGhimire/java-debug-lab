import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionTask extends MouseAdapter {
    JLabel label;

    public MouseMotionTask() {
        JFrame frame = new JFrame("Mouse Motion Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        label = new JLabel("Move mouse here");
        frame.add(label);

        frame.addMouseMotionListener(this);
        frame.setVisible(true);
    }

    // Wrong method name: should be mouseDragged or mouseMoved
    public void mouseMove(MouseEvent e) {
        label.setText("Mouse moved to: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseMotionTask();
    }
}
