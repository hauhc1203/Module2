package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLHS {
    ArrayList<StudentProfile> dshs=new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");

    public void menu(){
        System.out.println("---------------------Menu---------------------");
        System.out.println("1. Nhap danh sach hoc sinh");
        System.out.println("2. Hs que TN, sn 1985");
        System.out.println("3. HS lop 10A1");
        System.out.println("4. show all");
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("nhap so luong ho so");
                int number=Integer.parseInt(sc.nextLine());
                nhap(number);
                break;
            case 2:
                showByAddressAndYear();
                break;
            case 3:
                showByLop();
                break;
            case 4:
                show();
                break;

        }
    }



    void nhap(int soHS){
        int c=0;
        while (c<soHS){
            String name;
            while (true){
                System.out.println("Nhập vào tên học sinh số "+(c+1));
                name=sc.nextLine();
                if ( Validate.checkName(name)){
                    break;
                }else {
                    System.out.println("Hãy nhập vào tên không có chữ số");
                    System.out.println("--------------------------------");
                }
            }

            Date birthDay= null;

            while (true){
                try {
                    System.out.println("Nhập vào ngày sinh");
                    birthDay = df.parse(sc.nextLine());
                    break;
                } catch (ParseException e) {
                    System.out.println("Nhập ngày sinh đúng định dạng dd/MM/yyyy. VD: 12/3/1998");
                    System.out.println("-------------------------------------------------------");
                }
            }
            System.out.println("Nhập địa chỉ");
            String address=sc.nextLine();
            System.out.println("Nhập lớp");
            String lop=sc.nextLine();
            System.out.println("Nhập khóa học");
            String khoaHoc=sc.nextLine();
            System.out.println("Nhập kỳ học");
            String kyHoc=sc.nextLine();
            add(new StudentProfile(name,birthDay,address,lop,khoaHoc,kyHoc));
            c++;
        }
    }

    void add(StudentProfile sp){
        dshs.add(sp);
    }

    void show(){
        for (StudentProfile s:dshs
             ) {
            System.out.println(s);
        }
    }

    void showByAddressAndYear(){
        for (int i = 0; i <dshs.size() ; i++) {
            String address=dshs.get(i).getAddress();
            int year=dshs.get(i).getBirthDay().getYear();
            if (address.equals("Thai Nguyen")&&year==85){
                System.out.println(dshs.get(i));
            }
        }
    }

    void showByLop(){
        for (int i = 0; i <dshs.size() ; i++) {
            String lop  =dshs.get(i).getLop();
            if (lop.equals("10A1")){
                System.out.println(dshs.get(i));
            }
        }
    }

}
