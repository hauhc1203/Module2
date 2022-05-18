import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public   class CanBo {

    private String ten;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String ten, Date ngaySinh, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    @Override
    public String toString() {
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "CanBo: " +
                " ten='" + ten + '\'' +
                ", ngaySinh= " + dateFormat.format(ngaySinh) +
                ", gioiTinh= " + gioiTinh +
                ", diaChi= ' " + diaChi + '\''
                ;
    }
}
