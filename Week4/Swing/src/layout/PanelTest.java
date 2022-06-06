package layout;

import java.awt.*;

public class PanelTest  extends Frame {
    public PanelTest() {
        GridLayout flowLayout=new GridLayout(18,0);
        Panel west=new Panel(flowLayout);

        GridLayout gridLayout=new GridLayout(3,2,4,4);
        Panel center=new Panel(gridLayout);

        GridLayout flowLayout1=new GridLayout(18,0);
        Panel east=new Panel(flowLayout1);

        FlowLayout flowLayout2=new FlowLayout(FlowLayout.CENTER);
        Panel south=new Panel(flowLayout2);

        setLayout(new BorderLayout(10,10));
        add(new Label("Panel Test",Label.CENTER),BorderLayout.NORTH);
        add(center,BorderLayout.CENTER);
        add(west,BorderLayout.WEST);
        add(east,BorderLayout.EAST);
        add(south,BorderLayout.SOUTH);

        center.add(new Button("177"));
        center.add(new Button("166"));
        center.add(new Button("155"));
        center.add(new Button("144"));
        center.add(new Button("133"));
        center.add(new Button("122"));


        west.add(new Label("6"));
        west.add(new Label("5"));
        west.add(new Label("4"));
        west.add(new Label("3"));
        west.add(new Label("2"));
        west.add(new Label("1"));


        east.add(new Label("51"));
        east.add(new Label("41"));
        east.add(new Label("31"));
        east.add(new Label("21"));
        east.add(new Label("11"));


        south.add(new Label("17"));
        south.add(new Label("16"));
        south.add(new Label("15"));
        south.add(new Label("14"));
        south.add(new Label("13"));
        south.add(new Label("12"));
        south.add(new Label("11"));



        setSize(500,200);
        setVisible(true);



    }

    public static void main(String[] args) {
        new PanelTest();
    }
}
