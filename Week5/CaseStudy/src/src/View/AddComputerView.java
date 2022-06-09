package src.View;

import src.Controller.ComputerController;
import src.Model.Computer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AddComputerView extends JFrame {
    JPanel addC;
    JPanel buttonPanel;

    JLabel computerName;
    JLabel chatLuong;

    JTextField textFieldName;
    JTextField chatluongTextfield;

    JButton add;
    JButton cancel;



    public AddComputerView(ArrayList<Computer> computers,Component component,JTable component1,ComputerController computerController) {


        Container container=this.getContentPane();
        setLayout(new FlowLayout());
        setSize(500,400);
        Font labelFont=new Font("labelFont", Font.PLAIN,20);
        Font textFont=new Font("textFont",Font.ITALIC,18);
        Font buttonFont=new Font("buttonFont",Font.ROMAN_BASELINE,20);

        Dimension labelDimension=new Dimension(200,30);
        Dimension textDimension=new Dimension(350,30);
        Dimension buttonDimension=new Dimension(200,40);


        addC=new JPanel(new FlowLayout(FlowLayout.LEFT  ,5,5));

        TitledBorder addComputer=new TitledBorder("Thêm máy tính");
        addComputer.setTitleColor(Color.BLUE);
        addComputer.setTitleFont(labelFont);

        addC.setPreferredSize(new Dimension(460,200));
        addC.setBorder(addComputer);



        computerName=new JLabel("Nhập tên máy: ");
        computerName.setPreferredSize(labelDimension);
        computerName.setFont(labelFont);

        textFieldName =new JTextField();
        textFieldName.setPreferredSize(textDimension);
        textFieldName.setFont(textFont);



        chatLuong=new JLabel("Nhập chất lượng máy");
        chatLuong.setFont(labelFont);
        chatLuong.setPreferredSize(labelDimension);



        chatluongTextfield=new JTextField();
        chatluongTextfield.setFont(textFont);
        chatluongTextfield.setPreferredSize(textDimension);



        addC.add(computerName);
        addC.add(textFieldName);
        addC.add(chatLuong);
        addC.add(chatluongTextfield);



        add=new JButton("Thêm máy");
        add.setFont(buttonFont);
        add.setPreferredSize(buttonDimension);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computerController.add(textFieldName.getText(),chatluongTextfield.getText());
                System.out.println(computerController.getComputers().size());

                //component1.;
                component1.repaint();
                JOptionPane.showMessageDialog(null,"Thêm máy thành công");
                setVisible(false);
                component.setEnabled(true);
            }
        });

        cancel=new JButton("Hủy");
        cancel.setPreferredSize(buttonDimension);
        cancel.setFont(buttonFont);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                component.setEnabled(true);
            }
        });


        TitledBorder buttonTitleBorder=new TitledBorder("Chức năng");
        buttonTitleBorder.setTitleColor(Color.BLUE);
        buttonTitleBorder.setTitleFont(labelFont);

        buttonPanel=new JPanel(new FlowLayout());
        buttonPanel.setPreferredSize(new Dimension(460,100));
        buttonPanel.setBorder(buttonTitleBorder);
        buttonPanel.add(add);
        buttonPanel.add(cancel);



        container.add(addC);
        container.add(buttonPanel);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                component.setEnabled(true);
            }
        });

        setTitle("Thêm máy tính");
        ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
        setIconImage(icon.getImage());
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);




    }
}
