package bt;

public class ResizeRectangle extends Rectangle implements Resizeable {
    public ResizeRectangle() {
    }

    public ResizeRectangle(double width, double length) {
        super(width, length);
    }

    public ResizeRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void reSize(double percent) {
        super.setWidth(super.getWidth()*(percent/100));
        super.setLength(super.getLength()*(percent/100));
    }
}
