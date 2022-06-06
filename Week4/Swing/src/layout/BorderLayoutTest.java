package layout;

import java.awt.*;

public class BorderLayoutTest extends Frame {

    public BorderLayoutTest() {
        setLayout(new BorderLayout(4,10));
        Button button5=new Button("East");
        Button button=new Button("NORth");
        Button button4=new Button("Centeraaw");
        Button button3=new Button("Center");
        Button button2=new Button("Center");
        Button button1=new Button("Centeraaaaaaaaaaaaaaaaaaa");
        Button button6=new Button("West");
        Button button7=new Button("South");
        Button button8=new Button("btn8");
        Button button9=new Button("btn9");
        Button button10=new Button("btn10");
        Button button11=new Button("btn11");


        add(button,BorderLayout.NORTH);
        add(button1,BorderLayout.CENTER);
        add(button2,BorderLayout.CENTER);
        add(button3,BorderLayout.CENTER);
        add(button4,BorderLayout.CENTER);
        add(button5,BorderLayout.EAST);
        add(button6,BorderLayout.WEST);
        add(button7,BorderLayout.SOUTH);


        setTitle("Border layout");
        setSize(300,200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
