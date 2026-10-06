import javax.swing.*;
import java.awt.*;

public class ColorFontTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color and Font");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Styled Text");

        label.setForeground(new Color(255, 0, 0, 0, 0));

        label.setFont(new Font(24, Font.BOLD, "Arial"));

        label.setBackground(Color.YELLOW);

        frame.add(label);
        frame.setVisible(true);
    }
}
