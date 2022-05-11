import java.util.Scanner;

public class sumCot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so hang");
        int hang=sc.nextInt();
        System.out.println("Nhap vao so cot");
        int cot=sc.nextInt();

        int[][]arr=new int[hang][cot];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.print("nhap vao arr["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("" );
        System.out.println("Nhap vao cot muon tinh tong");
        int cot1=sc.nextInt();
        int sum=0;

        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                if(j==cot1){
                    sum+=arr[i][j];
                }
            }
        }

        System.out.println("tong cua cot "+cot1+" la "+sum);
    }
}
