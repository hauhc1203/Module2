public class minArr {
    static int minA(int []arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int []arr={1,3,5,9,5,7,8,4,2,4,6,8,5,2};

        System.out.println(minA(arr));
    }
}
