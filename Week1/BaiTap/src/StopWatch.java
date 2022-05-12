import java.util.Date;
import java.util.Random;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();

    }




    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
    public double start(){
        this.startTime=System.currentTimeMillis();
        return this.startTime;
    }
    public double stop(){
        this.endTime=System.currentTimeMillis();
        return endTime;
    }
    public double  getElapsedTime(){
       double elapsedTime = this.endTime-this.startTime;
        return elapsedTime;
    }

    public static void main(String[] args) {
        // khoi tao mang 1000 phan tu
        int []arr=new int[100000];

        StopWatch st=new StopWatch();

        //nhap gia tri random trong khoang tu 1 den 1000 vao mang
        for (int i=0;i<100000;i++){
            Random r=new Random();
            arr[i]=r.nextInt(100000)+1;
        }
        //in ra mang ban dau
        System.out.println("mang ban dau--------------------------------------------------------------------------------------------------------------------");
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println("");


        st.start();

        //sap xep mang theo thuat toan sx chon
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       st.stop();

        //in mang sau sx
        System.out.println("mang sau sx--------------------------------------------------------------------------------------------------------------------------");
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println("");
        System.out.println("Thoi gian chay ct:"+st.getElapsedTime()+" mili s");

    }

}
