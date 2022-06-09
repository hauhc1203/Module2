package src.Main;

import src.Controller.ComputerController;
import src.Controller.SignInController;
import src.Model.Account;
import src.Model.Computer;
import src.Model.ComputerTable;
import src.Validate.ValidateAcc;
import src.constant.AccountConstant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(new Account("hauhc1203","abcd1234","0345066663","hau.hc1203@gmail.com","Hoàng Công Hậu",24, AccountConstant.ADMIN,10000));
        accounts.add(new Account("thepham1","abcd1234"));
        accounts.add(new Account("duongtran","abcd1234"));
        accounts.add(new Account("haireal123","abcd1234"));

        ComputerController computerController=new ComputerController();
        ArrayList<Computer> computers= computerController.getComputers();

        ComputerTable computerTable=new ComputerTable(computers);

        ValidateAcc validateAcc=new ValidateAcc();
        SignInController signInController=new SignInController(accounts,validateAcc,computerController,computers,computerTable);
        signInController.signIn();





    }
}
