package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class JcheckBox extends JFrame {
        JCheckBox jCheckBox1;
        JCheckBox jCheckBox2;
        JCheckBox jCheckBox3;
        JCheckBox jCheckBox4;

    public JcheckBox(){
        Container cp=this.getContentPane();
        cp.setLayout(new  GridLayout(4,0,5,0));

        jCheckBox1=new JCheckBox("checkbox1");
        jCheckBox1.setMnemonic(KeyEvent.VK_1);
        cp.add(jCheckBox1);
        jCheckBox2=new JCheckBox("checkbox2");
        jCheckBox2.setMnemonic(KeyEvent.VK_2);
        cp.add(jCheckBox2);
        jCheckBox3=new JCheckBox("checkbox3");
        jCheckBox3.setMnemonic(KeyEvent.VK_3);
        cp.add(jCheckBox3);
        jCheckBox4=new JCheckBox("checkbox4");
        jCheckBox4.setMnemonic(KeyEvent.VK_4);
        cp.add(jCheckBox4);

        setTitle("CheckBox");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);




    }

    public static void main(String[] args) {
        new JcheckBox();
    }



}
