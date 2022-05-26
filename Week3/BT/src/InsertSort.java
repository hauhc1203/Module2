import java.util.Random;

public class InsertSort {

    public static void insertSort(int[] arra){
        int pos, x;
        for(int i = 1; i < arra.length; i++){
            System.out.println("gan x="+arra[i]);
            x = arra[i];
            System.out.println("gan pos="+i);
            pos = i;
            while(pos > 0 && x < arra[pos-1]){
                System.out.println("doi cho "+pos+" va "+(pos-1));
                arra[pos] = arra[pos-1]; // đổi chỗ
                System.out.println("lui pos ve ben trai 1 don vi");
                pos--;
            }
            System.out.println("gan phan tu o vi tri "+pos+" ="+x);
            arra[pos] = x;
        }
    }

    public static void main(String[] args) {
        int []arr=new int[100];
        for (int i=0;i<100;i++){
            int r=new Random().nextInt(100)+1;
            arr[i]=r;
        }
        double start=System.currentTimeMillis();
        insertSort(arr);
        double stop=System.currentTimeMillis();


        System.out.println("thoi gian : "+(stop-start));



    }
}
