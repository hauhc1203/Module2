package queue_linkedList_vong;

public class Queue extends Solution {
    private Node front;
    private Node rear;


    @Override
    void enQueue(int value) {
        Node newNode=new Node(value);

        if (rear==null){
            front=newNode;
            rear=newNode;
            rear.link=front;
        }else {
            rear.link=newNode;
            rear=newNode;
            rear.link=front;
        }

    }

    @Override
    void deQueue() {
        if (front==null){

        }else {
           if (front==rear){
               front=null;
               rear=null;
           }else {
               front=front.link;
               rear.link=front;
           }

        }
    }

    @Override
    void displayQueue() {

    }
}
