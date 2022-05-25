import java.util.Random;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        boolean needSort=true;
        for (int i = 0; i < arr.length&&needSort ; i++) {
            needSort=false;
            for (int j = arr.length-1;j >i ; j--) {
                if (arr[j]<arr[j-1]){
                    System.out.println("swap arr["+j+"] va arr["+(j-1)+"]");
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    needSort=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr=new int[1000];
        for (int i=0;i<1000;i++){
            int r=new Random().nextInt(100)+1;
            arr[i]=r;
        }

        System.out.println("truoc sx");
        for (int a:arr
             ) {
            System.out.println(a);
        }
        double start=System.currentTimeMillis();
        bubbleSort(arr);
        double stop=System.currentTimeMillis();


        System.out.println("sau sx");
        for (int a:arr
        ) {
            System.out.println(a);
        }
        System.out.println("thoi gian thuc hien: "+(stop-start));
    }


}
