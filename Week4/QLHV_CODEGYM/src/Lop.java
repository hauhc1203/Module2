import java.text.SimpleDateFormat;
import java.util.Date;

public class Lop {
    private String className;
    private Date start;
    private String khoaHoc;
    private int soLuongToiDa;
    private int soLuongHienTai=0;
    public Lop() {
    }

    public Lop(String name, Date start, String khoaHoc, int soLuongToiDa) {
        this.className = name;
        this.start = start;
        this.khoaHoc = khoaHoc;
        this.soLuongToiDa = soLuongToiDa;
    }

    public Lop(String className, Date start, String khoaHoc, int soLuongHienTai, int soLuongToiDa) {
        this.className = className;
        this.start = start;
        this.khoaHoc = khoaHoc;
        this.soLuongToiDa = soLuongToiDa;
        this.soLuongHienTai = soLuongHienTai;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public int getSoLuongHienTai() {
        return soLuongHienTai;
    }

    public void setSoLuongHienTai(int soLuongHienTai) {
        this.soLuongHienTai = soLuongHienTai;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        return "Lop:" +
                "name= '" + className + '\'' +
                ", start= " + dateFormat.format(start) +
                ", khoaHoc= '" + khoaHoc + '\'' +
                ", soLuong hien tai= " + soLuongHienTai+ '\'' +
                ", So luong toi da= "+soLuongToiDa;
    }
    public String toSave(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        return className +
                "," + dateFormat.format(start) +
                "," + khoaHoc +
                "," + soLuongHienTai+
                ","+soLuongToiDa;
    }
}
