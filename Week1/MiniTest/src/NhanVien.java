public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String address;
    public NhanVien(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        String result="";
        result+="ID: "+this.getId()+", ";
        result+="NAME: "+this.getName()+", ";
        result+="AGE: "+this.getAge()+", ";
        result+="ADDRESS: "+this.getAddress();
        return result;
    }
}
