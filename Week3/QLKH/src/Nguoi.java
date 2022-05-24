import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Nguoi {
    private Name hoVaTen;
    private Date birthDay;
    private int CMND;







    public Nguoi() {
    }

    public Nguoi(Name hoVaTen, Date birthDay, int CMND) {
        this.hoVaTen = hoVaTen;
        this.birthDay = birthDay;
        this.CMND = CMND;
    }

    public Name getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(Name hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }


    @Override
    public String toString() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        return "Nguoi{" +
                "hoVaTen=" + hoVaTen +
                ", birthDay=" + dateFormat.format(birthDay) +
                ", CMND=" + CMND +
                '}';
    }
}
