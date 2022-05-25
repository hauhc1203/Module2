package maxSubString;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxSubString {
    static void subString(String str) {
        LinkedList<Character> maxsubString = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> subString = new LinkedList<>();
            subString.add(str.charAt(i));
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(j) > subString.getLast()) {
                    subString.add(str.charAt(j));
                } else {
                    break;
                }
            }
            if (subString.size() > maxsubString.size()) {
                maxsubString.clear();
                maxsubString.addAll(subString);
            }
            subString.clear();
        }
        for (Character c : maxsubString
        ) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String str = sc.nextLine();
        subString(str);


    }


}
