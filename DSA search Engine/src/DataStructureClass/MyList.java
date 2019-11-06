/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructureClass;

/**
 *
 * @author User
 */
public interface MyList<T> {
    void add(T obj);
    //void add(int index, Object o);
    int size();
    Object get(int obj);
    void removeAll();
    void remove(int index);
    void remove(T o);
    boolean contains(T o);
    boolean isEmpty();
    int indexOf(T o);
    //int lastIndexOf(Object o);
}
