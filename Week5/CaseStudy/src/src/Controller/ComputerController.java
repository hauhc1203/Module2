package src.Controller;

import src.Model.Computer;

import java.util.ArrayList;

public class ComputerController {
     ArrayList<Computer> computers=new ArrayList<>();



    public ComputerController() {
        computers.add(new Computer("Máy 1","Tốt"));
        computers.add(new Computer("Máy 2","Khá"));
        computers.add(new Computer("Máy 3","TB"));
        computers.add(new Computer("Máy 4","Khá"));
        computers.add(new Computer("Máy 5","Tốt"));
        computers.add(new Computer("Máy 6","Tốt"));
        computers.add(new Computer("Máy 7","Khá"));
        computers.add(new Computer("Máy 8","TB"));
        computers.add(new Computer("Máy 9","Khá"));
        computers.add(new Computer("Máy 10","Tốt"));

    }





    public  void delete(int index){
        computers.remove(index);

    }

    public void add(Computer computer){
        computers.add(computer);
    }
    public void add (String name,String chatLuong){
        computers.add(create(name,chatLuong));
    }
    public Computer create(String name,String chatLuong){
        return new Computer(name,chatLuong);

    }

    public  ArrayList<Computer> getComputers() {
        return computers;
    }
}
