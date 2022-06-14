import java.util.LinkedList;

public class Ha {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        int value=l.poll();
        System.out.println(value);
    }
}
