package View;

import Controller.AccountController;
import Model.Account;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class ProfileView extends JFrame {
    JLabel realName;
    JLabel sdt;
    JLabel email;
    JLabel tuoi;
    JLabel username;
    JLabel pass;


    JTextField rName;
    JTextField sdtT;
    JTextField emailT;
    JTextField age;
    JTextField userName;
    JTextField passW;

    JButton edit;
    JButton save;
    JButton cancel;

    JButton changePass;

    JFrame jFrame;
    JPanel information;
    JPanel chucNang;

    JFrame doimk;



    public ProfileView(Account account, AccountController accountController) {
        jFrame=this;
        Container container = this.getContentPane();

        container.setLayout(new FlowLayout());
        Font labelFont=new Font("labelFont", Font.PLAIN,20);
        Font textFont=new Font("textFont",Font.ITALIC,18);
        Font buttonFont=new Font("buttonFont",Font.ROMAN_BASELINE,20);

        Dimension labelDimension=new Dimension(150,30);
        Dimension textDimension=new Dimension(250,30);
        Dimension buttonDimension=new Dimension(200,40);


        information=new JPanel(new FlowLayout(FlowLayout.CENTER,5,10));
        information.setPreferredSize(new Dimension(460,300));
        TitledBorder titledBorder1=new TitledBorder("Thông tin cá nhân");
        titledBorder1.setTitleFont(labelFont);
        titledBorder1.setTitleColor(Color.BLUE);

        information.setBorder(titledBorder1);


        realName=new JLabel("Họ và tên: ");
        realName.setFont(labelFont);
        realName.setPreferredSize(labelDimension);

        rName=new JTextField(account.getRealName());
        rName.setFont(textFont);
        rName.setEditable(false);
        rName.setPreferredSize(textDimension);


        sdt=new JLabel("Số điện thoại: ");
        sdt.setFont(labelFont);
        sdt.setPreferredSize(labelDimension);

        sdtT=new JTextField(account.getPhoneNumber());
        sdtT.setFont(textFont);
        sdtT.setEditable(false);
        sdtT.setPreferredSize(textDimension);




        email=new JLabel("Email: ");
        email.setFont(labelFont);
        email.setPreferredSize(labelDimension);

        emailT=new JTextField(account.getEmail());
        emailT.setFont(textFont);
        emailT.setEditable(false);
        emailT.setPreferredSize(textDimension);



        tuoi=new JLabel("Tuổi: ");
        tuoi.setFont(labelFont);
        tuoi.setPreferredSize(labelDimension);

        age=new JTextField(String.valueOf(account.getAge()));
        age.setFont(textFont);
        age.setEditable(false);
        age.setPreferredSize(textDimension);





        username=new JLabel("Tên đăng nhập: ");
        username.setFont(labelFont);
        username.setPreferredSize(labelDimension);

        userName=new JTextField(account.getUserName());
        userName.setFont(textFont);
        userName.setEditable(false);
        userName.setPreferredSize(textDimension);



        pass=new JLabel("Mật khẩu: ");
        pass.setFont(labelFont);
        pass.setPreferredSize(labelDimension);

        passW=new JTextField(account.getPassWord());
        passW.setFont(textFont);
        passW.setEditable(false);
        passW.setPreferredSize(textDimension);


        information.add(realName);
        information.add(rName);

        information.add(sdt);
        information.add(sdtT);

        information.add(email);
        information.add(emailT);

        information.add(tuoi);
        information.add(age);

        information.add(username);
        information.add(userName);

        information.add(pass);
        information.add(passW);

        chucNang=new JPanel(new FlowLayout());


        save=new JButton("Lưu thay đổi");
        save.setFont(buttonFont);
        save.setPreferredSize(buttonDimension);
        save.hide();
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                account.setRealName(rName.getText());
                account.setPhoneNumber(sdtT.getText());
                account.setEmail(emailT.getText());
                account.setAge(Integer.parseInt(age.getText()));
                account.setUserName( userName.getText());

                rName.setEditable(false);
                sdtT.setEditable(false);
                emailT.setEditable(false);
                age.setEditable(false);
                userName.setEditable(false);
                save.hide();
                cancel.hide();
                edit.show();
                changePass.show();



            }
        });


        cancel=new JButton("Hủy");
        cancel.setFont(buttonFont);
        cancel.setPreferredSize(buttonDimension);
        cancel.hide();
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rName.setText(account.getRealName());
                sdtT.setText(account.getPhoneNumber());
                emailT.setText(account.getEmail());
                age.setText(String.valueOf(account.getAge()));
                userName.setText(account.getUserName());
                rName.setEditable(false);
                sdtT.setEditable(false);
                emailT.setEditable(false);
                age.setEditable(false);
                userName.setEditable(false);
                save.hide();
                cancel.hide();
                edit.show();
                changePass.show();
            }
        });





        edit=new JButton("Sửa thông tin");
        edit.setPreferredSize(buttonDimension);
        edit.setFont(buttonFont);
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rName.setEditable(true);
                sdtT.setEditable(true);
                emailT.setEditable(true);
                age.setEditable(true);
                userName.setEditable(true);
                edit.hide();
                changePass.hide();
                save.show();
                cancel.show();
            }
        });
        changePass=new JButton("Đổi mật khẩu");
        changePass.setPreferredSize(buttonDimension);
        changePass.setFont(buttonFont);
        changePass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doimk= new ChangePassView(account,changePass,accountController,passW);
                changePass.setEnabled(false);
            }
        });
        chucNang.add(edit);
        chucNang.add(changePass);
        chucNang.add(save);
        chucNang.add(cancel);

        TitledBorder titledBorder=new TitledBorder("Chức năng");
        titledBorder.setTitleColor(Color.BLUE);
        titledBorder.setTitleFont(labelFont);
        chucNang.setBorder(titledBorder);
        chucNang.setPreferredSize(new Dimension(460,95));

        container.add(information);
        container.add(chucNang);
        ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
        setIconImage(icon.getImage());

        setSize(500,450 );
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (doimk!=null){
                    doimk.setVisible(false);
                }
            }
        });

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void closeCon(){
        if (doimk!=null){
            doimk.setVisible(false);
        }
    }
}
