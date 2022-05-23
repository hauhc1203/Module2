public class MyLinkedList<T> {
    private Node<T> root;
    private int numNodes=0;

    public MyLinkedList() {
    }

    public MyLinkedList(T t) {
        this.root = new Node<T>(t);
        numNodes++;
    }


    public void add(T t){
        if (root==null){
            root=new Node<>(t);
            numNodes++;
        }else {
            Node<T> tmp= root;
            while (tmp.getNext()!=null){
                tmp=tmp.getNext();
            }
            tmp.setNext(new Node<>(t));
            numNodes++;
        }

    }
    public void addFirst(T t){
        Node<T> tmp= root;
        root=new Node<>(t);
        root.setNext(tmp);
        numNodes++;
    }
    public  boolean add(int index, T t){
        if (index<0||index>=numNodes){
            return false;
        }else if (index==0){
            addFirst(t);
            return true;
        } else {
            Node<T> tmp= root;
            Node<T> holder;
            for (int i = 0; i < index-1; i++) {
                tmp=tmp.getNext();
            }
            holder=tmp.getNext();
            tmp.setNext(new Node<>(t));
            tmp.getNext().setNext(holder);
            numNodes++;
            return true;
        }
    }
    public  MyLinkedList<T> clone(){
        MyLinkedList<T> cloneList= new MyLinkedList<T>();

        Node<T> tmp= this.root.getNext();
        cloneList.root=new Node<T>(this.root.getData());
        Node<T>tmpC=cloneList.root;


        while (tmp!=null){
            tmpC.setNext(new Node<T>(tmp.getData()));
            tmpC= tmpC.getNext();
            tmp=tmp.getNext();
        }
        return cloneList;
    }

    public void printList(){
        Node<T> tmp=root;
        while (tmp!=null){
            System.out.println(tmp.getData());
            tmp=tmp.getNext();
        }
    }

    public int getNumNodes() {
        return numNodes;
    }
}
