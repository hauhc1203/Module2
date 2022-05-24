package hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Student> ds1=new HashMap<Integer, Student>();
        Set<Student> ds2=new HashSet<>();

        Student student1=new Student("hau",12,"haha1");
        Student student2=new Student("hai",12,"haha2");
        Student student3=new Student("ha",12,"haha3");
        Student student4=new Student("hung",12,"4");
        ds1.put(1,student1);
        ds1.put(2,student2);
        ds1.put(3,student1);
        ds1.put(4,student2);


        ds2.add(student1);
        ds2.add(student2);
        ds2.add(student1);
        ds2.add(student2);


        System.out.println(ds1);
        System.out.println(ds2);
    }



}
