public class NhanVien implements Comparable<NhanVien> {
    private int id;
    private String name;
    private int age;

    public NhanVien(){

    }
    public NhanVien(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary(){
        return 0;
    }



    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age;
    }
    @Override
    public int compareTo(NhanVien o) {
        if (getId()> o.getId()){
            return 1;
        }else return -1;
    }
}