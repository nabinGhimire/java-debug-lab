import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEventTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem item = new JMenuItem("Save");
        menu.add(item);
        bar.add(menu);
        frame.setJMenuBar(bar);

        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Wrong: should use the item text, not action command name incorrectly
                System.out.println("Clicked: " + e.getID());
            }
        });

        frame.setVisible(true);
    }
}
