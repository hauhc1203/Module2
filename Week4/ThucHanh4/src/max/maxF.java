package max;

import java.io.*;

public class maxF {



    static int maxFile(File f){
        try {
            FileReader fileReader=new FileReader(f);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            int max=0;
            while ((line=bufferedReader.readLine())!=null){
                for (int i = 0; i <line.split(" ").length ; i++) {
                    if (Integer.parseInt(line.split(" ")[i])>max){
                        max=Integer.parseInt(line.split(" ")[i]);
                    }
                }

            }
            bufferedReader.close();
            fileReader.close();

            return max;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public static void main(String[] args) {
        File num=new File("D:\\IJ Project\\Module2\\Week4\\ThucHanh4\\src\\max\\num.txt");
        File result=new File("D:\\IJ Project\\Module2\\Week4\\ThucHanh4\\src\\max\\result.txt");

        try {
            FileWriter fileWriter=new FileWriter(result);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(Integer.toString(maxFile(num)));
            bufferedWriter.close();
            fileWriter.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
