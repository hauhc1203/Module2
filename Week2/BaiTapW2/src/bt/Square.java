package bt;

public class Square extends Rectangle{


    public Square(double side) {
        super(side,side);
    }
    public Square(){

    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side= "+super.getWidth()+", which is a subclass of "+super.toString();
    }
}
