import javax.swing.*;
import java.awt.event.*;

public class AdapterMultiTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Test");
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
            }

            // Wrong method name in adapter
            public void mouseEntereded(MouseEvent e) {
                System.out.println("Mouse entered");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
