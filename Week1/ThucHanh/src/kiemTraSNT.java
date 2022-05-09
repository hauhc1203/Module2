import java.util.Scanner;

public class kiemTraSNT {

    static boolean isSNT(int num){
        if(num<2){
            return false;
        }else {
            for (int i=2;i<num;i++){
                if (num%i==0){
                    return false;
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        try {
            String msg;
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap vao 1 so nguyen");
            int num=scanner.nextInt();
            if (isSNT(num)){
                msg=" la so nguyen to";
            }else {
                msg=" khong phai la so nguyen to";
            }
            System.out.println(num+msg);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
