package src.Controller;

import src.Model.Computer;
import src.Model.ComputerTable;
import src.View.MainFrame;

import java.util.ArrayList;

public class ComputerController {
    static ArrayList<Computer> computers=new ArrayList<>();
     static ComputerTable computerTable=new ComputerTable(computers);
    static MainFrame computerTableView;
    public ComputerController() {
        computers.add(new Computer("Máy 1","Tốt",1));
        computers.add(new Computer("Máy 2","Khá",0));
        computers.add(new Computer("Máy 3","TB",2));
        computers.add(new Computer("Máy 4","Khá",3));
        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
//        computers.add(new Computer("Máy 1","Tốt",1));
//        computers.add(new Computer("Máy 2","Khá",0));
//        computers.add(new Computer("Máy 3","TB",2));
//        computers.add(new Computer("Máy 4","Khá",3));
//        computers.add(new Computer("Máy 5","Tốt",1));
    }


    public static void show(){

        computerTableView=new MainFrame(computerTable);
    }

    public static void delete(int index){

        computers.remove(index);
        computerTableView.setVisible(false);
        ComputerController.show();
        System.out.println(computers.size());

    }

//    public static void main(String[] args) {
//        ComputerController computerController=new ComputerController();
//        computerController.show();
//    }


}
