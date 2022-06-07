package src.View;

import src.Model.ComputerTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ComputerTableView extends JFrame {
    private JScrollPane jScrollPane;
    private JTable computerTable1;

    private ButtonC buttonC;
    public ComputerTableView(ComputerTable computerTable) {

        Container cp=this.getContentPane();
        setTitle("Computer");


        computerTable1=new JTable();
        computerTable1.setModel(computerTable);
        computerTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             int index=   computerTable1.rowAtPoint(new Point(e.getX(),e.getY()));

                buttonC=new ButtonC(index);


            }
        });
        jScrollPane=new JScrollPane();
        jScrollPane.setViewportView(computerTable1);
        cp.add(jScrollPane);
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
}
