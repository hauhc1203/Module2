import java.util.Scanner;

public class chuyendoiNhiet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=-1;
        float f=0;
        float c=0;


        while (choice!=0){
            System.out.println("Ban muon chuyen doi nhiet do nhu the nao");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap vao nhiet do");
                    f=sc.nextFloat();
                    c=(5.0f/9.0f)*(f-32);
                    System.out.println(f+" do F bang "+c+" do C");
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("nhap vao nhiet do");
                    c=sc.nextFloat();
                    f=(9.0f/5.0f)*c+32;
                    System.out.println(c+" do C bang "+f+" do F");
                    System.out.println("");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }


    }
}
