import java.util.Random;

public class QuickSort {

    static int partition(int arr[], int low, int high) {
        int indexPivot=high;
        int pivot = arr[high--];
        int temp;
        while (low<high){
            for (int i = low; i <high ;i++ ) {
                if (arr[i]<=pivot){
                    low++;
                }else break;
            }
            for (int j = high; j >low ;j--) {
                if (arr[j]>pivot){
                    high--;
                }else break;
            }
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

        }

        if (arr[low]>pivot){
            temp=arr[low];
            arr[low]=pivot;
            arr[indexPivot]=temp;
        }
        return low;
    }

   static   void sort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int []arr=new int[10];
        for (int i=0;i<10;i++){
            int r=new Random().nextInt(100)+1;
            arr[i]=r;
        }
        int n = arr.length;
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr, 0, n - 1);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
