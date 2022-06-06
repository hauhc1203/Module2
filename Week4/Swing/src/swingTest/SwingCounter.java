package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter  extends JFrame {
    JButton jcounter;
    JTextField jTextField;
    boolean countUp=true;
    JRadioButton jRadioButtonUp;
    JRadioButton jRadioButtonDown;
    private int step = 1;

    public SwingCounter()  {
        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.LEFT));
        jTextField=new JTextField("0",5);
        jTextField.setEditable(false);
        jTextField.setHorizontalAlignment(
                JTextField.RIGHT
        );

        cp.add(new Label("Counter: "));
        cp.add(jTextField);



        jRadioButtonUp=new JRadioButton("Up", true);
        jRadioButtonUp.setMnemonic(KeyEvent.VK_U);
        jRadioButtonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp=true;
            }
        });
        cp.add(jRadioButtonUp);


        jRadioButtonDown=new JRadioButton("Down", true);
        jRadioButtonDown.setMnemonic(KeyEvent.VK_D);
        jRadioButtonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp=false;
            }
        });
        cp.add(jRadioButtonDown);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(jRadioButtonUp);
        buttonGroup.add(jRadioButtonDown);
        add(new JLabel("Step:"));
        final Integer[] steps = {1, 2, 3, 4, 5};
        final JComboBox<Integer> comboCount = new JComboBox<>(steps);
        comboCount.setPreferredSize(
                new Dimension(60, 20));
        cp.add(comboCount);
        comboCount.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


               // if (e.getStateChange() == ItemEvent.SELECTED) {
                       step = (Integer) comboCount.getSelectedItem();
                //}

            }
        });


        jcounter = new JButton("Count");
        jcounter.setMnemonic(KeyEvent.VK_C);
        cp.add(jcounter);
        jcounter.addActionListener(new ActionListener()
        {
            int count= Integer.parseInt(jTextField.getText());
            @Override
            public void actionPerformed(ActionEvent e) {
                if (countUp) {
                    count += step;
                } else {
                    count -= step;
                }
                jTextField.setText(count + "");
            }
        });


        setTitle("Swing counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,100);
        setVisible(true);

    }





    public static void main(String[] args) {
        new SwingCounter();
    }
}
