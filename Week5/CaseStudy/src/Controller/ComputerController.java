package Controller;

import Model.Computer;
import io.ReadAndWrite;

import java.util.ArrayList;

public class ComputerController {

    private String path="D:\\IJ Project\\Module2\\Week5\\CaseStudy\\data\\computer.csv";
     private ReadAndWrite<Computer> readAndWrite=new ReadAndWrite<>();

    private   ArrayList<Computer> computers=readAndWrite.read(path);

    public  void delete(int index){
        computers.remove(index);

    }

    public void addP(Computer computer){
        computers.add(computer);
    }
    public void addP (String name,String chatLuong){
        computers.add(create(name,chatLuong));
    }
    public Computer create(String name,String chatLuong){
        return new Computer(name,chatLuong);

    }
    public Computer validateCName(String comupterName){
        for (Computer computer:computers){
            if (computer.getName().equalsIgnoreCase(comupterName)){
                return computer;
            }
        }
        return null;

    }


    public  ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public synchronized void save(){
        readAndWrite.write(computers,path);
    }

    public ArrayList<Computer> read(){
        return readAndWrite.read(path);
    }



}
