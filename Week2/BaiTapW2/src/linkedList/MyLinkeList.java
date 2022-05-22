package linkedList;

public class MyLinkeList<E>
{

    private Node head;
    private int size=0;

    public MyLinkeList(Object head) {
        this.head = new Node(head);
        size++;
    }

    private class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }


    }

    public int size() {
        return size;
    }

    public void addFirst(Object e){
        Node tmp=head;
        head=new Node(e);
        head.next=tmp;
        size++;
    }
    public void add(int index,Object e){
        Node tmp=head;
        Node holder;
        if (index>=size||index<=0){
            System.out.println("your index "+index+" size: "+size);
        }else {
            for (int i=0;i<index-1;i++){
                tmp=tmp.next;
            }
            holder=tmp.next;
            tmp.next=new Node(e);
            tmp.next.next=holder;
            size++;
        }
    }
    public void addLast(Object e){
        Node tmp =head;
        for (int i = 0; i <size-1 ; i++) {
            tmp=tmp.next;
        }

        tmp.next=new Node(e);
        size++;


    }

    public E remove(int index){
        E value=null;
        if (index==0){
            value=(E)head.data;
            head=head.next;
            size--;
        } else if (index<size&&index>0){
            Node tmp=head;
            for (int i = 0; i <index-1 ; i++) {
                tmp=tmp.next;

            }
            value=(E)tmp.next.data;
            tmp.next=tmp.next.next;
            size--;
        }

        return value;
    }
    public boolean remove1(Object e){
        Node tmp=head;
        for (int i=0;i<size;i++){
            if (tmp.data==e){
                remove(i);
                return true;
            }
            tmp=tmp.next;
        }
        return false;
    }
    public boolean contains(Object e){
        if (indexOf(e)>0){
            return true;
        }else return false;

    }

    public int indexOf(Object e){
        int index=-1;
        Node tmp=head;
        for (int i=0;i<size;i++){
            if (tmp.data==e){
                index=i;
                break;
            }
            tmp=tmp.next;
        }

        return index;
    }

    public boolean add(Object e){
        addLast(e);
        return true;
    }
    public E get(int index){
        E value;
        if (index>=size||index<0){
            value=null;
        }else {
            Node tmp=head;
            for (int i=0;i<index;i++){
                tmp=tmp.next;
            }
            value=(E)tmp.data;
        }

        return value;
    }

    public E getFirst(){
        return (E)head.data;
    }
    public E getLast(){

        Node tmp =head;
        for (int i=0;i<size-1;i++){
            tmp=tmp.next;
        }
        return (E)tmp.data;


    }


    public void clear(){
        head=null;
    }

    public void show(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



}
