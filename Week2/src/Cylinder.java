public class Cylinder extends  Circle{
    private double height;

    public Cylinder() {
        this.height=10;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao "+this.height+" là lớp con của"+super.toString();
    }
}
