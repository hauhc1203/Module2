package src.View;

import src.Controller.ComputerController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerButon extends JFrame {
    JButton edit;
    JButton delete;
    JButton  cancel;

    public ComputerButon(int index) {
        Container cp=this.getContentPane();
        cp.setLayout(new GridLayout(3,0,0,5));
        edit =new JButton("Edit");
        delete=new JButton("Delete");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                int confirm=JOptionPane.showConfirmDialog(null,"Ban co muon xoa");
                if (confirm==JOptionPane.OK_OPTION){
                    ComputerController.delete(index);
                    JOptionPane.showMessageDialog(null,"Đã xóa thành công");
                }
            }
        });


        cp.add(edit);
        cp.add(delete);

        setSize(60,100);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);



    }
}
