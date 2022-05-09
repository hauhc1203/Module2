import java.util.Scanner;

public class chuyenDoiTien {


    public static void main(String[] args) {
        int rate=23000;
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao so USD");
        int usd=s.nextInt();
        int vnd=rate*usd;
        System.out.println(usd+" USD= "+vnd+" VND");
    }
}
