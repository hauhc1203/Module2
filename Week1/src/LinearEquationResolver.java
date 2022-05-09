import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a");
        float a= scanner.nextFloat();
        System.out.println("nhap b");
        float b=scanner.nextFloat();

        if(a==0&&b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }else if(a==0&&b!=0){
            System.out.println("Phuong trinh vo nghiem");
        }else {
            float nghiem=-b/a;
            System.out.println("phuong trinh da cho co nghiem duy nhat la "+nghiem);
        }


    }
}
