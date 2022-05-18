import java.util.Date;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String ten, Date ngaySinh, String gioiTinh, String diaChi, int bac) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Chuc vu= Cong Nhan'" +   '\''+
                ", Bac = ' " + this.bac + '\'';
    }
}
