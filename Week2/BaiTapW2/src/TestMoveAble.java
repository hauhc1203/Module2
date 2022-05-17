public class TestMoveAble {
    public static void main(String[] args) {
        MoveablePoint m=new MoveablePoint(1,2,3,4);
        System.out.println(m);
        m.move();
        System.out.println(m);
        m.setSpeed(1,2);
        m.move();
        System.out.println(m);
        m.setySpeed(1);
        m.move();
        System.out.println(m);

    }
}
