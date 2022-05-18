import java.util.Date;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String ten, Date ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }


    @Override
    public String toString() {
        return super.toString()+
                ", Chuc vu= Ky su'" +  '\''+
                ", Nganh Dao Tao ='" + this.nganhDaoTao + '\'';
    }
}
