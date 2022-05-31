package Validate;

import java.util.Scanner;

public class StudentValidate {
    public final  int CREATE=0;
    public final int DEL=1;
    public final int UPDATE=2;
    Scanner sc=new Scanner(System.in);
    public int count=0;
    public int choiceValidate(){
        int choice;
       while (true){
           try {
              choice=Integer.parseInt(sc.nextLine());
               break;
           }catch (Exception e){
               System.out.println("Vui lòng nhập vào số");
               System.out.println("-----------------------------");
           }
       }
       return choice;
    }
    public String mssvValidate(int state){

        String mssv;
        while (true){
            System.out.println("Nhập vào MSSV");
            mssv=sc.nextLine();
            if (state==CREATE||((state==DEL||state==UPDATE)&&count==0)){
                if (mssv.equals("")){
                    System.out.println("Không được bỏ trống");
                    System.out.println("-----------------------");
                }else
                {
                    count++;
                    return mssv;
                }
            }else if ((state==DEL||state==UPDATE)&&count>0){
                count=0;
                return null;
            }

        }
    }
    public String validateName() {
        String studentName;
        while (true) {

            System.out.println("Nhập vào Tên");
            studentName = sc.nextLine();
            if (studentName.equals("")) {
                System.out.println("Không được bỏ trống");
                System.out.println("-----------------------");
            } else {
                if(checkName(studentName)){
                    return studentName;
                }else {
                    System.out.println("Nhập tên không có số");
                    System.out.println("-----------------------");
                }
            }
        }
    }

    boolean checkName(String name){
        for (int i=0;i<name.length();i++){
            try {
                Integer.parseInt(Character.toString(name.charAt(i)));
                return false;
            }catch (Exception e){
            }
        }
        return true;
    }
    public int ageValidate(){
        int age;
        while (true){
            try {
                System.out.println("Nhập vào tuổi");
                age=Integer.parseInt(sc.nextLine());
                return age;
            }catch (Exception e){
                System.out.println("Nhập vào số");
                System.out.println("--------------------");
            }
        }
    }


    public String gioiTinhValidate(){
        while (true){
            try {

                System.out.println("1. Nam");
                System.out.println("0. Nữ");
                System.out.print("Nhập vào số tương ứng: ");
                int choice1=Integer.parseInt(sc.nextLine());
                if (choice1==1){
                    return "Nam";
                }else if(choice1==0){
                    return "Nữ";
                }else {
                    System.out.println("Vui lòng chon 1 hoặc 0");
                }
            }catch (Exception e){
                System.out.println("Nhập vào số");
                System.out.println("--------------------------");
            }
        }
    }

    public String diaChiValidate(){
        String diaChi;
        while (true){
            try {
                System.out.println("Nhập vào địa chỉ");
                diaChi=sc.nextLine();
                return diaChi;
            }catch (Exception e){
                System.out.println("Không được bỏ trống");
                System.out.println("--------------------");
            }
        }
    }

    public float diemTBValidate(){
        float diemTb;
        while (true){
            try {
                System.out.println("Nhập vào điểm trung bình");
                diemTb=Float.parseFloat(sc.nextLine());
                if (diemTb>10||diemTb<0){
                    System.out.println("Nhập điểm lớn hơn 0 và nhỏ hơn 10");
                    System.out.println("--------------------------------------");
                }else {
                    return diemTb;
                }
            }catch (Exception e){
                System.out.println("Nhập vào số");
                System.out.println("----------------------------");
            }
        }
    }


}
