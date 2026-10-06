import javax.swing.*;

public class DialogTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Show Dialog");
        button.addActionListener(e -> {
            // Wrong method: should be showMessageDialog, not messageDialog
            JOptionPane.messageDialog(frame, "Hello, Student!");
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
