package controller;

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
               System.out.println("Chỉ nhập số từ 0-8");
           }

        }

    }

    public int maSp(MSPValidate mspValidate){
        int maP;
        while (true){
           try {
               System.out.println("Nhập vào mã sản phẩm có 4 chữ số");
               maP=Integer.parseInt(scanner.nextLine());
               if (mspValidate.validate(String.valueOf(maP))){
                   return maP;
               }
           }catch (Exception e){
               System.out.println("Chỉ nhập số");
           }
        }
    }

    public String chuoi(StringValidate stringValidate,String str){
        String chuoi1;
        while (true){
            System.out.println("Nhập vào "+str);
            chuoi1=scanner.nextLine();
            if (stringValidate.validate(chuoi1)){
                return chuoi1;
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
