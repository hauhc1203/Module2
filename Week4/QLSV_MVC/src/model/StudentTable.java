package model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class StudentTable extends AbstractTableModel {

    private String [] colums={"MSSV","name","age","gioi tinh","địa chỉ","diem tb"};
    private ArrayList<Student> list;

    public StudentTable( ArrayList<Student> list1) {
        list=list1;
    }


    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public String[] getColums() {
        return colums;
    }

    public void setColums(String[] colums) {
        this.colums = colums;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colums.length;
    }

    @Override
    public String getColumnName(int column) {
        return colums[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Student student=list.get(rowIndex);

        switch (columnIndex){
            case 0:
                return student.getMsv();
            case 1:
                return student.getName();
            case 2:
                return student.getAge();
            case 3:
                return student.getGioiTinh();
            case 4:
                return student.getDiaChi();
            case 5:
                return student.getDiemTB();
            default:
                return null;

        }


    }
}
