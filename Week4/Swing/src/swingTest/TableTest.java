package swingTest;

import javax.swing.*;
import java.awt.*;

public class TableTest extends JFrame {

    String[] columnNames = {"First Name", "Last Name",
            "Sport", "# of Years", "Vegetarian"};
    Object[][] data = {{"Kathy", "Smith", "Snowboarding",
            5, Boolean.FALSE},
            {"John", "Doe", "Rowing",
                    3, Boolean.TRUE},
            {"Sue", "Black", "Knitting",
                    2, Boolean.FALSE},
            {"Jane", "White", "Speed reading",
                    20, Boolean.TRUE},
            {"Joe", "Brown", "Pool",
                    10, Boolean.FALSE}
    };

    public TableTest(){
        Container container=this.getContentPane();
        JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(
                new Dimension(500, 70));
        table.setFillsViewportHeight(true);
       JScrollPane scrollPane = new JScrollPane(table);
        container.add(scrollPane);
        setTitle("JTabbedPane Demo");
        //setSize(500,400);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableTest();
    }

}
