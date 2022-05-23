import java.util.Comparator;

public class SortbyGia extends KhachSan implements Comparator<KhachSan> {

    @Override
    public int compare(KhachSan o1, KhachSan o2) {
        if (o1.getGia()>o2.getGia()){
            return 1;
        }else return -1;
    }
}
