package bt;

public class ResizeSquare extends Square implements Resizeable{

    public ResizeSquare(double side) {
        super(side);
    }

    public ResizeSquare() {
    }

    public ResizeSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void reSize(double percent) {
        super.setSide(super.getWidth()*(percent/100));

    }
}
