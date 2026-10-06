import javax.swing.*;
import java.awt.*;

public class BorderLayoutTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // Wrong constructor: BorderLayout takes 2 parameters or just no parameters
        frame.setLayout(new BorderLayout(10, 20, 30));

        frame.add(new JButton("North"), BorderLayout.CENTER);
        frame.add(new JButton("South"), BorderLayout.NORTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
