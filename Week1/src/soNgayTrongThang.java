import java.util.Scanner;

public class soNgayTrongThang {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao thang muon kiem tra");
        int month=s.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("So ngay cua thang "+month+" la: "+31);
                break;
            case 2:
                System.out.println("So ngay cua thang "+month+" la: "+28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("So ngay cua thang "+month+" la: "+30);
                break;
        }
    }
}
