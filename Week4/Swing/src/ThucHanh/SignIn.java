package ThucHanh;

import validate.PasswordValidate;
import validate.ValidateAcc;
import validate.ValidateUserName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class SignIn extends JFrame {
    private JTextField userName;
    private JPasswordField passwordField;

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }

    public SignIn()  {

        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,120,40);
        Font nghieng=new Font("nghieng",Font.PLAIN,12);
        Font inDam=new Font("dam",Font.BOLD ,18);
        Container cp=this.getContentPane();
        cp.setLayout(new GridLayout(5,0,0,20));

        JPanel uName=new JPanel(new FlowLayout(FlowLayout.CENTER,5,0));
        JPanel passW=new JPanel(new FlowLayout(FlowLayout.CENTER,5,0));
        JPanel button=new JPanel(flowLayout);

        JLabel cap1=new JLabel("Bạn phải đăng nhập để sử dụng hệ thống !",JLabel.CENTER);
        cap1.setFont(inDam);
        cp.add(cap1);

        JLabel vN=new JLabel("Nhập vào UserName có 8 đến 10 ký tự",JLabel.RIGHT);
        vN.setFont(nghieng);
        vN.setPreferredSize(new Dimension(450,20));
        uName.add(vN);

        JLabel uNameLabel=new JLabel("User name:");
        uNameLabel.setFont(inDam);
        uNameLabel.setPreferredSize(new Dimension(150,60));
        uName.add(uNameLabel);

         userName=new JTextField(25);
         userName.setPreferredSize(new Dimension(150,30));

        userName.addKeyListener(new KeyAdapter() {
            @Override
           public void keyReleased(KeyEvent e) {
               String username = userName.getText();
                boolean validName=ValidateUserName.validate(username);

               if (!validName) {
                       vN.setText("Username không  chứa kí tự đặc biệt, 8-15 kí tự ");
               }else {
                   vN.setText("UserName hợp lệ");
               }
           }
       });
       uName.add(userName);

        JLabel vP=new JLabel("Nhập password ít nhất 8 kí tự",JLabel.RIGHT);
        vP.setFont(nghieng);
        vP.setPreferredSize(new Dimension(450,20));
        passW.add(vP);

       JLabel passLabel=new JLabel("Password:");
       passLabel.setFont(inDam);
       passLabel.setPreferredSize(new Dimension(150,60));

       passW.add(passLabel);
       passwordField=new JPasswordField(25);
       passwordField.setPreferredSize(new Dimension(150,30));
       passwordField.addKeyListener(new KeyAdapter() {
           @Override
           public void keyReleased(KeyEvent e) {
               String pass=passwordField.getText();
               boolean validPass=PasswordValidate.validate(pass);
               if (validPass){
                   vP.setText("Password hợp lệ");
               }else {
                   vP.setText("Password không có khoảng trắng, tiếng việt.Độ dài 8-15 kí tự");

               }
           }
       });


       passW.add(passwordField);
       JButton signIn=new JButton("Sign in");
        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=userName.getText();
                String pass=passwordField.getText();
                boolean isSign=ValidateAcc.validate(name,pass);
                if (ValidateUserName.validate(name)&&PasswordValidate.validate(pass)){
                    if (isSign){
                        JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
                    }else {
                        JOptionPane.showMessageDialog(null,"Username hoặc password không đúng");
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Username hoặc password không hợp lệ");
                }
            }
        });
       button.add(signIn);
       JButton cancel=new JButton("Cancel");
       cancel.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       button.add(cancel);
       cp.add(uName);
       cp.add(passW);
       cp.add(button);
        setSize(500,450);

       ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
       setIconImage(icon.getImage());
        setTitle("Sign in");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setResizable(false);
       setVisible(true);
    }


    public static void main(String[] args) {
        new SignIn();
    }
}
