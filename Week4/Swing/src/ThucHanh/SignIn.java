package ThucHanh;
import validate.PasswordValidate;
import validate.ValidateUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignIn extends JFrame {
    private JTextField userName;
    private JPasswordField passwordField;
    public SignIn()  {
        setTitle("Sign in");
        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,40,0);
        Container cp=this.getContentPane();
        cp.setLayout(new GridLayout(4,0,0,0));
        JPanel input=new JPanel();
        JPanel input2=new JPanel();
        JPanel button=new JPanel(flowLayout);
        JLabel cap1=new JLabel("Bạn phải đăng nhập để sử dụng hệ thống !",JLabel.CENTER);
        cp.add(cap1);
        JLabel jLabel=new JLabel("User name:");
        jLabel.setLocation(1,1);
        jLabel.setPreferredSize(new Dimension(70,30));
        input.add(jLabel);
         userName=new JTextField("Nhập vào UserName có 8 đến 10 ký tự",20);
         userName.addMouseListener(new MouseAdapter() {
             int count=0;
             @Override
             public void mouseClicked(MouseEvent e) {
                 if (count==0){
                     userName.setText("");
                     count++;
                 }
             }
         });
        userName.addKeyListener(new KeyAdapter() {
            @Override
           public void keyReleased(KeyEvent e) {
               String username = userName.getText();
               if (!ValidateUserName.validate(username)&&e.getKeyCode()!=8&&e.getKeyCode()!=10) {
                   JOptionPane.showMessageDialog(jLabel, "Nhập vào username không có kí tự đặc biệt");
               }
           }
       });
       input.add(userName);
       JLabel jLabel2=new JLabel("Password:");
       jLabel2.setPreferredSize(new Dimension(70,30));
       input2.add(jLabel2);
       passwordField=new JPasswordField(20);
       passwordField.addKeyListener(new KeyAdapter() {
           @Override
           public void keyReleased(KeyEvent e) {
               String pass=passwordField.getText();
               if (!PasswordValidate.validate(pass)&&e.getKeyCode()!=8&&e.getKeyCode()!=10){
                   JOptionPane.showMessageDialog(jLabel2, "Password không chứa khoảng trống và tiếng việt");
               }
           }
       });


       input2.add(passwordField);
       JButton signIn=new JButton("Sign in");
        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=userName.getText();
                String pass=passwordField.getText();
                System.out.println(pass);
                System.out.println(pass.length());

                if(name.length()>10||name.length()<8){
                   JOptionPane.showMessageDialog(jLabel,"Nhập vào username có từ 8 đến 10 kí tự");
               }else if (pass.length()<8){
                    JOptionPane.showMessageDialog(jLabel2,"Nhập vào password có ít nhất 8  kí tự, không đấu");
                }

//                JOptionPane.showMessageDialog(null,"Username or password is invalid");
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
       cp.add(input);
       cp.add(input2);
       cp.add(button);
      setSize(400,250);

       ImageIcon icon=new ImageIcon("D:\\IJ Project\\Module2\\Week4\\Swing\\img\\logo.jpg");
       setIconImage(icon.getImage());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setResizable(false);
       setVisible(true);
    }


    public static void main(String[] args) {
        new SignIn();
    }
}
