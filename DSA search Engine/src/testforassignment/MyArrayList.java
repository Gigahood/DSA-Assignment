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
    
//    @Override
//    public void add(int index, Object o) {
//       checkArraySize(index);
//       
//       moveBackward((count - 1), index, data);
//       data[index] = o;
//       count++;
//    }
    
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
    public Object get(int obj) {
        checkArraySize(obj);
        return this.data[obj];
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
    public void remove(Object o) {
       for (int i = 0; i < data.length; i++) {
           if (data[i].equals(o)) {
               moveForward(data, i);
               break;
           }
       }
    }


//
    @Override
    public int indexOf(Object o) {
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
//    public int lastIndexOf(Object o) {
//       
//    }
    
    
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
    
//    private void moveBackward(int count, int index, Object data[]) {   
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
        if (size >= count) throw new ArrayIndexOutOfBoundsException();
    }

   

    
    

}
