package arrList;

import java.util.Arrays;

public class MyList<E>  {
    static final  int DEFAULT_CAPACITY=10;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private int size=0;
    private Object elementData[];

    public MyList() {
        elementData =new Object[DEFAULT_CAPACITY];
    }

    public Object[] getElementData() {
        return elementData;
    }

    public MyList(int capacity) {
        elementData =new Object[capacity];
    }

    public void growUp(){
        int newSize= elementData.length+1;
        elementData = Arrays.copyOf(elementData, newSize);

    }
    public void growUp(int size){
        int newSize= elementData.length+size;
        elementData = Arrays.copyOf(elementData, newSize);

    }


    public void add(int index,E e){

        if (index>=elementData.length||index<0){
            System.out.println("your index: "+index+" capacity: "+elementData.length);
        }else {
            if(size==elementData.length){
                growUp();
            }
            for(int i = elementData.length-1; i>index; i--){
                elementData[i]= elementData[i-1];
            }
            elementData[index]=e;
            size++;
        }
    }

    public Object remove(int index) {


        if (index>=elementData.length||index<0){
            return null;
        }else {
            Object oldValue = elementData[index];

            int numMoved = size - index - 1;
            if (numMoved > 0)
                System.arraycopy(elementData, index + 1, elementData, index, numMoved);
            elementData[--size] = null;
            return oldValue;
        }
    }

    public int size() {
        return size;
    }

    public  Object[] clone(){
        Object[] clone;
        clone=Arrays.copyOf(elementData,size);
        return clone;
    }
    public boolean contains(E e){

        if (indexOf(e)>0){
                return true;
        }

        return false;
    }
    public  int indexOf(E e){
        int index=-1;
        for (int i=0;i<elementData.length;i++){
            if (elementData[i]==e){
                index=i;
                break;
            }
        }
        return index;
    }
    public  void ensureCapacity(int minCapacity){
        if (minCapacity > elementData.length
                && !(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
                && minCapacity <= DEFAULT_CAPACITY)) {

            growUp(minCapacity);
        }
    }



    public boolean add(E e){
        if(size== elementData.length){
            growUp();
        }
        elementData[size++]=e;
        return true;
    }

    public E get(int index){

        if (index>elementData.length||index<0){
            return null;
        }
        else {
            E value=((E)elementData[index]);

            return value;

        }
    }



    public void clear() {


        for (int i=0; i <size ; i++){
            elementData[i] = null;
        }

    }
}
