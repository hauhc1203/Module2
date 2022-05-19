package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {


    public static String fizzBuzz(int num){

        if(num%15==0){
            return "FizzBuzz";
        }else if (num%3==0){
            return "Fizz";
        }else if (num%5==0){
            return "Buzz";
        } else return docSo(num);
    }
    public static String docSo(int num){
        String result="";
        int hangchuc= num/10;
        int hangdonvi=num%10;
        if (hangchuc>0){
            switch (hangchuc){
                case 1:
                    result+="muoi ";
                    break;
                case 2:
                    result+="hai muoi ";
                    break;
                case  3:
                    result+="ba muoi ";
                    break;
                case 4:
                    result+="bon muoi ";
                    break;
                case 5:
                    result+="nam muoi ";
                    break;
                case 6:
                    result+="sau muoi ";
                    break;
                case 7:
                    result+="bay muoi ";
                    break;
                case 8:
                    result+="tam muoi ";
                    break;
                case 9:
                    result+="chin muoi ";

            }
        }
        switch (hangdonvi){
            case 1:
                result+="mot ";
                break;
            case 2:
                result+="hai";
                break;
            case  3:
                result+="ba";
                break;
            case 4:
                result+="bon";
                break;
            case 5:
                result+="nam";
                break;
            case 6:
                result+="sau";
                break;
            case 7:
                result+="bay";
                break;
            case 8:
                result+="tam";
                break;
            case 9:
                result+="chin";

        }


        return result;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int num=Integer.parseInt(sc.nextLine());
        System.out.println(fizzBuzz(num));
    }

}
