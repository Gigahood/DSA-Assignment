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
        if (count >= data.length) {
            this.resizeArray();
        }
       this.data[count++] = obj;
    }
    
    @Override
    public boolean contains(T o) {
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
           moveForward(data,index);
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
    public void remove(T o) {
       for (int i = 0; i < data.length; i++) {
           if (data[i].equals(o)) {
               moveForward(data, i);
               break;
           }
       }
    }

    @Override
    public int indexOf(T o) {
      int i = 0;
      
      for (i = 0; i < data.length; i++) {
          if (data[i].equals(o)) {
               break;
           }
      }
      
      return i;
    }
//
//    @Override
//    public int lastIndexOf(T o) {
//       
//    }
    
    
    // will return a new array with bigger size
    private void resizeArray() {
        this.data = Arrays.copyOf(data, count * count);
    }
    
    private void moveForward(T data[],int index) {
        int count = data.length - index - 1;
        
        for (int i = index; i < count; i++) {
            data[i] = data[i+=1];
            data[i] = null;
        }
    }
    
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
        if (size > count) throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean replace(Integer givenPosition, T newEntry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    

}
