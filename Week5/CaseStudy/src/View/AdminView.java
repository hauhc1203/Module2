package View;

import Controller.AccountController;
import Model.Account;
import Model.ComputerTable;
import Controller.ComputerController;
import Controller.SignInController;
import Validate.Validate;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class AdminView extends JFrame {
    JButton profile;
    JButton qlTK;
    Validate validate=new Validate();
    JButton doanhThu;
    JButton logOut;

    JButton addComputer;
    JButton search;
    JTextField jTextField;
     JScrollPane jScrollPane;
     JTable computerTable1;
    ComputerButon buttonC;
    SignInController signInController;
    JFrame jFrame;
    ProfileView profileView;


    JLabel validateCN;

    public AdminView(ComputerTable computerTable, Account account, ComputerController computerController , SignInController signInController, AccountController accountController) {

        jFrame=this;
        this.signInController=signInController;

        Font inDam=new Font("in dam",Font.TRUETYPE_FONT,15);
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());
        Font innghieng=new Font("innghieng",Font.ITALIC,13);

        JPanel menu=new JPanel(new FlowLayout(FlowLayout.CENTER,45,0));
        menu.setBorder(new TitledBorder("Menu"));
        JPanel menuC=new JPanel(new FlowLayout());

        profile=new JButton("Profile");
        profile.setFont(inDam);
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                profileView= new ProfileView(account,accountController);
            }
        });
        profile.setPreferredSize(new Dimension(150,30));

        doanhThu =new JButton("Doanh thu");
        doanhThu.setFont(inDam);
        doanhThu.setPreferredSize(new Dimension(150,30));

        logOut=new JButton("Đăng xuất");
        logOut.setFont(inDam);
        logOut.setPreferredSize(new Dimension(150,30));
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if ( profileView!=null){
                   profileView.closeCon();
                   profileView.setVisible(false);
               }

                signInController.logOut(jFrame);
            }
        });


        qlTK=new JButton("Quản lý tài khoản");
        qlTK.setFont(inDam);
        qlTK.setPreferredSize(new Dimension(150,30));

        menu.add(profile);
        menu.add(doanhThu);

        menu.add(qlTK);
        menu.add(logOut);

        JPanel computer=new JPanel(new FlowLayout(FlowLayout.CENTER));

        validateCN=new JLabel("*Không được bỏ trống",JLabel.LEFT);
        validateCN.setForeground(Color.BLUE);
        validateCN.setPreferredSize(new Dimension(300,20));
        validateCN.setFont(innghieng);
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

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=jTextField.getText();
                if (validate.tenMay(name))
                {
                    if (computerController.validateCName(name)){
                        JOptionPane.showMessageDialog(null,"Không tìm thấy máy tính với tên vừa nhập");
                    }else {
                        JOptionPane.showMessageDialog(null,"Tìm thấy máy tính với tên vừa nhập");

                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập tên máy tính đúng định dạng");

                }


            }
        });
        search.setPreferredSize(new Dimension(150,30));
        jTextField=new JTextField("Nhập tên máy");
        jTextField.setFont(inDam);
        jTextField.setPreferredSize(new Dimension(150,30));

        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextField.setText("");
            }
        });
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                if (validate.tenMay(jTextField.getText())){
                    validateCN.setForeground(Color.GREEN);
                    validateCN.setText("Tên hợp lệ");
                }else {
                    validateCN.setForeground(Color.RED);
                    validateCN.setText("Tên máy không chứ kí tự đặc biệt, 6-15 ký tự");
                }
            }
        });

        menuC.add(addComputer);



        menuC.add(search);
        menuC.add(jTextField);
        menuC.add(validateCN);

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
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                accountController.save();
                computerController.save();
            }
        });
        setResizable(false);
        setVisible(true);
    }

}
