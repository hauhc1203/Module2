package BST_dequy;

public class BST {

    static int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};


    static int search(int dau,int cuoi, int key,int[] arr){
        if (dau<=cuoi){
            int giua=(dau+cuoi)/2;
            if (key>arr[giua]){
                dau=giua+1;
                return search(dau,cuoi,key,arr);
            }else if (key<arr[giua]){
                cuoi=giua-1;
                return  search(dau,cuoi,key,arr);
            }else {
                return giua;
            }
        }else return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(0,arr.length-1,3,arr));
        System.out.println(search(0,arr.length-1,1,arr));
        System.out.println(search(0,arr.length-1,100,arr));
    }





}
