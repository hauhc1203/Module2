package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JText extends JFrame {
    JTextArea textArea;
    JPasswordField pass;
    JTextField name;
    JFormattedTextField date;

    public JText() {
        Container cp=this.getContentPane();
        cp.setLayout(new GridLayout(2,0));

        GridLayout gridLayout=new GridLayout(3,2);
        JPanel up=new JPanel(gridLayout);
        JPanel down=new JPanel(new BorderLayout());

        up.setBorder(BorderFactory.createTitledBorder("Text Filed"));
        down.setBorder(BorderFactory.createTitledBorder("Text area"));

        textArea=new JTextArea("A JTextArea is a \"plain\" editable text component, which means that although it can display text in any font, all of the text is in the same font.");
        textArea.setFont(new Font(null,Font.ITALIC,12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSize(400,300);

        JScrollPane jScrollPane=new JScrollPane(textArea);
        jScrollPane.setBorder(BorderFactory.createTitledBorder("scoll"));
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setSize(400,300);
        cp.add(jScrollPane);



        name=new JTextField();
        pass=new JPasswordField(20);
       date=new JFormattedTextField();




        Label n=new Label("NAME: ");
        Label p=new Label("PASS: ");
        Label d=new Label("DAY: ");


        cp.add(up);
        cp.add(down);
        down.add(jScrollPane);
        up.add(n);
        up.add(name);
        up.add(p);
        up.add(pass);
        up.add(d);
        up.add(date);



        name.addActionListener(new getAndDisplay());
        pass.addActionListener(new getAndDisplay());
        date.addActionListener(new getAndDisplay());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public class   getAndDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String a= String.valueOf(e.getSource());
            textArea.append('\n'+e.getActionCommand());



        }
    }



    public static void main(String[] args) {
        new JText();
    }
}
