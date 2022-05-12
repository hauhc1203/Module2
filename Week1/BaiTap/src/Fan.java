

public class Fan {
    final public int SLOW=1;
    final public int MEDIUM=2;
    final public int FAST=3;
    private int speed =SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";


    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String result="";
        result+=this.speed+", ";
        result+=this.color+", ";
        result+=this.radius+", ";
        if (on){
            result+="fan is on";
        }else {
            result+="fan is off";
        }
        return result;
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");


        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
