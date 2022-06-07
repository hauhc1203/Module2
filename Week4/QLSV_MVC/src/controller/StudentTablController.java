package controller;

import model.Student;
import model.StudentTable;
import view.StudentTableView;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTablController {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Student> arrayList=new ArrayList<>();

        arrayList.add(new Student("1","hau",24,"nam","ha noi",9.9f));



        StudentTableView a= new StudentTableView(new StudentTable(arrayList));
        System.out.println("Nhap vao lua chon");
        System.out.println( "1. dong giao dien");
        int choice=scanner.nextInt();
        if (choice==1){
            a.setVisible(false);
        }
    }
}
