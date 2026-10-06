import javax.swing.*;
import javax.swing.event.*;

public class SliderTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 180);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JSlider slider = new JSlider(0, 100, 50);
        JLabel label = new JLabel("Value: 50");

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Wrong: slider.getValue() is valid, but value is not shown correctly
                label.setText("Value: " + slider.getValueString());
            }
        });

        frame.add(slider);
        frame.add(label);
        frame.setVisible(true);
    }
}
