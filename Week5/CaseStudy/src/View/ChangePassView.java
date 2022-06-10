package View;

import Controller.AccountController;
import Model.Account;
import Validate.PasswordValidate;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class ChangePassView extends JFrame {

    Account account;

    JButton confirm;
    JButton cancel;



    JLabel oldPass;
    JLabel newPass;
    JLabel confirmNewPass;

    JLabel validateNewPass;
    JLabel confirmValidateNewPass;



    JPasswordField oldPasswordField;
    JPasswordField newPasswordField;
    JPasswordField cNewPasswordField;

    JPanel infor;
    JPanel button;




    public ChangePassView(Account account, Component component, AccountController accountController,JTextField jTextField) {
        this.account = account;

        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());



        Font labelFont=new Font("labelFont", Font.PLAIN,20);
        Font buttonFont=new Font("buttonFont",Font.ROMAN_BASELINE,20);
        Font innghieng=new Font("innghieng",Font.ITALIC,13);


        Dimension labelDimension=new Dimension(200,30);
        Dimension textDimension=new Dimension(250,30);
        Dimension buttonDimension=new Dimension(200,40);

        oldPass=new JLabel("Nhập mật khẩu cũ: ");
        oldPass.setFont(labelFont);
        oldPass.setPreferredSize(labelDimension);

        oldPasswordField=new JPasswordField();
        oldPasswordField.setPreferredSize(textDimension);


        validateNewPass=new JLabel("*Không được để trống",JLabel.RIGHT);
        validateNewPass.setPreferredSize(new Dimension(450,20));
        validateNewPass.setFont(innghieng);
        validateNewPass.setForeground(Color.BLUE);




        newPass=new JLabel("Nhập mật khẩu mới: ");
        newPass.setPreferredSize(labelDimension);
        newPass.setFont(labelFont);

        newPasswordField=new JPasswordField();
        newPasswordField.setPreferredSize(textDimension);
        newPasswordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String pass=newPasswordField.getText();
                boolean validPass= PasswordValidate.validate(pass);
                if (validPass){
                    validateNewPass.setForeground(Color.GREEN);
                    validateNewPass.setText("Password hợp lệ");
                }else {
                    validateNewPass.setForeground(Color.RED);
                    validateNewPass.setText("Password không có khoảng trắng, tiếng việt.Độ dài 8-15 kí tự");

                }
            }
        });

        confirmValidateNewPass=new JLabel("*Không được để trống",JLabel.RIGHT);
        confirmValidateNewPass.setPreferredSize(new Dimension(450,20));
        confirmValidateNewPass.setFont(innghieng);
        confirmValidateNewPass.setForeground(Color.BLUE);

        confirmNewPass=new JLabel("Xác nhận lại: ");
        confirmNewPass.setFont(labelFont);
        confirmNewPass.setPreferredSize(labelDimension);

        cNewPasswordField=new JPasswordField();
        cNewPasswordField.setPreferredSize(textDimension);
        cNewPasswordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String pass=cNewPasswordField.getText();
                boolean validPass= PasswordValidate.validate(pass);
                if (validPass&&pass.equals(newPasswordField.getText())){
                    confirmValidateNewPass.setForeground(Color.GREEN);
                    confirmValidateNewPass.setText("Password hợp lệ");
                }else {
                    confirmValidateNewPass.setForeground(Color.RED);
                    confirmValidateNewPass.setText("Password không có khoảng trắng, tiếng việt.Độ dài 8-15 kí tự");


                }
            }
        });


        infor=new JPanel(new FlowLayout(FlowLayout.LEFT,5,10));
        TitledBorder titledBorder =new TitledBorder("Đổi mật khẩu");
        titledBorder.setTitleFont(labelFont);
        titledBorder.setTitleColor(Color.BLUE);
        infor.setBorder(titledBorder);
        infor.setPreferredSize(new Dimension(550,250));

        infor.add(oldPass);
        infor.add(oldPasswordField);
        infor.add(validateNewPass);
        infor.add(newPass);
        infor.add(newPasswordField);
        infor.add(confirmValidateNewPass);
        infor.add(confirmNewPass);
        infor.add(cNewPasswordField);

        cp.add(infor);

        confirm=new JButton("Xác nhận");
        confirm.setPreferredSize(buttonDimension);
        confirm.setFont(buttonFont);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (account.getPassWord().equals(oldPasswordField.getText())&&newPasswordField.getText().equals(cNewPasswordField.getText())){
                    if (PasswordValidate.validate(newPasswordField.getText())){
                        accountController.changePass(account,newPasswordField.getText());
                        if (jTextField!=null){
                            jTextField.setText(newPasswordField.getText());
                        }
                        JOptionPane.showMessageDialog(null,"Đổi mật khẩu thành công");
                        accountController.save();
                        setVisible(false);

                        component.setEnabled(true);
                    }else {
                        JOptionPane.showMessageDialog(null,"Vui lòng nhập mật khẩu hợp lệ");
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Đổi mật khẩu  thất bại");
                }


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
        setSize(600,450);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }
}
