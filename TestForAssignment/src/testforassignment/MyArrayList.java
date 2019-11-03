/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforassignment;

import java.util.Iterator;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class MyArrayList<E> implements MyList<E>{
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
    public Object get(int obj) {
       return this.data[obj];
    }

    @Override
    public void removeAll() {
      
    }

    @Override
    public void remove(int index) {
        
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
    
    
    // will return a new array with bigger size
    private void resizeArray() {
        this.data = Arrays.copyOf(data, count + 10);
    }
    

}
