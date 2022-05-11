import java.util.Scanner;
public class delValueArr {
    static int[] xoaPhantu(int []arr,int value,int c){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                c++;
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
                return   xoaPhantu(arr,value,c);
            }
        }
        int[]arr1=new int[arr.length-c];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        return arr1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,1,1};
        System.out.println("Mang ban dau la");
        for (int a:arr){
            System.out.print(a+"  ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so muon xoa");
        int value=sc.nextInt();
        int c=0;
        System.out.println("");
        System.out.println("Mang sau khi xoa");
        for (int a:xoaPhantu(arr,value,c)){
            System.out.print(a+"  ");
        }
    }
}