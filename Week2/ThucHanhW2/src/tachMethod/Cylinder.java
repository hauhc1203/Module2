package tachMethod;

public class Cylinder {
    public  double getVolume(double radius, double height){
        double volume=perimeter(radius)*height+2*baseArea(radius);
        return volume;
    }

    public double baseArea(double radius){
        return  Math.PI * radius * radius;
    }

    public double perimeter(double radius){
        return 2 * Math.PI  * radius;
    }


}
