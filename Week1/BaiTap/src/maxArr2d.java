import java.util.Random;

public class maxArr2d {
    public static void main(String[] args) {
        int [][]arr2d=new int[2][4];

        for (int i=0;i<arr2d.length;i++){
            for (int j=0;j<arr2d[0].length;j++){
                Random r=new Random();

                arr2d[i][j]=r.nextInt(100)+1;

            }
        }
        int max=arr2d[0][0];
        System.out.println("cac phan tu cua mang la: ");
        System.out.println("");
        for (int a[]:arr2d){
            for (int a1:a){
                if(a1>max){
                    max=a1;
                }
                System.out.print(a1+" ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Gia tri lon nhat trong mang la:  "+max);
    }
}
