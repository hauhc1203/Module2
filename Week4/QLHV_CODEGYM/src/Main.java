public class Main {
    public static void main(String[] args) {
        QLHV qlhv=new QLHV();
        qlhv.loadDSL();
        qlhv.loadDSHV();
        while (true){
            qlhv.menu();
        }
    }
}
