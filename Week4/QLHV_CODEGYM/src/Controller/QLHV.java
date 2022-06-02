package Controller;

import Model.Lop;
import Model.Student;
import io.ReadAndWriteData;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLHV {

    File dshvB=new File("D:\\IJ Project\\Module2\\Week4\\QLHV_CODEGYM\\data\\dssv.csv");
    File dslB=new File("D:\\IJ Project\\Module2\\Week4\\QLHV_CODEGYM\\data\\dsl.csv");

    ReadAndWriteData readData=new ReadAndWriteData();


    File qlhv=new File("D:\\IJ Project\\Module2\\Week4\\file\\qlhv.csv");
    File dslop=new File("D:\\IJ Project\\Module2\\Week4\\file\\dsl.csv");
    ArrayList<Student> dshv=readData.read(dshvB);
    public ArrayList<Lop> dsl=new ArrayList<>();
    SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc=new Scanner(System.in);
    public void menu(){

        System.out.println("--------------menu---------------");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Thêm lớp");
        System.out.println("3. Hiển thị học viên");
        System.out.println("4. Hiển thị danh sách học viên theo lớp");
        System.out.println("0. Save and Exit");
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
                                   System.out.println("----------------------------------------------------");
                               }
                           }while (dsl.get(index).getSoLuongHienTai()>=dsl.get(index).getSoLuongToiDa());
                           createS(dsl.get(index));
                           break;
                       }catch (IndexOutOfBoundsException e){
                           System.out.println("Nhập vào index dựa theo danh sách ở trên");

                           System.out.println("--------------------------------------------------");
                       }
                   }
                }else {
                    System.out.println("Hiện tại chưa có lớp nào");
                    System.out.println("--------------------------------------------------");
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
                    System.out.println("--------------------------------------------------");
                }
                break;


            case 0:
                readData.write(dshvB,dshv);
//                saveDSL();
//                saveDSHV();
                System.exit(0);
            default:
                System.out.println("No choice!!!");
        }
    }
    void createS(Lop lop){
        System.out.println("Nhập vào tên học sinh");
        String nameS=sc.nextLine();
        int age;
        while (true){
           try {
               System.out.println("Nhập vào tuổi ");
               age=Integer.parseInt(sc.nextLine());
               break;
           }catch (Exception e){
               System.out.println("Nhập vào 1 số");
           }
        }
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
               System.out.println("--------------------------------------------------");
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
        int max;
        while (true)
        {
          try {
              System.out.println("Nhập vào số lượng học viên tối đa");
              max=Integer.parseInt(sc.nextLine());
              break;
          }catch (Exception e){
              System.out.println("Vui lòng Nhập số");
          }
         }
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
            for(Lop l:dsl){
                bufferedWriter.write(l.toSave());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            printWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void saveDSHV(){
        try {
            qlhv.createNewFile();

            PrintWriter printWriter =new PrintWriter(qlhv);
            BufferedWriter bufferedWriter=new BufferedWriter(printWriter);


            for(Student s:dshv){
                bufferedWriter.write(s.toSave());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            printWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    void loadDSL(){
        try {
            FileReader fileReader=new FileReader("D:\\IJ Project\\Module2\\Week4\\file\\dsl.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String []lop= line.split(",");
                String date=lop[1];
                addL(new Lop(lop[0],df.parse(date),lop[2],Integer.parseInt(lop[3]),Integer.parseInt(lop[4])));
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    void loadDSHV(){
        try {
            FileReader fileReader=new FileReader("D:\\IJ Project\\Module2\\Week4\\file\\qlhv.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String []dshv= line.split(",");
                Lop l=null;
                for (int i=0;i<dsl.size();i++){
                    if (dsl.get(i).getClassName().equals(dshv[5])){
                        l=dsl.get(i);
                    }
                }

                String date=dshv[2];
                addS(new Student(dshv[0],Integer.parseInt(dshv[1]),l,df.parse(date),Integer.parseInt(dshv[3]),dshv[4]));
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }


}
