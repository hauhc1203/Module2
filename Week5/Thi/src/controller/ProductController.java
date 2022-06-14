package controller;

import constant.Constant;
import io.ReadAndWrite;
import model.Product;
import service.SortByGiaG;
import service.SortByGiaT;
import validate.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    ArrayList<Product> products;
    InputController inputController;
    ChoiceValidate choiceValidate;

    MSPValidate mspValidate;
    StringValidate stringValidate;
    PriceValidate priceValidate;
    QuantityValidate quantityValidate;

    ReadAndWrite readAndWrite;
    Scanner scanner=new Scanner(System.in);

    public ProductController(ArrayList<Product> products, InputController inputController, ChoiceValidate choiceValidate,MSPValidate mspValidate,StringValidate stringValidate,PriceValidate priceValidate,QuantityValidate quantityValidate,ReadAndWrite readAndWrite) {
        this.products = products;
        this.inputController = inputController;
        this.choiceValidate = choiceValidate;
        this.mspValidate=mspValidate;
        this.stringValidate=stringValidate;
        this.priceValidate=priceValidate;
        this.quantityValidate=quantityValidate;
        this.readAndWrite=readAndWrite;
    }


    public void menu(){
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM------");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi vào file");
        System.out.println("0. Thoát");
        System.out.print("Chọn chức năng: ");

        int choice=inputController.choice(choiceValidate);

        switch (choice){
            case 1:
                if (products.size()==0){
                    System.out.println("Chưa có thông tin");
                }else {
                    show();
                }
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
                System.out.println("------Sắp xếp theo giá------");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Hủy");
                System.out.print("Nhập vào lựa chon: ");
                int choice1=inputController.choice(choiceValidate);
                switch (choice1){
                    case 1:
                        products.sort(new SortByGiaG());
                        break;
                    case 2:
                        products.sort(new SortByGiaT());
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Không có chức năng này");
                        break;
                }
                break;
            case 6:
                showProductExpensivest();
                break;
            case 7:
                if (!readAndWrite.fileValidate()){
                    System.out.println("Không tìm thấy file chứa dữ liệu");
                }else {
                    if (products.size()>0){

                        System.out.println("Việc đọc file sẽ xoa hết dữ liệu hiện tại, bạn chắc chứ.");
                        System.out.println("1. Có");
                        System.out.println("2. Không");
                        System.out.print("Nhập vào lựa chọn: ");
                        int choice2=inputController.choice(choiceValidate);
                        if (choice2==1){
                            products= readAndWrite.read();
                        }else if (choice2==2){
                            break;
                        }else {
                            System.out.println("Không có lựa chọn này");
                        }
                    }else {
                        products= readAndWrite.read();
                    }

                }
                break;
            case 8:
                if (products.size()==0){
                    System.out.println("hiện tại chưa có dữ liệu để ghi");
                }else {
                    readAndWrite.write(products);
                }

                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public void show(){
        for (int i=0;i<products.size();i++) {
            System.out.println(products.get(i));
            if ((i+1)%5==0){
                scanner.nextLine();
            }
        }
    }

    public Product create(){
        String maSP;
            while (true){
                maSP= inputController.maSp(mspValidate, Constant.CREATE);
                if (getIndex(maSP)==-1){
                    break;
                }else {
                    System.out.println("Mã sản phẩm đã tồn tại" );
                }
            };
            String nameP=inputController.chuoi(stringValidate,"tên sản phẩm");
            double priceP=inputController.price(priceValidate);
            int quantity=inputController.quantity(quantityValidate);
            String description=inputController.chuoi(stringValidate,"mô tả");

            return new Product(maSP,nameP,priceP,quantity,description);
    }
    public void update(){
       while (true){
            String maSP=inputController.maSp(mspValidate,Constant.UPDATE);
        if (maSP==null){
            break;
        }
        int index=getIndex(maSP);
        if (index>-1){
            products.set(index,create());
            break;
        }else {
            System.out.println("Không tìm được sản phẩm với mã sản phẩm ở trên");
        }
       }
    }

    public void del(){
        while (true){
            String maSp=inputController.maSp(mspValidate,Constant.DELETE);
            if (maSp==null){
                break;
            }
            int index=getIndex(maSp);

            if (index>-1){
                System.out.println("Bạn chắc chắn muốn xóa?");
                System.out.println("1. Chắc chắn");
                System.out.println("2. Hủy");
                System.out.print("Nhập vào lựa chon: ");
                int choice=inputController.choice(choiceValidate);
                if (choice==1){
                    products.remove(index);
                }
                break;
            }else {
                System.out.println("Không tìm được sản phẩm với mã sản phẩm ở trên");
            }


        }
    }

    public void add(Product p){
        products.add(p);
    }
    public void showProductExpensivest(){
       if(products.size()>0){
           double max=products.get(0).getPrice();

           for (int i = 1; i <products.size() ; i++) {
               if (max<products.get(i).getPrice()){
                   max=products.get(i).getPrice();
               }
           }

           for (int i = 0; i <products.size() ; i++) {
               if (max==products.get(i).getPrice()){
                   System.out.println(products.get(i));
               }
           }
       }else {
           System.out.println("Chưa có dữ liệu");
       }

    }



    public int getIndex(String productCode){

        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getProductCode().equals(productCode)){
                return i;
            }
        }
        return -1;
    }

}
