package Controller;

import Model.Student;

import java.util.Comparator;

public class SortGiamDan implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getDiemTB()<o2.getDiemTB()){
            return 1;
        }else return -1;
    }
}
