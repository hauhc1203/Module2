public class PartTime extends NhanVien{

    private int soNgay;

    public PartTime() {
    }

    public PartTime(int id, String name, int age, int soNgay) {
        super(id, name, age);
        this.soNgay = soNgay;
    }


    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public double getSalary() {
        return this.soNgay*200000;
    }

    @Override
    public String toString() {
        return "PartTime{" +super.toString()+

                ", soNgay=" + soNgay +
                '}';
    }
}