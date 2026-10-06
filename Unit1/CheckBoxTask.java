import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Status: ");
        label.setBounds(50, 20, 300, 30);

        JCheckBox cb1 = new JCheckBox("Option 1");
        cb1.setBounds(50, 60, 100, 30);

        JCheckBox cb2 = new JCheckBox("Option 2");
        cb2.setBounds(50, 100, 100, 30);

        cb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Option 1: Checked");
                } else {
                    label.setText("Option 1: Unchecked");
                }
            }
        });

        frame.add(label);
        frame.add(cb1);
        frame.add(cb2);
        frame.setVisible(true);
    }
}
