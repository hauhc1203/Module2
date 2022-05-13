import java.util.Scanner;
public class ManagerNV {
    NhanVien []dsnv=new NhanVien[0];
    Scanner sc=new Scanner(System.in);

    public  void menu(){
        System.out.println("-----------Menu-----------");
        System.out.println("1. Them nv");
        System.out.println("2. Sua thong tin NV");
        System.out.println("3. Xoa nv");
        System.out.println("4. Hien thi danh sach NV");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                NhanVien nv=create();
                System.out.println(nv.toString());
                dsnv=AddNV(dsnv,nv);
                break;
            case 2:
                nv=create();
                dsnv=EditNV(dsnv,nv);
                break;
            case 3:
                System.out.println("Nhap ID cua nhan vien can xoa");
                int id=Integer.parseInt(sc.nextLine());
                dsnv=DelNV(dsnv,id);
                break;
            case 4:
                for (NhanVien nv1:dsnv){
                    System.out.println(nv1.toString());
                }
                break;
        }
    }
    public NhanVien create(){
        System.out.println("Nhap vao ID");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao ten NV");
        String name=sc.nextLine();
        System.out.println("Nhap vao tuoi");
        int age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao dia chi");
        String address=sc.nextLine();
        return new NhanVien(id,name,age,address);
    }
    public  NhanVien[] AddNV(NhanVien[] arr, NhanVien nv){
        NhanVien []arr1=new NhanVien[arr.length+1];
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr1.length-1]=nv;
        return arr1;
    }
    public  NhanVien[] DelNV(NhanVien[] arr, int id){
        NhanVien []arr1=new NhanVien[arr.length-1];
        int i=0;
        for (NhanVien nv:arr){
            if (nv.getId()!=id){
                arr1[i]=nv;
                i++;
            }
        }
        return arr1;
    }
    public  NhanVien[] EditNV(NhanVien[] arr, NhanVien nv){

        for (NhanVien nv1:arr){
            if (nv1.getId()==nv.getId()){
                nv1.setName(nv.getName());
                nv1.setAge(nv.getAge());
                nv1.setAddress(nv.getAddress());
            }
        }
        return arr;
    }


}
