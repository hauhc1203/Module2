package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDay;
    private String address;

    public Student() {
    }

    public Student(String name, Date birthDay, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDay=" + df.format(birthDay) +
                ", address='" + address + '\'' +
                '}';
    }
}
