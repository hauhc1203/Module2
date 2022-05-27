package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {


    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

    public boolean isTamGiac(int s1, int s2, int s3) throws IllegalTriangleException {
        int sum3=s1+s2;
        int sum2=s1+s3;
        int sum1=s2+s3;

        if (s1<0||s2<0||s3<0) {
            throw new IllegalTriangleException("Canh tam giac la 1 so duong");
        }else if (sum1<=s1||sum2<=s2||sum3<=s3){
            throw new IllegalTriangleException("Tong 2 canh nho hon canh con lai");
        }
        else {
            return true;
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IllegalTriangleException e=new IllegalTriangleException();
        System.out.println("Nhap vao canh a");
        int side1=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao canh b");
        int side2=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao canh c");
        int side3=Integer.parseInt(sc.nextLine());


        try {
            System.out.println(e.isTamGiac(side1,side2,side3));
        }catch (IllegalTriangleException r){
            System.out.println(r.getMessage());
        }
    }
}
