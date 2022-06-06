package bai1;

import java.awt.*;
import java.awt.event.*;

public class NestedClass extends  Frame{
    private Label labelCount;
    private TextField tc;
    private Button countUp;
    private Button countDown;
    private Button reset;


    public NestedClass()  {
        setLayout(new FlowLayout());
        labelCount=new Label("Count: ");
        add(labelCount);
        tc=new TextField(10);
        add(tc);
        countUp=new Button("Count Up");
        add(countUp);
        countUp.addActionListener(new BtnCountListener());
        countDown=new Button("Count Down");
        add(countDown);
        countDown.addActionListener(new BtnCountListener());
        reset=new Button("Reset");
        add(reset);
        reset.addActionListener(new BtnCountListener());


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        setSize(500,300);
        setTitle("Count use NestClass");
        setVisible(true);
    }
    private class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String btnLabel=e.getActionCommand();
            int count = 0;
            count = Integer.parseInt(tc.getText());
            if (tc.isEditable())
                tc.setEditable(false);
           if (btnLabel.equals("Count Up")){
               count++;
           }else if(btnLabel.equals("Count Down"))
           {
               count--;
           }else if (btnLabel.equals("Reset")){
               count=0;
           }

            tc.setText(count + "");
        }
    }


    public static void main(String[] args) {
        new NestedClass();
    }
}
