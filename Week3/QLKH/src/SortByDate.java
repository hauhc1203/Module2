import java.util.Comparator;

public class SortByDate implements Comparator<Nguoi> {


    @Override
    public int compare(Nguoi o1, Nguoi o2) {
        if (o2.getBirthDay().before(o1.getBirthDay())){
            return 1;
        }
        else return -1;
    }
}
