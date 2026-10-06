import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapeTask extends JComponent {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics) g;

        Rectangle rect = new Rectangle(50, 50, 100, 80);
        g2d.setColor(Color.BLUE);
        g2d.draw(rect);

        Ellipse2D ellipse = new Ellipse2D.Double(200, 50, 80, 100);
        g2d.setColor(Color.RED);
        g2d.fill(ellipse);

        g2d.setColor(Color.GREEN);
        g2d.drawLine(50, 140, 500, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.add(new ShapeTask());
        frame.setVisible(true);
    }
}
