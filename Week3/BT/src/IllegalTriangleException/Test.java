package IllegalTriangleException;

import java.util.Scanner;

public class Test extends Throwable{
    public Test() {
    }

    public Test(String message) {
        super(message);
    }
    static Scanner sc=new Scanner(System.in);

    static boolean nhap()throws Test{
        System.out.println("nhap vao 1 so nguyen duong");
        int i=sc.nextInt();
        if(i>0){
            return true;
        }else throw new Test("so da nhap la so am,hay nhap lai");
    }


    public static void main(String[] args) {

        boolean a=false;
        while (!a){
            try {
                a=nhap();
            }catch (Test t){
                System.out.println(t.getMessage());
            }
        }
    }

}
