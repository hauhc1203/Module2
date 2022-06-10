package Controller;

import Model.Computer;
import io.ReadAndWrite;

import java.util.ArrayList;

public class ComputerController {
     ArrayList<Computer> computers=new ArrayList<>();
    String path="D:\\IJ Project\\Module2\\Week5\\CaseStudy\\data\\computer.csv";
    ReadAndWrite<Computer> readAndWrite=new ReadAndWrite<>();

    public ComputerController() {

    }

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
    public boolean validateCName(String comupterName){
        for (Computer computer:computers){
            if (computer.getName().equalsIgnoreCase(comupterName)){
                return false;
            }
        }
        return true;

    }


    public  ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void save(){
        readAndWrite.write(computers,path);
    }

    public ArrayList<Computer> read(){
        return readAndWrite.read(path);
    }



}
