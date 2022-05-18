import java.util.Date;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String ten, Date ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Chuc vu= Nhan Vien'" +   '\''+
                ", Cong viec ='" + this.congViec + '\'';
    }
}
