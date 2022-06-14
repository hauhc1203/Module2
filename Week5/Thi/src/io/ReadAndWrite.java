package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    File dssv=new File("D:\\IJ Project\\Module2\\Week5\\Thi\\data\\dssp.csv");



    public void write(ArrayList<Product> products){
        try {
            FileWriter fileWriter=new FileWriter(dssv);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Product Code,Product Name,Price,Quantity,Description");
            bufferedWriter.newLine();
            for (Product product : products) {
                bufferedWriter.write(product.toWirte());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> read(){

        try {
            FileReader fileReader=new FileReader(dssv);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            bufferedReader.readLine();
            ArrayList<Product>products1=new ArrayList<>();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String str[]=line.split(",");
                products1.add(new Product(str[0],str[1],Double.parseDouble(str[2]),Integer.parseInt(str[3]),str[4]));
            }
            bufferedReader.close();
            fileReader.close();
                return products1;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean fileValidate(){
        return dssv.exists();
    }
}
