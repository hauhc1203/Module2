package ThucHanh;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CTable extends AbstractTableModel {

    ArrayList<Integer> list=new ArrayList<>();
    String [] colums={"id","name","age","địa chỉ","sđt"};



    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colums.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }


//    public static void main(String[] args) {
//        CTable a=new CTable();
////        TestTable testTable=new TestTable(a);
//    }
}
