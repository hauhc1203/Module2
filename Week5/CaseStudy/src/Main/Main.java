package Main;

import Controller.AccountController;
import Controller.ComputerController;
import Controller.SignInController;
import Model.Account;
import Model.Computer;
import Model.ComputerTable;
import Validate.ValidateAcc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AccountController accountController=new AccountController();
        ArrayList<Account> accounts=accountController.read();
        accountController.setAccounts(accounts);

        ComputerController computerController=new ComputerController();
        ArrayList<Computer> computers=  computerController.read();
         computerController.setComputers(computers);

        ComputerTable computerTable=new ComputerTable(computers);
        ValidateAcc validateAcc=new ValidateAcc();

        SignInController signInController=new SignInController(accounts,validateAcc,computerController,computers,computerTable,accountController);
        signInController.signIn();







    }
}
//        accounts.add(new Account("hauhc1203","abcd1234","0345066663","hau.hc1203@gmail.com","Hoàng Công Hậu",24, AccountConstant.ADMIN,10000));
//        accounts.add(new Account("thepham1","abcd1234"));
//        accounts.add(new Account("duongtran","abcd1234"));
//        accounts.add(new Account("haireal123","abcd1234"));