package src.Controller;

import src.Model.Account;
import src.Model.Computer;
import src.Model.ComputerTable;
import src.Validate.ValidateAcc;
import src.View.AdminView;
import src.View.CustomerView;
import src.View.SignIn;
import src.constant.AccountConstant;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SignInController {
    SignIn signIn;
    ArrayList<Account> accounts;
    ComputerController computerController;

    ComputerTable computerTable ;
    ArrayList<Computer> computers;
    ValidateAcc validateAcc;

    public SignInController(ArrayList<Account> accounts, ValidateAcc validateAcc, ComputerController computerController, ArrayList<Computer> computers, ComputerTable computerTable) {
        this.accounts = accounts;
        this.validateAcc=validateAcc;
        this.computerController=computerController;
        this.computers=computers;
        this.computerTable=computerTable;
    }

    public  void signIn(){
        signIn=new SignIn(this);

    }

    public  void show(Account account,ComputerController computerController){
        new AdminView(computerTable,account, computerController);
    }


    public  void validate(String userName, String pass){
        Account account=validateAcc.validate(userName,pass,accounts);
        if (account!=null){
            JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
            signIn.setVisible(false);

            switch (account.getPermisson()){
                case AccountConstant.ADMIN:
                case AccountConstant.STAFF:

                    show(account,computerController);
                    break;
                case AccountConstant.USER:
                     DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("hh:mm - dd/MM");
                     LocalDateTime now=LocalDateTime.now();
                     int index= (int) (Math.random()*(computerController.computers.size()));

                     Computer computer1=computers.get(index);
                    new CustomerView(computer1,account,dateTimeFormatter.format(now));
                    break;

            }





            JOptionPane.showMessageDialog(null,"Xin chào "+userName);
        }else {
            JOptionPane.showMessageDialog(null,"Username hoặc password không đúng");
        }
    }


}


