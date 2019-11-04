package testforassignment;

import java.util.Iterator;
import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private Object[] data;
    private int count = 0;
    private final int FIXED_SIZE = 10;
    
    // this is initialize custom size arrayList
    public MyArrayList(int size) {
        this.data = new Object[size];
    }
    
    // this is initialize arrayList default size of 10.
    public MyArrayList() {
        this.data = new Object[FIXED_SIZE];
    }

    @Override
    public void add(Object obj) {
        if (count >= data.length) {
            this.resizeArray();
        }
       this.data[count++] = obj;
    }
    
    @Override
    public void add(Object o, int index) {
       
    }

    @Override
    public Object get(int obj) {
        if (obj < count) {
            return this.data[obj];
        } else {
          throw new ArrayIndexOutOfBoundsException();
        }
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
           moveForward(data,index);
           count -= 1;
        } else {
           throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
    
    @Override
    public boolean contains(Object o) {
        int length = data.length;
        boolean result = false;
        
        for (int i = 0; i < length; i++) {
            if (o.equals(data[i])) {
                result = true;
                break;
            }
        }
        
        return result;
    }
    
     

    @Override
    public int size() {
       
    }

    @Override
    public void remove(Object o) {
       
    }

    @Override
    public boolean isEmpty() {
       
    }

    @Override
    public int indexOf(Object o) {
      
    }

    @Override
    public int lastIndexOf(Object o) {
       
    }
    
    
    // will return a new array with bigger size
    private void resizeArray() {
        this.data = Arrays.copyOf(data, count + 10);
    }
    
    private void moveForward(Object data[],int index) {
        int count = data.length - index - 1;
        
        for (int i = index; i < count; i++) {
            data[i] = data[i+=1];
            data[i] = null;
        }
    }

   

    
    

}
