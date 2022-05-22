import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class ManagerNV  {

    Scanner sc=new Scanner(System.in);

    ArrayList<NhanVien> dsnv=new ArrayList<>();


    public void Menu(){
        System.out.println("1. Them NV");
        System.out.println("2. Sua Thong tin NV");
        System.out.println("3. Xoa NV");
        System.out.println("4. Tien Luong");
        System.out.println("5. Hien thi DSNV");
        System.out.println("0. Exit");
        System.out.println("Nhap lua chon:");
        int choice= Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("1. Part time");
                System.out.println("2. Full time");
                int choice1=Integer.parseInt(sc.nextLine());
                switch (choice1){
                    case 1:
                        NhanVien nv=createNV(false);
                        dsnv.add(nv);
                        break;
                    case 2:
                        nv=createNV(true);
                        dsnv.add(nv);
                        break;
                }
                break;
            case 2:
                System.out.println("1. Part time");
                System.out.println("2. Full time");
                choice1=Integer.parseInt(sc.nextLine());
                switch (choice1){
                    case 1:
                        NhanVien nv=createNV(false);
                        editNV(nv);
                        break;
                    case 2:
                        nv=createNV(true);
                        editNV(nv);
                        break;
                }
                break;
            case 3:
                System.out.println("Nhap id cua NV muon xoa");
                int id=Integer.parseInt(sc.nextLine());
                delNV(id);
                break;
            case 4:
                for (NhanVien nv:dsnv){
                    System.out.println(nv.getName()+" luong: "+(nv.getSalary()/1000000)+" trieu");
                }
                break;
            case 5:
                Collections.sort(dsnv);
                for (NhanVien nv:clone()){
                    System.out.println(nv);
                }
        }
    }

    public NhanVien createNV(boolean isFull){
        System.out.println("Nhap vao Id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao Ten:");
        String name=sc.nextLine();
        System.out.println("Nhap vao tuoi:");
        int age=Integer.parseInt(sc.nextLine());

        if (isFull){
            System.out.println("Nhap vao he so:");
            double heSo=Double.parseDouble(sc.nextLine());
            return new FullTime(id,name,age,heSo);
        }else {
            System.out.println("Nhap vao so Ngay lam:");
            int soNgay=Integer.parseInt(sc.nextLine());
            return new PartTime(id,name,age,soNgay);
        }
    }
//    public NhanVien[] addNV(NhanVien nhanVien){
//        NhanVien []dsnv1=new NhanVien[dsnv.length+1];
//        System.arraycopy(dsnv,0,dsnv1,0,dsnv.length);
//        dsnv1[dsnv1.length-1]=nhanVien;
//        dsnv=dsnv1;
//        return dsnv;
//    }
    public void editNV(NhanVien nhanVien){
        for (int i=0;i< dsnv.size();i++) {
            if (dsnv.get(i).getId()==nhanVien.getId()){
                dsnv.set(i,nhanVien);
            }
        }
    }

    static int i=0;
    public void delNV(int id){
       for (int i=0;i<dsnv.size();i++){
           if (dsnv.get(i).getId()==id){
                dsnv.remove(i);
           }
       }

    }
    public ArrayList<NhanVien> clone(){
        ArrayList<NhanVien> clone1=new ArrayList<>();
        clone1=(ArrayList<NhanVien>) dsnv.clone();
        return clone1;
    }






}