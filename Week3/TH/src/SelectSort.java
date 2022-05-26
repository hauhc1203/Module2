public class SelectSort {
    static int[] arr={1,3,2,6,3,5,7,3,51313,51,135,15};

    public static void  selectSort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int min=i;

            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min]  ;
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        selectSort(arr);
        for (int a: arr
             ) {
            System.out.println(a);
        }
    }
}
