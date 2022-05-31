package tongSo;

import java.io.*;
import java.util.ArrayList;

public class SumFile {


    static int sumF(ArrayList<Integer> arr){
        int sum=0;

        for (Integer i:arr){
            sum+=i;
        }

        return sum;
    }

   static   ArrayList<Integer> readFile(File file){
        ArrayList<Integer> a=new ArrayList<>();

       FileReader fileReader= null;
       try {
           fileReader = new FileReader(file);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
           String line=null;
           while ((line=bufferedReader.readLine())!=null){
               a.add(Integer.parseInt(line));
           }
           return a;
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


   }

    public static void main(String[] args) {
        File file=new File("D:\\IJ Project\\Module2\\Week4\\file\\sum.txt");
        ArrayList<Integer> a=readFile(file);
        System.out.println("tong cua cac so trong file la: "+sumF(a));
    }

}
