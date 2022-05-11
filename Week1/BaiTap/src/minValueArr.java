import java.util.Scanner;

public class minValueArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int size=sc.nextInt();
        int []arr=new int[size];
        int min=999999999;
        for (int i=0;i<size;i++){
            System.out.print("arr["+i+"]:");
            arr[i]=sc.nextInt();
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("gia tri nho nhat cua mang la: "+min);
    }
}
