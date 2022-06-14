package controller;

import constant.Constant;
import validate.*;

import java.util.Scanner;

public class InputController
{
    Scanner scanner=new Scanner(System.in);

    public int choice(ChoiceValidate choiceValidate){
        int choice;
        while (true){
           try {
               choice= Integer.parseInt(scanner.nextLine());
               if (choiceValidate.validate(String.valueOf(choice))){
                   return choice;
               }
               System.out.println("Không có chức năng này. Vui lòng chọn lại!");
           }catch (Exception e){
               System.out.println("Chỉ nhập số ");
           }

        }

    }

    public String maSp(MSPValidate mspValidate, int state){
        String maP;

        while (true){
           try {
               System.out.println("Nhập vào mã sản phẩm có 4 chữ kí tự");
               maP=scanner.nextLine();
               if ((state== Constant.UPDATE||state==Constant.DELETE)&&maP.equals("")){
                   return null;
               }

               if (mspValidate.validate(maP)){

                       return maP;


               }
           }catch (Exception e){
               System.out.println("Mã sản phẩm không chứa kí tự đặc biệt");
           }

        }
    }

    public String chuoi(StringValidate stringValidate, String str){
        String chuoi1;
        while (true){
            System.out.println("Nhập vào "+str);
            chuoi1=scanner.nextLine();
            if (stringValidate.validate(chuoi1)){
                return chuoi1;
            }else {
                System.out.println("Nhập vào chuỗi không dấu");
            }
        }
    }


    public double price(PriceValidate priceValidate){
        double price;
        while (true){
            try {
                System.out.println("Nhập vào giá của sản phẩm");
                price=Double.parseDouble(scanner.nextLine());
                if (priceValidate.validate(String.valueOf(price))){
                    return price;
                }
            }catch (Exception e){
                System.out.println("Chỉ nhập số");
            }
        }
    }
    public  int quantity(QuantityValidate quantityValidate){
        int soL;
        while (true){
            try {
                System.out.println("Nhập vào số lượng sản phẩm");
                soL=Integer.parseInt(scanner.nextLine());
                if (quantityValidate.validate(String.valueOf(soL))){
                    return soL;
                }
            }catch (Exception e){
                System.out.println("Chỉ nhập số");
            }
        }



    }


}
