import java.util.Scanner;

public class addValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[2];
        arr[0]=12;

        int []arr1=new int[2];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        for (int a:arr1){
            System.out.println(a);
        }
    }
}
