public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape("blue", false);
        Circle circle=new Circle(10);
        Rectangle rect=new Rectangle(10,20);
        Square square1=new Square(10);

        circle.setFilled(false);
        circle.setColor("red");

        rect.setColor("blue");
        rect.setFilled(false);


        square1.setSide(30);
        square1.setColor("black");

        System.out.println("dien tich hinh tron la: "+circle.getArea());
        System.out.println("chu vi hinh tron la: "+circle.getPerimeter());

        System.out.println("dien tich hcn la: "+rect.getArea());
        System.out.println("chu vi hcn la: "+rect.getPerimeter());

        System.out.println("dien tich hinh vuong la: "+square1.getArea());
        System.out.println("chu vi hinh vuong la: "+square1.getPerimeter());

        System.out.println();
        System.out.println(shape.toString());
        System.out.println(rect.toString());
        System.out.println(circle.toString());
        System.out.println(square1.toString());




    }
}
