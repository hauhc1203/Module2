package ThucHanh;

import javax.swing.*;
import java.awt.*;

public class GridL extends JFrame {
    public GridL() {
        Container cp=this.getContentPane();
        cp.setLayout(new GridLayout(3,1,0,0));



        JPanel jPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
        jPanel.add(new Label("haha"));

        cp.add(jPanel);
        cp.add(new Button("haha"));
        cp.add(new Button("haha"));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridL();
    }
}
