package bai1;

import java.util.Date;

public class StudentProfile extends Student {
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public StudentProfile() {
    }

    public StudentProfile(String name, Date birthDay, String address, String lop, String khoaHoc, String kyHoc) {
        super(name, birthDay, address);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }
    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }
    @Override
    public String toString() {
        return "StudentProfile{ " +
                super.toString()+
                ", lop= '" + lop + '\'' +
                ", khoaHoc= '" + khoaHoc + '\'' +
                ", kyHoc= '" + kyHoc + '\'' +
                '}';
    }
}
