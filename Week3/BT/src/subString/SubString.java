package subString;

import java.util.LinkedList;
import java.util.Scanner;

public class SubString {


    static void subString(String str){
        LinkedList<Character> subStringMax=new LinkedList<>();
        for (int i=0;i<str.length();i++){
            LinkedList<Character> list=new LinkedList<>();
            list.add(str.charAt(i));
            for (int j=i+1;j<str.length()-1;j++){
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>subStringMax.size()){
                subStringMax.clear();
                subStringMax.addAll(list);
            }
            list.clear();
        }
        for (Character c:subStringMax
             ) {
            System.out.print(c);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String str =sc.nextLine();
        subString(str);

    }
}
