package hashMap_hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Student> ds1=new HashMap<Integer, Student>();
        Set<Student> ds2=new HashSet<>();
        ArrayList<Student> ds3=new ArrayList<>();


        Student student1=new Student("hau",12,"haha1");
        Student student2=new Student("hai",13,"haha2");
        Student student3=new Student("ha",14,"haha3");
        Student student4=new Student("hung",1,"4");
        ds1.put(1,student1);
        ds1.put(2,student2);
        ds1.put(3,student1);
        ds1.put(4,student2);


        ds2.add(student1);
        ds2.add(student2);
        ds2.add(student1);
        ds2.add(student2);


        ds3.add(student1);
        ds3.add(student4);
        ds3.add(student2);
        ds3.add(student3);

        System.out.println(ds1);
        System.out.println(ds2);

        System.out.println("-----------------------------");
        System.out.println(ds3);
        Collections.sort(ds3);

        System.out.println(ds3);
        ds3.sort(new SortByAge());
        System.out.println(ds3);
    }



}
