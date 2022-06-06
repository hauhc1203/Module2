package layout;

import java.awt.*;

public class FlowLayoutTest extends Frame {

    public FlowLayoutTest() {
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        Button button5=new Button("btn5");
        Button button=new Button("btn0");
        Button button4=new Button("btn4");
        Button button3=new Button("btn3");
        Button button2=new Button("btn2");
        Button button1=new Button("btn1");
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
