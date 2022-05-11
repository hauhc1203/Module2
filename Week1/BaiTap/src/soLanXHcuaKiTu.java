import java.util.Scanner;

public class soLanXHcuaKiTu {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ki tu muon kiem tra");
        String c=sc.nextLine();
        String str="haha das asj cjas";

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c.charAt(0)){
                count++;
            }
        }

        System.out.println("so lan xuat hien cua ki tu"+c+" trong chuoi "+str+" la: "+count);
    }
}
