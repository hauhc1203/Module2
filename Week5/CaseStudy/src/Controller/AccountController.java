package Controller;

import Model.Account;
import io.ReadAndWrite;

import java.util.ArrayList;

public class AccountController {

    ReadAndWrite<Account> readAndWrite=new ReadAndWrite<>();
    ArrayList<Account>accounts;
    String path="D:\\IJ Project\\Module2\\Week5\\CaseStudy\\data\\accounts.csv";


    public void changePass(Account account,String newPass){
        account.setPassWord(newPass);
    }

    public void save(){

        readAndWrite.write(accounts,path);

    }

    public ArrayList<Account> read(){
        return readAndWrite.read(path);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
