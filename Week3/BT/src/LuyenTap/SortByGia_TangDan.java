package LuyenTap;

import java.util.Comparator;

public class SortByGia_TangDan implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getGia()>o2.getGia()){
            return 1;
        }else return -1;
    }
}
