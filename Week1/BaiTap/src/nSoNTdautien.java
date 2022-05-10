import java.util.Scanner;




public class nSoNTdautien {
    static boolean isSoNT(int num){
        if (num<2){
            return false;
        }else {
            for (int i=2;i<num;i++){
                if (num%i==0){
                    return false;
                }
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ban muon xem bao nhieu so nguyen to, tinh tu dau day");
        int num=sc.nextInt();
        int count=0;
        int j=2;
        System.out.println(num+" SO nguyen to dau tien la : ");
        while (count<num){
            if (isSoNT(j)){
                System.out.print(j+" ");
                count++;
            }
            j++;
        }

    }
}
