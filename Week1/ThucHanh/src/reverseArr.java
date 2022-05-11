
import java.util.Scanner;

public class reverseArr {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang");
        int size=scanner.nextInt();
        int[] arr;
        arr= new int[size];
        int i=0;
        while (i<size){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr[i]=scanner.nextInt();
            i++;
        }
        for (int j=0;j<arr.length/2;j++){

            int temp=arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
        }
        for (int a :arr){
            System.out.println(a);
        }
    }
}
