package io;

import Model.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteData {

    public ArrayList<Student> read(File file){
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            ArrayList<Student> a=(ArrayList<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
           return a ;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public void write (File file,ArrayList<Student> students){
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
