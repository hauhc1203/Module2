import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLHV {
    File qlhv=new File("qlhv.csv");
    File dslop=new File("dsl.csv");
    ArrayList<Student> dshv=new ArrayList<>();
    ArrayList<Lop> dsl=new ArrayList<>();
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc=new Scanner(System.in);
    public void menu(){
        System.out.println("--------------menu---------------");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Thêm lớp");
        System.out.println("3. Hiển thị học viên");
        System.out.println("4. Hiển thị danh sách học viên theo lớp");
        System.out.println("0. Exit");
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                if(dsl.size()>0){
                    System.out.println("Danh sách lớp");
                    showLop();
                    int index;

                   while (true){
                       try {
                           do {
                               System.out.println("Bạn muốn thêm học viên vào lớp nào?(Nhập Index của lớp)");
                               index=Integer.parseInt(sc.nextLine());
                               if (dsl.get(index).getSoLuongHienTai()>=dsl.get(index).getSoLuongToiDa()){
                                   System.out.println("Lớp bạn chọn đã đầy. Vui lòng chọn lớp khác");
                               }
                           }while (dsl.get(index).getSoLuongHienTai()>=dsl.get(index).getSoLuongToiDa());
                           createS(dsl.get(index));
                           break;
                       }catch (IndexOutOfBoundsException e){
                           System.out.println("Nhập vào index dựa theo danh sách ở trên");
                       }
                   }
                }else {
                    System.out.println("Hiện tại chưa có lớp nào");
                }
                break;
            case 2:
                createL();
                break;
            case 3:
                showS();
                break;
            case 4:
                if(dsl.size()>0){
                    System.out.println("Danh sách lớp");
                    showLop();
                    System.out.println("Bạn muốn xem học viên vào lớp nào?");
                    String className=sc.nextLine();
                    showSbyC(className);

                }else {
                    System.out.println("Hiện tại chưa có lớp nào");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!!!");
        }
    }
    void createS(Lop lop){
        System.out.println("Nhập vào tên học sinh");
        String nameS=sc.nextLine();
        System.out.println("Nhập vào tuổi ");
        int age=Integer.parseInt(sc.nextLine());
        Date birthDay=null;
        while (true){
            try {
                System.out.println("Nhập vào ngày sinh. (dd/MM/yyyy)");
                birthDay=df.parse(sc.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("Vui lòng nhập ngày sinh đúng định dạng: dd/MM/yyyy");
                System.out.println("--------------------------------------------------");
            }
        }
        int sdt;
       while (true){
           try {
               System.out.println("Nhập vào số điện thoại( bỏ qua số 0 ở đầu)");
               sdt=Integer.parseInt(sc.nextLine());
               break;
           }catch (Exception e){
               System.out.println("Chỉ nhập số ");
           }
       }
        System.out.println("Nhập vào quê quán");
        String address=sc.nextLine();
        addS(new Student(nameS,age,lop,birthDay,sdt,address));
        lop.setSoLuongHienTai(lop.getSoLuongHienTai()+1);

    }


    void createL(){
        System.out.println("Nhập vào tên lớp");
        String className=sc.nextLine();

        Date start=null;
        while (true){
            try {
                System.out.println("Nhập vào ngày bắt đầu. (dd/MM/yyyy)");
                start=df.parse(sc.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("Vui lòng nhập đúng định dạng: dd/MM/yyyy");
                System.out.println("--------------------------------------------------");
            }
        }
        System.out.println("Nhập vào khóa học");
        String khoaHoc=sc.nextLine();
        System.out.println("Nhập vào số lượng học viên tối đa");
        int max=Integer.parseInt(sc.nextLine());
        addL(new Lop(className,start,khoaHoc,max));
    }


    void addL(Lop l){
        dsl.add(l);
    }
    void addS(Student s){
        dshv.add(s);
    }





    void showLop(){
        int i=0;
        for (Lop l:dsl){
            System.out.println("Index: "+i+". "+l);
            i++;
        }
    }
    void showS(){
        for (Student s:dshv){
            System.out.println(s);

        }
    }
    void showSbyC(String className){
        for (int i=0;i<dshv.size();i++
             ) {
            if (dshv.get(i).getLop().getClassName().equals(className)){
                System.out.println(dshv.get(i));
            }
        }
    }

    void saveDSL(){
        try {
            dslop.createNewFile();
            PrintWriter printWriter =new PrintWriter(dslop);
            BufferedWriter bufferedWriter=new BufferedWriter(printWriter);
          //  for()


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
