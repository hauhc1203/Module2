import java.util.Scanner;

public class laiSuat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien muon vay");
        double loan=sc.nextDouble();
        System.out.println("Ty le lai suat(tinh theo thang),don vi %");
        double rate=sc.nextDouble();
        System.out.println("so thang vay");
        int month=sc.nextInt();
        double tienlai=0;
        for (int i=1;i<=month;i++){
            tienlai+=loan*(rate/100);

        }

        System.out.println("Tong lai suat nhan duoc la: "+tienlai);
    }
}
