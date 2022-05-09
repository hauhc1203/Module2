import java.util.Scanner;

public class HCN {

    static int dienTich(int width, int height){
        return width*height;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao chieu rong:");
        int width=scanner.nextInt();
        System.out.println("Nhap vao chieu dai:");
        int height=scanner.nextInt();
        int dientich= dienTich(width,height);
        System.out.println("dien tich hinh chu nhat da cho la: "+dientich);
    }
}

