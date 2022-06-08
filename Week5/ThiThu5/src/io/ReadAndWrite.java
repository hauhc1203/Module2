package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    File dssv=new File("D:\\IJ Project\\Module2\\Week5\\ThiThu5\\data\\dssp.csv");

    public void write(ArrayList<Product> products){
        try {
            FileOutputStream outputStream=new FileOutputStream(dssv);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> read(){

        try {

                FileInputStream inputStream=new FileInputStream(dssv);
                ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
                ArrayList<Product> productArrayList= (ArrayList<Product>) objectInputStream.readObject();
                objectInputStream.close();
                inputStream.close();
                return productArrayList;



        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean fileValidate(){
        return dssv.exists();
    }
}
