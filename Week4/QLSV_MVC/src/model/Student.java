package model;

public class Student {
    private String msv;
    private String name;
    private int age;
    private String gioiTinh;
    private String diaChi;
    private float diemTB;


    public Student(String msv, String name, int age, String gioiTinh, String diaChi, float diemTB) {
        this.msv = msv;
        this.name = name;
        this.age = age;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Student: " +
                "msv='" + msv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB ;
    }
}
