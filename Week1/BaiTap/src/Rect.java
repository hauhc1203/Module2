public class Rect{
    int width;
    int height;
    public Rect(){

    }
    public Rect(int w,int h){
        this.height=h;
        this.width=w;
    }
    public int getArea(){
        return this.height*this.width;
    }
    public int getPerimeter(){
        return 2*(this.width+this.height);
    }
    public void display(){
        for (int i=0;i<this.height;i++){
            for (int j=0;j<this.width;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}