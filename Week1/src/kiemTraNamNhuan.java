import java.util.Scanner;

public class kiemTraNamNhuan {

    static boolean isNamNhuan(int year){
        boolean laNamNhuan= false;
        if(year%4==0){
           if (year%100==0){
               if (year%400==0){
                   laNamNhuan=true;
               }
           }else {
               laNamNhuan=true;
           }
        }
        return laNamNhuan;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("nhap vao nam muon kiem tra");
        int year =s.nextInt();
        if (isNamNhuan(year)){
            System.out.println("nam "+year+" la nam nhuan");
        }else {
            System.out.println("nam "+year+" khong la nam nhuan");
        }
    }
}
