package src.View;

import src.Controller.ComputerController;
import src.Model.Account;
import src.Model.ComputerTable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class AdminView extends JFrame {
    JButton profile;
    JButton qlTK;

    JButton doanhThu;
    JButton logOut;

    JButton addComputer;
    JButton search;
    JTextField jTextField;
     JScrollPane jScrollPane;
     JTable computerTable1;
    ComputerButon buttonC;

    public AdminView(ComputerTable computerTable,Account account,ComputerController computerController) {




        Font inDam=new Font("in dam",Font.TRUETYPE_FONT,15);
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());

        JPanel menu=new JPanel(new FlowLayout(FlowLayout.CENTER,45,0));
        menu.setBorder(new TitledBorder("Menu"));
        JPanel menuC=new JPanel(new FlowLayout());

        profile=new JButton("Profile");
        profile.setFont(inDam);
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProfileView(account);
            }
        });
        profile.setPreferredSize(new Dimension(150,30));

        doanhThu =new JButton("Doanh thu");
        doanhThu.setFont(inDam);
        doanhThu.setPreferredSize(new Dimension(150,30));

        logOut=new JButton("Đăng xuất");
        logOut.setFont(inDam);
        logOut.setPreferredSize(new Dimension(150,30));


        qlTK=new JButton("Quản lý tài khoản");
        qlTK.setFont(inDam);
        qlTK.setPreferredSize(new Dimension(150,30));

        menu.add(profile);
        menu.add(doanhThu);

        menu.add(qlTK);
        menu.add(logOut);

        JPanel computer=new JPanel(new FlowLayout(FlowLayout.CENTER));


        computer.setBorder(new TitledBorder("Table Computer"));


        addComputer=new JButton("Thêm máy");
        addComputer.setFont(inDam);
        addComputer.setPreferredSize(new Dimension(150,30));
        addComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addComputer.setEnabled(false);
                new AddComputerView(computerTable.getComputers(),addComputer,computerTable1,computerController);
                computerTable1.remove(computerTable1);
                computerTable1.repaint();

            }
        });



        search=new JButton("Tìm máy");
        search.setFont(inDam);
        search.setPreferredSize(new Dimension(150,30));
        jTextField=new JTextField("Nhập tên máy", 20);
        jTextField.setFont(inDam);
        jTextField.setPreferredSize(new Dimension(150,30));

        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextField.setText("");
            }
        });

        menuC.add(addComputer);



        menuC.add(search);
        menuC.add(jTextField);

        computerTable1=new JTable();
        computerTable1.setModel(computerTable);
        computerTable1.setFillsViewportHeight(true);
        computerTable1.setRowHeight(40);
        computerTable1.setFont(inDam);
        computerTable1.setPreferredScrollableViewportSize(new Dimension(800, 200));
        computerTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index=computerTable1.rowAtPoint(new Point(e.getX(),e.getY()));
               if (index>-1){
                   buttonC=new ComputerButon(index,computerController);
               }
            }
        });
        jScrollPane=new JScrollPane();
        jScrollPane.setAutoscrolls(true);
        jScrollPane.setViewportView(computerTable1);
        computer.add(jScrollPane);


        cp.add(menu);
        cp.add(menuC);
        cp.add(computer);
        setTitle("Phần mềm quản lý quán net");
        ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
        setIconImage(icon.getImage());
        setSize(1000,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public JButton getAddComputer() {
        return addComputer;
    }

    public void setAddComputer(JButton addComputer) {
        this.addComputer = addComputer;
    }
}
