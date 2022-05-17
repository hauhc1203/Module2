package bt;

public class Main {
    public static void main(String[] args) {

        CircleResize circleResize=new CircleResize(30);

        System.out.println(circleResize);
        circleResize.reSize(50);
        System.out.println(circleResize);


        ResizeRectangle rect=new ResizeRectangle(10,20);
        System.out.println(rect);

        rect.reSize(50);
        System.out.println(rect);

        ResizeSquare resizeSquare=new ResizeSquare(100);
        System.out.println(resizeSquare);
        resizeSquare.reSize(30);
        System.out.println(resizeSquare);

    }
}
