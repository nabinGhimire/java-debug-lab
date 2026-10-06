import javax.swing.*;
import java.awt.*;

public class ImageDisplayTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Wrong path / wrong type usage
        ImageIcon icon = new ImageIcon("images/logo.jpg");
        JLabel label = new JLabel(icon);

        // Wrong: using setText instead of displaying image
        label.setText("Image here");

        frame.add(label);
        frame.setVisible(true);
    }
}
