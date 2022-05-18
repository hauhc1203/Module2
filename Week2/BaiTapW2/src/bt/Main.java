package bt;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape shapes[]=new Shape[5];
        shapes[0]=new ResizeRectangle(20,30);
        shapes[1]=new ResizeSquare(40);
        shapes[2]=new CircleResize(30);
        shapes[3]=new ResizeRectangle(10,20);
        shapes[4]=new ResizeSquare(30);


        //mang truoc resize
        for (Shape s:shapes){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------");
        //in mang hinh sau resize
        for (Shape s:shapes){
            Random r=new Random();
            int scale=r.nextInt(100)+100;

            System.out.println("Ty le tang "+scale+" %");
            if(s instanceof ResizeSquare){
                ((ResizeSquare)s).reSize(scale);
            }else if(s instanceof  CircleResize){
                ((CircleResize)s).reSize(scale);
            }else if (s instanceof ResizeRectangle){
                ((ResizeRectangle)s).reSize(scale);
            }
            System.out.println(s);

        }




    }
}
