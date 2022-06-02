package createThread;

public class Cach2 implements Runnable{


    private String nameT;
    public Cach2(String n) {
        nameT=n;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(nameT+" in ra "+  i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }




    public static void main(String[] args) {
        Cach2 cach2=new Cach2("t1");
        Cach2 cach21=new Cach2("t2");


        Thread a=new Thread(cach2);
        Thread b=new Thread(cach21);
        a.setPriority(10);
        a.start();
        b.start();


    }




}
