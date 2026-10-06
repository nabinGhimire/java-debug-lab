import javax.swing.*;
import java.awt.*;

public class GridLayoutTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");

        frame.setLayout(new GridLayout(3, 3, 5, 5, 10));

        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
