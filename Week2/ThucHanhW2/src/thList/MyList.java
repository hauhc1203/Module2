package thList;

import java.util.Arrays;

public class MyList<A> {
    private int size=0;
    static final int DEFAULT_CAPCITY=2;
    private Object elements[];

    public MyList() {
        elements=new Object[DEFAULT_CAPCITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(A e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public A get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (A) elements[i];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
