package model;

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
}
