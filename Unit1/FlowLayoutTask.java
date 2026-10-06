import java.awt.*;
import javax.swing.*;

public class FlowLayoutTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Test");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
