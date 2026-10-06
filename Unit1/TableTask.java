import javax.swing.*;
import javax.swing.table.*;

public class TableTask {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);

        String[] columns = {"Name", "Age"};
        Object[][] data = {
            {"Alice", 20},
            {"Bob", 22},
            {"Charlie", 25}
        };

        // Wrong: JTable constructor requires model not arrays this way
        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
