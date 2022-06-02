package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    private String nameS;
    private int age;

    private Lop lop;
    private Date birthDay;
    private int sdt;
    private String address;

    public Student() {
    }


    public Student( String name1, int age,Lop lop ,Date birthDay, int sdt, String address) {

        this.nameS = name1;
        this.age = age;
        this.lop=lop;
        this.birthDay = birthDay;
        this.sdt = sdt;
        this.address = address;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String toString() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        return "Student" +
                " nameS= '" + nameS + '\'' +
                ", age= " + age +
                ", birthDay= " + dateFormat.format(birthDay) +
                ", sdt= 0" + sdt +
                ", address= '" + address + '\'' +
                ", "+lop;
    }
    public  String toSave(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        return  nameS +
                "," + age +
                "," + dateFormat.format(birthDay) +
                "," + sdt +
                "," + address +
                ","+lop.toSave();
    }
}
