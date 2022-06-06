package bai1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Bai1 extends Frame implements ActionListener, WindowListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;

    public Bai1() throws HeadlessException {
        setLayout(new FlowLayout());
        this.setTitle("Bai 1");
        setSize(1000,600);
        lblCount=new Label("counter");
        add(lblCount);
        tfCount=new TextField(100);
        add(tfCount);
        btnCount=new Button("count");
        add(btnCount);
        btnCount.addActionListener(this);

        addWindowListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int c=Integer.parseInt(tfCount.getText());
        if (tfCount.isEditable())
            tfCount.setEditable(false);
        c--;
        if(c < 1)
            btnCount.setEnabled(false);
        tfCount.setText(c + "");

    }

    public static void main(String[] args) {
        new Bai1();


    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
