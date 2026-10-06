import javax.swing.*;
import java.awt.*;

public class MDITask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MDI Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JDesktopPane desktop = new JDesktopPane();
        JInternalFrame internalFrame = new JInternalFrame("Window 1", true, true, true, true);

        internalFrame.setSize(200, 120);
        internalFrame.setLocation(30, 30);
        internalFrame.setVisible(true);

        // Wrong: internal frame should be added to desktop, not frame
        frame.add(internalFrame);

        desktop.add(internalFrame);
        frame.add(desktop);
        frame.setVisible(true);
    }
}
