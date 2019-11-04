/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforassignment;

/**
 *
 * @author User
 */
public interface MyList<E> {
    void add(Object obj);
    void add(Object o, int index);
    int size();
    Object get(int obj);
    void removeAll();
    void remove(int index);
    void remove(Object o);
    boolean contains(Object o);
    boolean isEmpty();
    int indexOf(Object o);
    int lastIndexOf(Object o);
}
