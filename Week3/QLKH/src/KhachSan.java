public class KhachSan {
   private String loaiPhong;
   private double gia;
   private String diaChiPhong;

    public KhachSan() {
    }

    public KhachSan(String loaiPhong, double gia, String diaChiPhong) {
        this.loaiPhong = loaiPhong;
        this.gia = gia;
        this.diaChiPhong = diaChiPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDiaChiPhong() {
        return diaChiPhong;
    }

    public void setDiaChiPhong(String diaChiPhong) {
        this.diaChiPhong = diaChiPhong;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "loaiPhong='" + loaiPhong + '\'' +
                ", gia=" + gia +
                ", diaChiPhong='" + diaChiPhong + '\'' +
                '}';
    }
}
