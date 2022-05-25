public class BubbleSort {
    static int []arr={1,2,3,4,5,6,7,8,9,10,12,12,1,21,2,12,12,12,12,1,2,3,123,12,3,123,12,123,12,3,12,3,123,12,3,21,3,12,3,123,12,4,12,3,123,12,3,12,3};

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

        System.out.println("truoc sx");
        for (int a:arr
             ) {
            System.out.println(a);
        }
        double start=System.currentTimeMillis();
        bubbleSort(arr);
        double stop=System.currentTimeMillis();

        System.out.println("thoi gian thuc hien: "+(stop-start));
        for (int a:arr
        ) {
            System.out.println(a);
        }
    }


}
