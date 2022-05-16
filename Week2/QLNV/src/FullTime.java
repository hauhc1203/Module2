public class FullTime extends NhanVien{
    private double heSo;

    public FullTime() {
    }

    public FullTime(int id, String name, int age, double heSo) {
        super(id, name, age);
        this.heSo = heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    @Override
    public double getSalary() {
        return this.heSo*30*500000;
    }

    @Override
    public String toString() {
        return "FullTime{" +super.toString()+
                ", heSo=" + heSo +
                '}';
    }
}
