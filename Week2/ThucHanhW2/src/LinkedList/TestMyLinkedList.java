package LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(5,3);
        ll.add(2,9);
        ll.add(4,1);
        ll.printList();
        System.out.println("------------------------------------------------");
        System.out.println(ll.get(3) );



    }
}
