package src.Model;

import src.constant.ComputerConstant;

public class Computer {
    private String name;

    private String quality;
    private double moneyPerHour=0.0;
    private int status=ComputerConstant.OFF;

    private String usedBY=null ;

    public Computer(String name,String quality) {
        this.name = name;
        this.quality=quality;
    }

    public Computer(String name, String quality, double moneyPerHour, int status, String usedBY) {
        this.name = name;
        this.quality = quality;
        this.moneyPerHour = moneyPerHour;
        this.status = status;
        this.usedBY = usedBY;
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
