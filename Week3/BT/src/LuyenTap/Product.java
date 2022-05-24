package LuyenTap;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double gia;


    public Product() {
    }

    public Product(int id, String name, double gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.gia<o.gia){
            return 1;
        }else return -1;
    }
}
