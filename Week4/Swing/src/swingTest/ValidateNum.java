package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ValidateNum  extends  JFrame{
    private JTextField num;
    private JTextField num2;
    private JButton send;

    public ValidateNum(){
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new Label("Nhap Vao 1 so tu 1- 9: "));

        num=new JTextField(10);






        num.setHorizontalAlignment(
                JTextField.RIGHT
        );
        num.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int c= Integer.parseInt(num.getText());
                    if (c<1||c>9){
                        JOptionPane.showMessageDialog(null, "Nhap vao 1 so  tu 1 den 9");
                        num.setText("");
                    }else {
                        JOptionPane.showMessageDialog(null, " so vua nhap la "+c);
                       // System.exit(0);
                    }
                }catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Nhap vao 1 so ");
                    num.setText("");
                }
            }
        });

        cp.add(num);


        cp.add(new Label("Nhap Vao 1 so tu 1- 9: "));

        num2=new JTextField(10);

        num2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                try {
                    int c= Integer.parseInt(num2.getText());
                    if (c<1||c>9){
                        JOptionPane.showMessageDialog(null, "Nhap vao 1 so  tu 1 den 9");
                        num2.setText("");
                    }else {
                        JOptionPane.showMessageDialog(null, " so vua nhap la "+c);
                        // System.exit(0);
                    }
                }catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Nhap vao 1 so ");
                    num2.setText("");
                }
            }
        });

        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cp.add(num2);

        send=new JButton("Submit");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cp.add(send);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ValidateNum();
    }



}
