package model;

public class Product {
    private String productCode;
    private String productName;
    private double price;
    private int quantity;
    private String description;

    public Product() {
    }

    public Product(String productCode, String productName, double price   , int quantity, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
                "maSP: " + productCode +
                ", productName: " + productName +
                ", price: " + price +
                ", quantity: " + quantity +
                ", description: " + description
                ;
    }

    public String toWirte() {
        return productCode +","+ productName +","+ price +","+ quantity +","+ description;
    }
}
