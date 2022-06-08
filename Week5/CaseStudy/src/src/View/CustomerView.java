package src.View;

import src.Model.Account;
import src.Model.Computer;

import javax.swing.*;
import java.awt.*;

public class CustomerView extends JFrame {
    Computer computer;
    Account account;

    JLabel computerName;
    JLabel welcome;
    JLabel start;
    JTextField startTime;
    JLabel used;
    JTextField usedTime;
    JLabel conLai;
    JTextField tgConLai;
    JLabel soDu;
    JTextField soDuT;
    JButton doiPass;
    JButton service;
    JButton logOut;


    public CustomerView(Computer computer,Account account){
        this.computer=computer;
        this.account=account;
        Font indamTO=new Font("indam",Font.BOLD,24);

        Container cp=this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setSize(400,600);

        computerName=new JLabel(computer.getName(),JLabel.CENTER);
        computerName.setPreferredSize(new Dimension(300,40));
        computerName.setFont(indamTO);

        cp.add(computerName,Color.RED);








        setVisible(true);








    }

    public static void main(String[] args) {
        Computer computer1=new Computer("Máy 1","Tốt",1);
        Account account1=new Account("thepham1","1");
        new CustomerView(computer1,account1);
    }
}
