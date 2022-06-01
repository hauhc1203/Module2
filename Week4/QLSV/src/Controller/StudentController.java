package Controller;

import Model.Student;
import Validate.StudentValidate;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public final  int CREATE=0;
    public final int DEL=1;
    public final int UPDATE=2;
    ArrayList<Student> dssv=read();
    StudentValidate studentValidate=new StudentValidate();
    Scanner scanner=new Scanner(System.in);
    void menu(){
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN---");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.print("Chọn chức năng: " );
        int choice=studentValidate.choiceValidate();
        switch (choice){
            case 1:
                show();
                break;
            case 2:
                add(create());
                break;
            case 3:
                update();
                break;
            case 4:
                del();
                break;
            case 5:
                System.out.println("---Sắp xếp sinh viên theo điểm trung bình---");
                System.out.println("Chọn chức năng theo số để tiếp tục");
                System.out.println("1. Sắp xếp theo điểm trung bình tăng dần");
                System.out.println("2. Sắp xếp theo điểm trung bình giảm dần");
                System.out.println("3. Thoát");
                System.out.print("Chọn chức năng: ");
                int choice2=studentValidate.choiceValidate();
                switch (choice2){
                    case 1:
                        dssv.sort(new SortTangDan());
                        break;
                    case 2:
                        dssv.sort(new SortGiamDan());
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Lựa chọn không đúng");

                }

                break;
            case 6:
                write();
                 dssv=read();
                break;
            case 7:
                write();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này. Hãy chọn lại");
                System.out.println("-----------------------------------");
        }
    }
    Student create() {
        String mssv;
        while (true){
            mssv=studentValidate.mssvValidate(CREATE);
            if (findIndexByMSSV(mssv)<0){
                break;
            }else System.out.println("Mssv này đã tồn tại. Hãy nhập lại ");
        }

        String name= studentValidate.validateName();
        int age=studentValidate.ageValidate();
        String gioiTinh=studentValidate.gioiTinhValidate();
        String diaChi=studentValidate.diaChiValidate();
        float diemTB=studentValidate.diemTBValidate();
        return new Student(mssv,name,age,gioiTinh,diaChi,diemTB);
    }
    void add(Student s){
        dssv.add(s);
    }
    void update(){
       while (true){
           String mssv=studentValidate.mssvValidate(UPDATE);
           if (mssv==null){
               break;
           }else {
               int index=findIndexByMSSV(mssv);
               if (index>=0){
                   System.out.println("Nhập vào các thay đổi");
                   dssv.set(index,create());
                   break;
               }else {
                   System.out.println("MSSV không có trong danh sách");
               }
           }
       }
    }
    void del(){
        while (true){
            String mssv=studentValidate.mssvValidate(DEL);
            if(mssv==null){
                break;
            }else {
                int index=findIndexByMSSV(mssv);
                if (index>=0){
                    System.out.println("nhập 'y' để xác nhận xóa. nếu muốn hủy ấn Enter");
                    String confirm=scanner.nextLine();
                    if (confirm.equals("y")){
                        dssv.remove(index);
                        System.out.println("Đã xóa thành công");
                    }
                    break;
                }else {
                    System.out.println("MSSV không có trong danh sách");
                }
            }
        }
    }
    int findIndexByMSSV(String mssv){
        for (int i = 0; i <dssv.size() ; i++) {
            if (dssv.get(i).getMsv().equals(mssv)){
                return i;
            }
        }
        return -1;
    }
    void  show(){
        int count=5;
        int i=0;
        while (i<count){
            for (int j = i; j <count ; j++) {
                System.out.println(dssv.get(j));

                i++;
            }
            if (count==dssv.size()){
                System.out.println("------hết------");
                break;
            }
            String next=scanner.nextLine();
            count+=5;
            if (count>dssv.size()){
                count=dssv.size();
            }

        }
    }
    public void write(){
        ObjectOutputStream out=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new  FileOutputStream("D:\\IJ Project\\Module2\\Week4\\QLSV\\src\\Model\\danhsachSV.csv");
            out=new ObjectOutputStream(fileOutputStream);
            out.writeObject(dssv);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ghi vào file thành công");
    }
    ArrayList<Student> read(){
        ObjectInputStream inputStream;
        FileInputStream fileInputStream;
        try {
            fileInputStream=new FileInputStream("D:\\IJ Project\\Module2\\Week4\\QLSV\\src\\Model\\danhsachSV.csv");
            inputStream=new ObjectInputStream(fileInputStream);
             return  (ArrayList<Student>)inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
