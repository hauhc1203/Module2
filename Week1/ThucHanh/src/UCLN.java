import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        int a=sc.nextInt();
        int a1=a;
        System.out.println("nhap b");
        int b=sc.nextInt();
        int b1=b;

        try {
            String ucln="";
            if (a==0||b==0){
                ucln=" khong co";
            }else {
                while (a1 != b1) {
                    if (a1 > b1)
                        a1 = a1 - b1;
                    else
                        b1 = b1 - a1;
                }
                ucln=String.valueOf(a1);
            }

            System.out.println("ucln cua "+a+" va "+b+" la "+ucln);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
