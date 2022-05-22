package th2;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ArrayList<ComparableCircle> circles = new ArrayList<>();
        circles.add(new ComparableCircle(3.6)) ;
        circles.add(new ComparableCircle()  );
        circles.add(new ComparableCircle(3.5, "indigo"));

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Collections.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}