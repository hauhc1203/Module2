package Controller;

import Model.Account;
import Model.ComputerTable;
import Validate.ValidateAcc;
import View.AdminView;
import View.CustomerView;
import constant.AccountConstant;
import Model.Computer;
import View.SignIn;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SignInController {

    String state="login";
    SignIn signIn;
    ArrayList<Account> accounts;
    ComputerController computerController;
    Account account=null;
    ComputerTable computerTable ;
    ArrayList<Computer> computers;
    ValidateAcc validateAcc;
    Computer computer;

    AccountController accountController;
    public SignInController(ArrayList<Account> accounts, ValidateAcc validateAcc, ComputerController computerController, ArrayList<Computer> computers, ComputerTable computerTable,AccountController accountController) {
        this.accounts = accounts;
        this.validateAcc=validateAcc;
        this.computerController=computerController;
        this.computers=computers;
        this.computerTable=computerTable;
        this.accountController=accountController;
    }

    public  void signIn(){
        signIn=new SignIn(this);

    }

    public  void show(Account account,ComputerController computerController,AccountController accountController){
        new AdminView(computerTable,account, computerController,this,accountController);
    }

    int c=0;
    public  void validate(String userName, String pass){
        account=validateAcc.validate(userName,pass,accounts);
        if (account!=null){
            JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
            signIn.setVisible(false);

            switch (account.getPermisson()){
                case AccountConstant.ADMIN:
                case AccountConstant.STAFF:
                    show(account,computerController,accountController);
                    break;
                case AccountConstant.USER:
                     DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("hh:mm - dd/MM");
                     LocalDateTime now=LocalDateTime.now();
                     if(computer==null){
                         int index= (int) (Math.random()*(computerController.computers.size()));
                         computer=computers.get(index);
                     }
                     new CustomerView(computer,account,dateTimeFormatter.format(now),this,accountController);
                     break;

            }
            JOptionPane.showMessageDialog(null,"Xin chào "+userName);
        }else {

           if (state.equals("login")){
               JOptionPane.showMessageDialog(null,"Username hoặc password không đúng");
           }else {
                signIn.getUserName().setText("");
                signIn.getPasswordField().setText("");
               signIn.setVisible(true);
               state="login";
           }
        }

    }
    public  void  logOut(JFrame jFrame){
        jFrame.setVisible(false);
        this.account=null;
        state="logout";

        validate(null,null);
    }

    public Account getAccount() {
        return account;
    }
}


