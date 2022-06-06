package bai1;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MouseEvent extends Frame implements WindowListener, MouseMotionListener, MouseListener {
    private TextField mouseClickX;
    private TextField mouseClickY;
    private TextField mousePX;
    private TextField mousePY;


    public MouseEvent() {
        setLayout(new FlowLayout());
        add(new Label("X-Click: "));
        mouseClickX=new TextField(10);
        add(mouseClickX);
        mouseClickX.setEditable(false);
        add(new Label("Y-Click: "));
        mouseClickY=new TextField(10);
        add(mouseClickY);
        mouseClickY.setEditable(false);



        add(new Label("X-Posit: "));
        mousePX=new TextField(10);
        add(mousePX);
        mousePX.setEditable(false);

        add(new Label("Y-Posit: "));
        mousePY=new TextField(10);
        add(mousePY);
        mousePY.setEditable(false);






        setTitle("Mouse Event");
        setBackground(Color.BLUE);
        setSize(400,300);
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);






    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        mousePX.setText(String.valueOf(e.getX()));
        mousePY.setText(String.valueOf(e.getY()));
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

    public static void main(String[] args) {
        new MouseEvent();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        mouseClickX.setText(String.valueOf(getMousePosition().x));
        mouseClickY.setText(String.valueOf(getMousePosition().y));
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }
}
