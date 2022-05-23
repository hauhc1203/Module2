public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList=new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(17);
        linkedList.addFirst(100);
 //       System.out.println( linkedList.add(0,1));
        System.out.println("linked list goc");
        linkedList.printList();
        System.out.println("num node: "+linkedList.getNumNodes());
        System.out.println("--------------------------");
        MyLinkedList<Integer> cloneList=linkedList.clone();
        System.out.println("clone");
        cloneList.printList();
    }
}
