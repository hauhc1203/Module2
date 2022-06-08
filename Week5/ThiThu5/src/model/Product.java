package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSP;
    private String productName;
    private double price;
    private int quantity;
    private String description;

    public Product() {
    }

    public Product(int maSP, String productName, double price, int quantity, String description) {
        this.maSP = maSP;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product: " +
                "maSP: " + maSP +
                ", productName: " + productName +
                ", price: " + price +
                ", quantity: " + quantity +
                ", description: " + description
                ;
    }
}
