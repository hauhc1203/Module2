package view;

import model.StudentTable;

import javax.swing.*;
import java.awt.*;

public class StudentTableView extends JFrame {


    public StudentTableView(StudentTable studentTable){
        Container cp    =this.getContentPane();
        cp.setLayout(new BorderLayout());



        JTable table;
        table = new JTable();
        table.setModel(studentTable);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane=new JScrollPane(table);

        cp.add(scrollPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setVisible(true);

    }


}
