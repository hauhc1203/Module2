public class MoveablePoint extends Point2D{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){

        float [] speed=new float[]{this.xSpeed,this.ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return super.toString()+", speed=("+this.xSpeed+","+this.ySpeed+")";
    }
    public MoveablePoint move(){
        super.setX(super.getX()+ this.xSpeed);
        super.setY(super.getY()+ this.ySpeed);
        return this;
    }
}
