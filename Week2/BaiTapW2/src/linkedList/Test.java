package linkedList;

public class Test {
    public static void main(String[] args) {
        //LinkedList<Integer> linkedList=new LinkedList<>();
        MyLinkeList<Integer> linkedList=new MyLinkeList<>(11);
        linkedList.addFirst(10);
        linkedList.addLast(13);
        linkedList.add(2,12);
        linkedList.addLast(14);
        linkedList.addLast(15);
        linkedList.addLast(16);
        linkedList.addLast(17);


    //   System.out.println("gia tri bi xoa la: "+linkedList.remove(7));

        System.out.println("da xoa:"+linkedList.remove1(19));


        System.out.println("size:"+linkedList.size());
        System.out.println(linkedList.contains(11));
        System.out.println("gia tri "+linkedList.get(7));
        System.out.println("head: "+linkedList.getFirst());
        System.out.println("last: "+linkedList.getLast());

        linkedList.clear();
        linkedList.show();







//        for (int i = 0; i <linkedList.size() ; i++) {
//            System.out.println(linkedList.get(i));
//        }


    }
}
