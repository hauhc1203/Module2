package arrList;

public class Test {
    public static void main(String[] args) {
       //ArrayList<Integer> al=new ArrayList<>(4);
       MyList<Integer> al=new MyList<>(4);
        al.add(1);
        al.add(12);
        al.add(12);
        al.add(3,7);

        System.out.println(al.get(12));
//        System.out.println( "remove value: "+al.remove(31));
//
//        System.out.println(al.contains(312));
//        System.out.println(al.indexOf(12));
        System.out.println("array:");
        for (Object a:  al.getElementData()
             ) {
            System.out.println( a);
        }




    }
}
