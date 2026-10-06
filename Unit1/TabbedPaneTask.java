import javax.swing.*;

public class TabbedPaneTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Home", new JLabel("Home Panel"));
        tabbedPane.addTab("Profile", new JLabel("Profile Panel"));

        // Wrong call: add() is not used like this for tabs
        tabbedPane.add(new JPanel());

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
