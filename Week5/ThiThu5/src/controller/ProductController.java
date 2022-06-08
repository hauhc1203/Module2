package controller;

import model.Product;
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
    Scanner scanner=new Scanner(System.in);

    public ProductController(ArrayList<Product> products, InputController inputController, ChoiceValidate choiceValidate,MSPValidate mspValidate,StringValidate stringValidate,PriceValidate priceValidate,QuantityValidate quantityValidate) {
        this.products = products;
        this.inputController = inputController;
        this.choiceValidate = choiceValidate;
        this.mspValidate=mspValidate;
        this.stringValidate=stringValidate;
        this.priceValidate=priceValidate;
        this.quantityValidate=quantityValidate;
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
                show();
                break;
            case 2:
                add(create());
                break;
            case 3:
                int maSp=inputController.maSp(mspValidate);
                int index=getIndex(maSp);
                if (index>-1){
                    update();
                }
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 7:
                System.out.println(7);
                break;
            case 8:
                System.out.println(8);
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
            int maSP= inputController.maSp(mspValidate);
            String nameP=inputController.chuoi(stringValidate,"tên sản phẩm");
            double priceP=inputController.price(priceValidate);
            int quantity=inputController.quantity(quantityValidate);
            String description=inputController.chuoi(stringValidate,"mô tả");

            return new Product(maSP,nameP,priceP,quantity,description);
    }
    public void update(){



    }

    public void add(Product p){
        products.add(p);
    }



    public int getIndex(int maSp){

        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getMaSP()==maSp){
                return i;
            }
        }
        return -1;
    }







}
