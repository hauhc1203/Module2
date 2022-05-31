package docfileCSV;

import java.io.*;

public class A {
    public static void main(String[] args) {
        File file=new File("D:\\IJ Project\\Module2\\Week4\\BTW4\\src\\docfileCSV\\a.csv");
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println("Stt: "+line.split(",")[0]+", Code: "+line.split(",")[1]+", Name: "+line.split(",")[2]);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
