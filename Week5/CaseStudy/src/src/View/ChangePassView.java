package src.View;

import src.Model.Account;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChangePassView extends JFrame {

    Account account;

    JButton confirm;
    JButton cancel;



    JLabel oldPass;
    JLabel newPass;
    JLabel confirmNewPass;


    JPasswordField oldPasswordField;
    JPasswordField newPasswordField;
    JPasswordField cNewPasswordField;

    JPanel infor;
    JPanel button;



    public ChangePassView(Account account,Component component) {
        this.account = account;

        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());



        Font labelFont=new Font("labelFont", Font.PLAIN,20);
        Font buttonFont=new Font("buttonFont",Font.ROMAN_BASELINE,20);

        Dimension labelDimension=new Dimension(200,30);
        Dimension textDimension=new Dimension(250,30);
        Dimension buttonDimension=new Dimension(200,40);

        oldPass=new JLabel("Nhập mật khẩu cũ: ");
        oldPass.setFont(labelFont);
        oldPass.setPreferredSize(labelDimension);

        oldPasswordField=new JPasswordField();
        oldPasswordField.setPreferredSize(textDimension);


        newPass=new JLabel("Nhập mật khẩu mới: ");
        newPass.setPreferredSize(labelDimension);
        newPass.setFont(labelFont);

        newPasswordField=new JPasswordField();
        newPasswordField.setPreferredSize(textDimension);



        confirmNewPass=new JLabel("Xác nhận lại: ");
        confirmNewPass.setFont(labelFont);
        confirmNewPass.setPreferredSize(labelDimension);

        cNewPasswordField=new JPasswordField();
        cNewPasswordField.setPreferredSize(textDimension);



        infor=new JPanel(new FlowLayout());
        TitledBorder titledBorder =new TitledBorder("Đổi mật khẩu");
        titledBorder.setTitleFont(labelFont);
        titledBorder.setTitleColor(Color.BLUE);
        infor.setBorder(titledBorder);
        infor.setPreferredSize(new Dimension(550,200));

        infor.add(oldPass);
        infor.add(oldPasswordField);

        infor.add(newPass);
        infor.add(newPasswordField);
        infor.add(confirmNewPass);
        infor.add(cNewPasswordField);

        cp.add(infor);

        confirm=new JButton("Xác nhận");
        confirm.setPreferredSize(buttonDimension);
        confirm.setFont(buttonFont);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                account.setPassWord(newPasswordField.getText());
                JOptionPane.showMessageDialog(null,"Đổi mật khẩu thành công");
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



        button=new JPanel(new FlowLayout());
        button.setPreferredSize(new Dimension(550,100));
        TitledBorder titledBorder1 =new TitledBorder("Button");
        titledBorder1.setTitleFont(labelFont);
        titledBorder1.setTitleColor(Color.BLUE);
        button.setBorder(titledBorder1);
        button.add(confirm);
        button.add(cancel);

        cp.add(button);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            component.setEnabled(true);
            }
        });
        ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
        setIconImage(icon.getImage());
        setSize(600,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }
}
