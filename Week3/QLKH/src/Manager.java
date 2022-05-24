import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<KhachSan> dsp=new ArrayList<>();
    ArrayList<Nguoi> dskh=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    final static int PHONG=0;
    final static int KHACH_HANG=1;
    public void menu(){
        System.out.println("Menu");
        System.out.println("1. Tao phong moi");
        System.out.println("2. Tao khach hang moi");
        System.out.println("3. Hien thi ds phong");
        System.out.println("4. Hien thi ds khach hang");
        System.out.println("5. Tim kiem khac hang theo ten");
        System.out.println("nhap vao lua chon cua ban");
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                create(PHONG);
                break;
            case 2:
                create(KHACH_HANG);
                break;
            case 3:
                SortbyGia a= new SortbyGia();
                dsp.sort( a);
                show(PHONG);
                break;
            case 4:
                SortByDate s=new SortByDate();
                dskh.sort( s);
                show(KHACH_HANG);
                break;
            case 5:
                System.out.println("Nhap vao ten");
                String name=sc.nextLine();
                searchByName(name);
                break;

        }

    }
    public  void create(int doituong){
           if (doituong==KHACH_HANG){
               System.out.println("Nhap vao first name");
               String firstName=sc.nextLine();
               System.out.println("Nhap vao last name");
               String lastName=sc.nextLine();
               System.out.println("Nhap vao ngay sinh");
               int day=Integer.parseInt(sc.nextLine());
               System.out.println("Nhap vao thang sinh");
               int month=Integer.parseInt(sc.nextLine());
               System.out.println("Nhap vao nam sinh");
               int year=Integer.parseInt(sc.nextLine());
               System.out.println("Nhap vao so cmnd");
               int cmnd=Integer.parseInt(sc.nextLine());
               Nguoi kh=new Nguoi(new Name(firstName,lastName),new Date(year-1900,month-1,day),cmnd);
               add(kh);

           }else if (doituong==PHONG){
               System.out.println("Nhap loai phong");
               String loaiP=sc.nextLine();
               System.out.println("Nhap gia");
               double gia=Double.parseDouble(sc.nextLine());
               System.out.println("Nhap dia chi phong");
               String diaChiP=sc.nextLine();
               KhachSan phong= new KhachSan(loaiP,gia,diaChiP);
               add(phong);
           }
    }
    public void add(KhachSan e){
        dsp.add(e);
    }
    public void add(Nguoi e){
        dskh.add(e);
    }
    public void searchByName(String  name){
        for (Nguoi e:dskh){
            if (e.getHoVaTen().getLastName().equals(name)){
                System.out.println(e);
            }
        }

    }
    public void show(int doituong){

        if (doituong==KHACH_HANG)
        {
            for (Nguoi e:dskh
            ) {
                System.out.println(e);
            }
        }else if (doituong==PHONG){
            for (KhachSan e:dsp
            ) {
                System.out.println(e);
            }
        }
    }

}
