import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getter(String value){
        if (value=="a"){
            return this.a;
        }else if (value=="b"){
            return this.b;
        }else if (value=="c"){
            return this.c;
        }else {
            System.out.println("Nhap vao a,b hoac c");
            return 0;
        }
    }
    public double getDiscriminant(){
        double delta;
        delta=Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double x1=(-this.b+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return x1;
    }
    public double getRoot2(){
        double x2=(-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
        return x2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=-1;



        while (choice!=0){
            System.out.println("---------Menu----------");
            System.out.println("1.Giai phuong trinh bac 2");
            System.out.println("0. Exit");


            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap vao a");
                    double a=scanner.nextDouble();
                    System.out.println("nhap vao b");
                    double b=scanner.nextDouble();
                    System.out.println("nhap vao c");
                    double c=scanner.nextDouble();
                    QuadraticEquation pt1=new QuadraticEquation(a,b,c);
                    if (pt1.getDiscriminant()==0){
                        System.out.println("Phuong trinh co nghiem kep x= "+pt1.getRoot1());
                    }else if (pt1.getDiscriminant()>0){
                        System.out.println("Phuong trinh da cho co 2 nghiem rieng biet la:");
                        System.out.println("x1= "+pt1.getRoot1());
                        System.out.println("x2= "+pt1.getRoot2());
                    }else {
                        System.out.println("delta = "+pt1.getDiscriminant()+" , Phuong trinh vo nghiem");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }








        }

    }


}
