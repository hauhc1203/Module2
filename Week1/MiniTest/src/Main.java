public class Main {
    public static void main(String[] args) {
        ManagerNV qlnv=new ManagerNV();
        try {
            while (true){
                qlnv.menu();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
