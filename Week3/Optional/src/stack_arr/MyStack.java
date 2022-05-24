package stack_arr;

public class MyStack {
    private int capacity;
    private int[] stackArr;
    private int currentSize=0;
    private int index=0;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stackArr=new int[this.capacity];
    }

    public boolean isfull(){

        if (currentSize>=capacity){
            return true;
        }else return false;
    }

    public  boolean isEmty(){
        if (currentSize==0){
            return true;
        }else return false;
    }


    public  void push(int item){
        if (isfull()){
            System.out.println("stack da day");

        }else {
            stackArr[index++]=item;

            currentSize++;
        }
    }

    public void pop(){
        if (isEmty()){
            System.out.println("khong co gi de xoa");
        }else {
            index--;
            stackArr[index]=0;
            currentSize--;
        }
    }






    public void show(){
        for (int a:stackArr){
            System.out.println(a);
        }
    }




    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
