package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test  extends JFrame {
    public Test(){
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new Label("haha"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp.setSize(100,40);
        Button button=new Button("test Border");
        add(button);
        button.addActionListener(new BtnClicked());

        setSize(400,400);
        setVisible(true);
    }


    public class BtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        new Test();


    }
}
