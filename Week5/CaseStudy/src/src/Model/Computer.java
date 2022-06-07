package src.Model;

import src.constant.ComputerConstant;

public class Computer {
    private String name;

    private String quality;
    private int status;

    public Computer(String name,String quality, int status) {
        this.name = name;
        this.quality=quality;
        this.status = status;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        String status1="";
        switch (status){
            case ComputerConstant.RUNNING:
                status1="Đang sử dụng";
                break;
            case ComputerConstant.OFF:
                status1="Đang tắt";
                break;
            case ComputerConstant.HONG:
                status1="Hỏng";
                break;
            case ComputerConstant.ON:
                status1="Sẵn sàng";
                break;
            default:
                break;
        }


        return "Computer: " +
                "name: " + name +
                ", quality: "+ quality+
                ", status: " + status1
                ;
    }
}
