package View;

import Controller.AccountController;
import Model.*;
import Controller.ComputerController;
import Controller.SignInController;
import Validate.Validate;
import constant.AccountConstant;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class AdminView extends JFrame {
    JButton profile;
    JButton quanliDonGia;
    Validate validate=new Validate();
    JButton doanhThu;
    JButton logOut;

    JButton addElement;
    JButton search;
    JTextField jTextField;
     JScrollPane jScrollPane;
     JTable computerTable1;
    SelectionButon buttonC;
    SignInController signInController;
    JFrame jFrame;
    ProfileView profileView;

    int state=0;



    int count=0;
    JLabel validateName;
    InforComputer inforComputer;


    Account account;
    JTable acc;


    JTable accnv;
    JTabbedPane tabbedPane;




    public AdminView(ComputerTable computerTable, Account account, ComputerController computerController , SignInController signInController, AccountController accountController, AccountTable accountTable, StaffAccTable staffAccTable) {
        this.account=account;
        jFrame=this;
        this.signInController=signInController;

        Font inDam=new Font("in dam",Font.TRUETYPE_FONT,15);
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
        Font innghieng=new Font("innghieng",Font.ITALIC,13);

        JPanel menu=new JPanel(new FlowLayout(FlowLayout.CENTER,45,10));
        menu.setBorder(new TitledBorder("Menu"));
        menu.setPreferredSize(new Dimension(1250,60));

        JPanel menuC=new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
        menuC.setPreferredSize(new Dimension(1250,60));
        menuC.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.BLUE));




        profile=new JButton("Profile");
        profile.setFont(inDam);
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                profileView= new ProfileView(account,accountController,jFrame);
                jFrame.setEnabled(false);
            }
        });
        profile.setPreferredSize(new Dimension(150,30));

        doanhThu =new JButton("Doanh thu");
        doanhThu.setFont(inDam);
        doanhThu.setPreferredSize(new Dimension(150,30));

        logOut=new JButton("????ng xu???t");
        logOut.setFont(inDam);
        logOut.setPreferredSize(new Dimension(150,30));
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if ( profileView!=null){
                   profileView.closeCon();
                   profileView.setVisible(false);


               }
               if (inforComputer!=null){
                   inforComputer.setVisible(false);
               }
                account.setLoginStatus(AccountConstant.CHUA_DANG_NHAP);
                computerController.save();
                accountController.save();
                signInController.logOut(jFrame);
            }
        });


        quanliDonGia =new JButton("Qu???n l?? ????n gi??");
        quanliDonGia.setFont(inDam);
        quanliDonGia.setPreferredSize(new Dimension(150,30));

        menu.add(profile);
       if (account.getPermisson()==AccountConstant.ADMIN){
           menu.add(doanhThu);

           menu.add(quanliDonGia);
       }
        menu.add(logOut);

        menu.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.BLUE));







        validateName =new JLabel("*Kh??ng ???????c b??? tr???ng",JLabel.LEFT);
        validateName.setForeground(Color.BLUE);
        validateName.setPreferredSize(new Dimension(300,20));
        validateName.setFont(innghieng);



        addElement =new JButton("Th??m m??y");
        addElement.setFont(inDam);
        addElement.setPreferredSize(new Dimension(150,30));
        addElement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setEnabled(false);
                if (state==0){
                    new AddComputerView(computerTable.getComputers(),computerTable1,computerController,jFrame);
                }else if (state==1){
                    new CreateUserAcc(jFrame,accountController);
                }else {
                    new CreateStaffAcc(jFrame,accountController);
                }


            }
        });



        search=new JButton("T??m m??y");
        search.setFont(inDam);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=jTextField.getText();
                if (state==0){
                    if (validate.tenMay(name))
                    {
                        Computer c=computerController.validateCName(name);
                        if (c==null){
                            JOptionPane.showMessageDialog(null,"Kh??ng t??m th???y m??y t??nh v???i t??n v???a nh???p");
                        }else {
                            jFrame.setEnabled(false);
                            inforComputer=new InforComputer(computerController,c,"view",jFrame);


                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Vui l??ng nh???p t??n m??y t??nh ????ng ?????nh d???ng");

                    }
                }else {
                    if (validate.tenMay(name))
                    {
                        int index=accountController.getIndexByName(name);
                        if (index==-1){
                            JOptionPane.showMessageDialog(null,"Kh??ng t??m th???y t??i kho???n v???i t??n v???a nh???p");
                        }else {

                            Account account1=accountController.getAccounts().get(index);


                            if (account.getPermisson()>account1.getPermisson()){
                                jFrame.setEnabled(false);

                                if (account1.getPermisson()==AccountConstant.STAFF){
                                    new ProfileView(account1,accountController,jFrame);
                                }else {
                                    new UserInfo(accountController,jFrame,account1);
                                }

                            }else {
                                JOptionPane.showMessageDialog(null,"Kh??ng t??m th???y t??i kho???n v???i t??n v???a nh???p");
                            }


                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Vui l??ng nh???p t??n  t??nh ????ng ?????nh d???ng");

                    }
                }



            }
        });
        search.setPreferredSize(new Dimension(150,30));
        jTextField=new JTextField("Nh???p t??n m??y");
        jTextField.setFont(inDam);
        jTextField.setPreferredSize(new Dimension(150,30));

        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (count==0){
                    jTextField.setText("");
                }
                count++;

            }
        });
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                if (validate.tenMay(jTextField.getText())){
                    validateName.setForeground(Color.GREEN);
                    validateName.setText("T??n h???p l???");
                }else {
                    validateName.setForeground(Color.RED);
                    validateName.setText("T??n kh??ng ch??? k?? t??? ?????c bi???t, 8-15 k?? t???");
                }
            }
        });

        menuC.add(addElement);



        menuC.add(search);
        menuC.add(jTextField);
        menuC.add(validateName);

        computerTable1=new JTable();

        computerTable1.setModel(computerTable);
        computerTable1.setFillsViewportHeight(true);
        computerTable1.setRowHeight(40);
        computerTable1.setFont(inDam);


        computerTable1.setPreferredScrollableViewportSize(new Dimension(800, 300));
        computerTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index=computerTable1.rowAtPoint(new Point(e.getX(),e.getY()));
               if (index>-1){
                   buttonC=new SelectionButon(index,computerController,null,jFrame);
                   jFrame.setEnabled(false);

               }
            }
        });
        jScrollPane=new JScrollPane();
        jScrollPane.setAutoscrolls(true);
        jScrollPane.setViewportView(computerTable1);





        acc=new JTable();
        acc.setModel(accountTable);
        acc.setFillsViewportHeight(true);
        acc.setRowHeight(40);
        acc.setFont(inDam);
        acc.setPreferredScrollableViewportSize(new Dimension(800,300));
        acc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index=acc.rowAtPoint(new Point(e.getX(),e.getY()));
                if (index>-1){
                    int realIndex=accountController.getIndexByName(accountTable.taiKhoanKH().get(index).getUserName());
                    jFrame.setEnabled(false);
                    buttonC=new SelectionButon(realIndex,null,accountController,jFrame);

                }
            }
        });
        JScrollPane jScrollPane1=new JScrollPane();
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setViewportView(acc);



        accnv=new JTable();
        accnv.setModel(staffAccTable);
        accnv.setFillsViewportHeight(true);
        accnv.setRowHeight(40);
        accnv.setFont(inDam);
        accnv.setEditingColumn(3);

        accnv.setPreferredScrollableViewportSize(new Dimension(1200,300));
        accnv.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index=accnv.rowAtPoint(new Point(e.getX(),e.getY()));
                if (index>-1){
                    int realIndex=accountController.getIndexByName(staffAccTable.taiKhoanNV().get(index).getUserName());
                    jFrame.setEnabled(false);

                    buttonC=new SelectionButon(realIndex,null,accountController,jFrame);

                }
            }
        });
        JScrollPane jScrollPane2=new JScrollPane();
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setViewportView(accnv);


        tabbedPane =new JTabbedPane();
        tabbedPane.addTab("M??y t??nh",jScrollPane);
        tabbedPane.addTab("T??i kho???n ng?????i d??ng",jScrollPane1);
        if (account.getPermisson()==AccountConstant.ADMIN){
            tabbedPane.addTab("T??i kho???n nh??n vi??n",jScrollPane2);
        }

        tabbedPane.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.BLUE));
        tabbedPane.setPreferredSize(new Dimension(1250,400));

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                state=tabbedPane.getSelectedIndex();
                changeButton(state);

            }
        });
        cp.add(menu);
        cp.add(menuC);
        cp.add(tabbedPane);





        setTitle("Ph???n m???m qu???n l?? qu??n net");
        ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
        setIconImage(icon.getImage());
        setSize(1280,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                account.setLoginStatus(AccountConstant.CHUA_DANG_NHAP);
                accountController.save();
                computerController.save();

            }
            public void windowClosed(WindowEvent e) {
                account.setLoginStatus(AccountConstant.CHUA_DANG_NHAP);
                accountController.save();
                computerController.save();

            }
        });


        setResizable(false);
        setVisible(true);
    }
    public void changeButton(int state){
        switch (state){
            case 0:
                addElement.setText("Th??m m??y");
                search.setText("T??m m??y");
                jTextField.setText("Nh???p t??n m??y");

                break;


            case 1:
            case 2:
                addElement.setText("T???o t??i kho???n");
                search.setText("T??m T??i Kho???n");
                jTextField.setText("Nh???p username");

                break;

        }
    }
}
