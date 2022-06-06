package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame {
    JTextField jTextField;
    JButton jButton;

    boolean countUp=true;

    public MenuBar() {

        JMenuBar menuBar=new JMenuBar();
        JMenu menu=new JMenu("Count");
        JMenuItem jMenuItem=new JMenuItem("up");
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp=true;
            }
        });
        JMenuItem jMenuItem1=new JMenuItem("down");

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp=false;
            }
        });
        menuBar.add(menu);
        menu.add(jMenuItem);
        menu.add(jMenuItem1);
        setJMenuBar(menuBar);


        Container cp=this.getContentPane();
        cp.setLayout(new   FlowLayout(FlowLayout.LEFT));
        cp.add(new Label("Counter: "));
        jTextField=new JTextField("0",10);
        jTextField.setEditable(false);
        jTextField.setHorizontalAlignment(
               JTextField.LEFT
        );
        cp.add(jTextField);
        jButton=new JButton("Count");
        jButton.setPreferredSize(new Dimension(100,20));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c= Integer.parseInt(jTextField.getText());
                if (countUp){
                    c+=2;
                }else {
                    c-=2;
                }
                jTextField.setText(String.valueOf(c));

            }
        });

        cp.add(jButton);
        setTitle("Test Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuBar();
            }
        });    }
}
