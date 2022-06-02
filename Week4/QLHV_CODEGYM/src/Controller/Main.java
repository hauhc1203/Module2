package Controller;

public class Main {
    public static void main(String[] args) {
        QLHV qlhv=new QLHV();
        qlhv.loadDSL();

        while (true){
            qlhv.menu();
        }
    }
}
