import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban:");
        name=s.nextLine();
        System.out.println("Xin chao "+name);
    }
}
