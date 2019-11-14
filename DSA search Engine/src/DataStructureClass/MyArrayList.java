package DataStructureClass;

import java.util.Iterator;
import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private T[] data;
    private int count = 0;
    private final int FIXED_SIZE = 10;

    // this is initialize custom size arrayList
    public MyArrayList(int size) {
        this.data = (T[]) new Object[size];
    }

    // this is initialize arrayList default size of 10.
    public MyArrayList() {
        this.data = (T[]) new Object[FIXED_SIZE];
    }

    @Override
    public void add(T obj) {
        if (!this.isNull(obj)) {
            if (count >= data.length) {
                this.resizeArray();
            }
            this.data[count++] = obj;
        }

    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < count; i++) {
            if (o.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int entry) {
        checkArraySize(entry);
        return this.data[entry];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void removeAll() {
        data = null;
        count = 0;
    }

    @Override
    public void remove(int index) {
        if (index < count) {
            data[index] = null;
            moveForward(data, index);
            count -= 1;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return this.count;
    }
//

    // require search for the object, currently just a simple compare
    // improvement can use, apply index on the array to fasten the search process
    @Override
    public void remove(T item) {
        // check item is not null, list is not empty, and this list contain this item
        if (!this.isNull(item) && !this.isEmpty() && this.contains(item)) {
            int index = this.indexOf(item);
            moveForward(data, index);
            count--;
        }
    }

    @Override
    public int indexOf(T o) {
       
        for (int i = 0; i < count; i++) {
            if (data[i].equals(o)) {
                
                return i;
            }
        }
        return -1;
    }
//
//    @Override
//    public int lastIndexOf(T o) {
//       
//    }

    @Override
    public void add(int index, T o) {
//       checkArraySize(index);
//       moveBackward((count - 1), index, data);
//       data[index] = o;
//       count++;
    }

//    private void moveBackward(int count, int index, T data[]) {   
//        int next;
//        int previous;
//        
//        for (int i = count; i >= index; i--) {
//            next = ++i;
//            previous = i--;
//            
//            System.out.println(count + ""+next + " " + previous);
//        }
//    }
    private void checkArraySize(int size) {
        if (size > count) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean replace(Integer givenPosition, T newEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String str = "";
        
        for (int i = 0; i < count; i++) {
            str += data[i];
            str += ", ";
        }
        
        return str;
    }
    
    

    /**
     * ************************************************************************************
     */
    // will return a new array with bigger size
    private void resizeArray() {
        this.data = Arrays.copyOf(data, count * count);
    }

    private void moveForward(T data[], int index) {

        for (int i = index; i < count; i++) {
            data[i] = data[i + 1];
            data[i + 1] = null;
        }
    }

    private boolean isNull(T item) {
        return item == null;
    }

}
