package src.Controller;

import src.Validate.ValidateAcc;
import src.View.SignIn;

import javax.swing.*;

public class SignInController {
    static SignIn signIn;
    public static void signIn(){
        signIn=new SignIn();

    }
    public static void validate(String userName, String pass){
        if (ValidateAcc.validate(userName,pass)){

            JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
            signIn.setVisible(false);
            ComputerController computerController=new ComputerController();
            computerController.show();
            JOptionPane.showMessageDialog(null,"Xin chào "+userName);
        }else {
            JOptionPane.showMessageDialog(null,"Username hoặc password không đúng");
        }
    }


}


