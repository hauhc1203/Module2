package layout;

import java.awt.*;

public class GridLayoutTest extends Frame {


    public GridLayoutTest() {
       // setLayout(new GridLayout(12,5,10,0));

        Label n=new Label();
        n.setText("Hello");
        n.setFont(new Font("serif",Font.ITALIC,12));
        n.setLocation(new Point(150,100));
        add(n);
        setTitle("grid layout");
        setSize(300,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
