import javax.swing.*;
import java.awt.event.*;

public class WindowEventTask extends WindowAdapter {
    JFrame frame;

    public WindowEventTask() {
        frame = new JFrame("Window Event Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(this);
        frame.setVisible(true);
    }

    // Wrong method signature
    public void windowClosing(WindowEvent e, int code) {
        System.out.println("Window closed");
        System.exit(0);
    }

    public static void main(String[] args) {
        new WindowEventTask();
    }
}
