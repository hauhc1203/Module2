import java.sql.Date;
import java.util.Scanner;

public class QLCB {
    Scanner sc=new Scanner(System.in);
    CanBo []dscb=new CanBo[0];
    public void menu(){
        System.out.println("-------Menu-------");
        System.out.println("1. Nhap Thong Tin Cho Can Bo Moi");
        System.out.println("2. Tim kiem theo Ten");
        System.out.println("3. Hien thi Thong tin Tim kiem duoc");
        System.out.println("4. Danh sach can bo");
        System.out.println("5. Exit");
        System.out.println("Nhap vao lua chon");
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("1. Tao Cong Nhan");
                System.out.println("2. Tao ky su");
                System.out.println("3. tao nhan vien");
                int choice1=Integer.parseInt(sc.nextLine());

                switch (choice1){
                    case 1:
                        CanBo cb=create(1);
                        add(cb);
                        break;
                    case 2:
                         cb=create(2);
                         add(cb);
                        break;
                    case 3:
                        cb=create(3);
                        add(cb);
                        break;
                }
                break;
            case 2:
                System.out.println("Nhap ten can bo can tim");
                String name=sc.nextLine();
                search(name);
                break;
            case 3:
                show();
                break;
            case 4:
                for (CanBo a:dscb){
                    System.out.println(a);
                }
                break;
            case 5:
                System.exit(0);
        }
    }
    public CanBo create(int chucvu){
        System.out.println("Nhap ten");
        String name=sc.nextLine();
        System.out.println("Nhap ngay sinh");
        int day=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang sinh");
        int month=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam sinh");
        int year=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh=sc.nextLine();
        System.out.println("Nhap dia chi");
        String diaChi=sc.nextLine();

           if(chucvu==1) {
               System.out.println("Nhap bac(1->7)");
               int bac = Integer.parseInt(sc.nextLine());
               return new CongNhan(name, new Date(year - 1900, month - 1, day), gioiTinh, diaChi, bac);
           }else  if(chucvu==2){
               System.out.println("Nhap nganh dao tao");
               String nganhDaoTao=sc.nextLine();
               return  new KySu(name,new Date(year-1900,month-1,day),gioiTinh,diaChi,nganhDaoTao);
            }else if(chucvu==3){
                System.out.println("Nhap Cong Viec");
                String congViec=sc.nextLine();
                return new NhanVien(name,new Date(year-1900,month-1,day),gioiTinh,diaChi,congViec);
        }else return null;


    }
    public CanBo[] add(CanBo cb){
            CanBo[]dscb1=new CanBo[dscb.length+1];
            System.arraycopy(dscb,0,dscb1,0,dscb.length);
            dscb1[dscb1.length-1]=cb;
            dscb=dscb1;
            return dscb;
    }

    public void search(String name){
        int i=0;
        for(CanBo cb: dscb){
            if (cb.getTen().equals(name)){
                i++;
            }
        }
        System.out.println("co "+i+" ket qua duoc tim thay");
    }
    public void show(){


    }
}
