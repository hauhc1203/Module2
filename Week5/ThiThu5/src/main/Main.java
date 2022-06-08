package main;

import controller.InputController;
import controller.ProductController;
import model.Product;
import validate.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        InputController inputController=new InputController();
        ChoiceValidate choiceValidate=new ChoiceValidate();
        MSPValidate mspValidate=new MSPValidate();
        StringValidate stringValidate=new StringValidate();
        PriceValidate priceValidate=new PriceValidate();
        QuantityValidate quantityValidate=new QuantityValidate();

        ProductController productController=new ProductController(products,inputController,choiceValidate,mspValidate,stringValidate,priceValidate,quantityValidate);

        while (true){
            productController.menu();
        }

    }



}
