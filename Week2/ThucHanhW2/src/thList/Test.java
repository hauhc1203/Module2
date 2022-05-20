package thList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> arr1=new MyList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);



        arr1.get(10);

        for (int i=0;i< arr1.getSize();i++) {
            System.out.println(arr1.get(i));
        }

    }
}
