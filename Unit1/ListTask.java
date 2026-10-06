import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ListTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        JList list = new JList(items);

        JLabel label = new JLabel("Selected: None");

        list.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected: " + list.getSelectedItem());
            }
        });

        frame.add(new JScrollPane(list));
        frame.add(label);
        frame.setVisible(true);
    }
}
