public class ClassHCN {



    public static void main(String[] args) {
       try {
           Rect hcn1=new Rect();
           Rect hcn2=new Rect(3,2);

           System.out.println("Dien tich hcn la "+hcn2.getArea());
           System.out.println("Chu vi hcn la "+hcn2.getPerimeter());
           hcn1.display();
           hcn2.display();

       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
