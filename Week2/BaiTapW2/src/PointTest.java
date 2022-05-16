public class PointTest {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);
        Point3D point3D=new Point3D(3,2,3);
        System.out.println(point2D);

        for (float a:point3D.getXYZ()){
            System.out.println(a);
        }


        System.out.println(point3D);


    }
}
