import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class TableSelectionTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);

        String[] cols = {"Name", "Marks"};
        Object[][] data = { {"A", 80}, {"B", 90}, {"C", 85} };
        JTable table = new JTable(new DefaultTableModel(data, cols));
        JLabel label = new JLabel("Selected: none");

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                // Wrong: selected row value not retrieved properly
                label.setText("Selected: " + table.getSelectedValue());
            }
        });

        frame.add(new JScrollPane(table));
        frame.add(label);
        frame.setVisible(true);
    }
}
