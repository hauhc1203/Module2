import java.util.Scanner;

public class searchValue {
    public static void main(String[] args) {

        int [] arr={1,3,2,5,7,4,0,6,3,7,8,3,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so muon tim kiem");
        String vitri="";
        int value=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                vitri+=String.valueOf(i)+" ";
            }
        }

        if (vitri!=""){
            System.out.println("Tim thay "+value+" o vi tri "+vitri);
        }else {
            System.out.println("khong tim thay");
        }
    }
}
