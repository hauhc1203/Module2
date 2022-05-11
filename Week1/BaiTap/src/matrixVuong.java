import java.util.Scanner;

public class matrixVuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang");
        int size=sc.nextInt();
        int [][]arr=new int[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print("arr["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] r :arr){
            for (int b:r){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        int sum1=0;
        int sum2=0;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(i==j){
                    sum1+=arr[i][i];
                }
            }
        }
        for (int i=0;i<size;i++){
            for (int j=size-1;j>=0;j--){
                if(j==size-1-i){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo 1 la: "+sum1);
        System.out.println("Tong duong cheo 2 la: "+sum2);

    }
}
