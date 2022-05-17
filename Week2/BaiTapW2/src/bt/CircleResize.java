package bt;

public class CircleResize extends Circle implements Resizeable{

    public CircleResize(double radius) {
        super(radius);
    }

    public CircleResize(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public CircleResize() {
    }

    @Override
    public void reSize(double percent) {
        super.setRadius(super.getRadius()*(percent/100));
    }
}
