public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }


    public float[] getXYZ() {
        float []xyz= new float[3];
        System.arraycopy(super.getXY(),0,xyz,0,super.getXY().length);
         xyz[2]=this.z;
        return xyz;
    }

    @Override
    public String toString() {
        return "toa do 3d : ("+super.getX()+","+super.getY()+","+this.z+")" +"  la con cua toa do 2d: "+  super.toString();
    }
}
