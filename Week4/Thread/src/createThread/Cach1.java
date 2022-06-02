package createThread;

public class Cach1 extends Thread{


    public Cach1(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {
            System.out.println(this.getName()+" in ra: "+i);
            try {
                sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }



    public static void main(String[] args) {


        Cach1 thread=new Cach1("t1");
        Cach1 thread1=new Cach1("t2");

        thread.setPriority(6);
        thread1.setPriority(6);

        thread.start();
        thread1.start();



    }


}
