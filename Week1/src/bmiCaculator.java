import java.util.Scanner;

public class bmiCaculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao can nang(don vi kg )");
        double weight=s.nextDouble();
        System.out.println("Nhap vao chieu cao (don vi Mets)");
        double height=s.nextDouble();
        double bmi=weight/(height*height);
        String msg="";
        if (bmi>=30){
            msg="Obese";
        }else if (bmi>=25){
            msg="Overweight";
        } else if (bmi>=18){
            msg="Normal";
        }else {
            msg="Underweight";
        }

        System.out.println(msg);
    }
}
