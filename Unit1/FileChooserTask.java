import javax.swing.*;
import java.awt.*;

public class FileChooserTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Choose File");
        JLabel label = new JLabel("No file chosen");

        button.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            // Wrong: should call showOpenDialog, not openFileDialog
            chooser.openFileDialog(frame);
            label.setText("Selected: " + chooser.getSelectedFile());
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}
