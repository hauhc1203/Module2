package LuyenTap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PMLinkedList {


        LinkedList<Product> products=new LinkedList<>();
        Scanner sc=new Scanner(System.in);


        public void  menu(){
            System.out.println("____________________menu_________________________");
            System.out.println("1. Them");
            System.out.println("2. sua theo id");
            System.out.println("3. xoa theo id");
            System.out.println("4. hien thi dssp");
            System.out.println("5. tim kiem theo ten");
            System.out.println("6. sap xep");
            System.out.println("nhap vao lua chon");


            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    add(create());
                    break;
                case 2:
                    System.out.println("Nhap vao Id");
                    int id1= Integer.parseInt(sc.nextLine());
                    int index=findIndex(id1);

                    if(index!=-1){
                        edit(index,create());
                    }else {
                        System.out.println("Id nay khong co trong danh sach");
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao Id");
                    int id= Integer.parseInt(sc.nextLine());
                    index=findIndex(id);
                    if (index!=-1){
                        del(index);
                    }else
                        System.out.println("Id nay khong co trong danh sach");
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    System.out.println("Nhap vao ten");
                    String name=sc.nextLine();
                    find(name);
                    break;
                case 6:
                    System.out.println("1. tang dan");
                    System.out.println("2. giam dan");
                    System.out.println("nhap vao lua chon");
                    int choice1=Integer.parseInt(sc.nextLine());
                    if (choice1==1){
                        products.sort(new SortByGia_TangDan());
                    }else if (choice1==2){
                        Collections.sort(products);
                    }
                    break;
            }
        }


        public Product  create(){
            System.out.println("Nhap vao id");
            int id=Integer.parseInt(sc.nextLine());
            System.out.println("Nhap vao ten sp");
            String name=sc.nextLine();
            System.out.println("nhap vao gia sp");
            double gia=Double.parseDouble(sc.nextLine());
            return new Product(id,name,gia);
        }
        public  void add(Product p){
           products.add(p);
        }
        public int findIndex(int id){
            int index=-1;
            for (int i=0; i<products.size();i++){
                if (products.get(i).getId()==id){
                    index=i;
                    return index;
                }
            }
            return index;
        }


        public void edit(int index,Product p){
            products.set(index,p);
        }


        public void find(String name){
            for (int i=0;i<products.size();i++){
                if (products.get(i).getName().equals(name)){
                    System.out.println(products.get(i));
                }
            }
        }

        public void del(int index){
            products.remove(index);
        }
        public void show(){
            for (int i=0;i<products.size();i++){
                    System.out.println(products.get(i));
            }
        }
    }


