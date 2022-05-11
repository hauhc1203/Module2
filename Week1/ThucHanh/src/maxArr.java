public class maxArr {
    public static void main(String[] args) {
        int[]arr={1,3,2,9,3,5,62,5,2,5,2,72,3,1};
        int max=arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }

        System.out.println("gia tri lon nhat cua mang la: "+max);
    }
}
