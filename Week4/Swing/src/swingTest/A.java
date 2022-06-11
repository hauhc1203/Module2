package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A extends JFrame {
    int c=0;
    public A(){

        JButton button=new JButton("1");

        JButton button1=new JButton("2");
        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (c==0){
                            button.setVisible(false);
                            c=1;
                        }else {
                            button.setVisible(true);
                            c=0;
                        }
                    }
                }
        );

        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(button);
        cp.add(button1);

        setVisible(true);

        setSize(300,300);

    }

    public static void main(String[] args) {
        new A();
    }
}
