package bt;

public class ColorAbleTest {
    public static void main(String[] args) {

        Shape []shapes=new Shape[6];
        shapes[0]=new ColorSquare(12);
        shapes[1]=new Circle(12);
        shapes[2]=new Rectangle(31,12);
        shapes[3]=new Square(13);
        shapes[4]=new ColorSquare(20);

        for (Shape s:shapes){
            if (s instanceof Colorable){
               System.out.print("dien tich hinh vuong:  " +((Square)s).getArea()+"   ");
               ((Colorable)s).howtoColor();
            }else if (s instanceof Circle){
               System.out.println("dien tich hinh tron:  " +((Circle)s).getArea());

            }else if (s instanceof Square){
                System.out.println("dien tich hinh vuong:  " +((Square)s).getArea());

            }else if (s instanceof Rectangle){
                System.out.println("dien tich hinh chu nhat:   " +((Rectangle)s).getArea());
            }

        }

    }
}
