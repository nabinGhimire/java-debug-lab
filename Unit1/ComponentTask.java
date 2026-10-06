import javax.swing.*;
import java.awt.*;

class MyComponentTask extends JComponent {
    public void paintcomponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setString("Hello, World!", 50, 100);
    }
}

public class ComponentTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        MyComponentTask comp = new MyComponentTask();
        frame.add(comp);

        frame.setVisible(true);
    }
}
