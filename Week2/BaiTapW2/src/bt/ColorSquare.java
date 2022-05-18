package bt;

public class ColorSquare extends Square implements Colorable{

    public ColorSquare(double side) {
        super(side);
    }

    public ColorSquare() {
    }

    public ColorSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides..");
    }
}
