/*
    Description   : 
    Precondition  : 
    Postcondition : 
    Return        :
 */
package DataStructureClass;

/**
 *
 * @author User
 */
public interface MyList<T> {
    
/*
    Description   : 1. add a new object at the end of the list
    Precondition  : 1. check if the list if full, add only if it is not full
    Postcondition : 1. size of the list is increased
                    2. an item being added to the list
    Return        : void
 */
    void add(T obj);
    
    //add a new Object to the list at the given position, if fail return
    // false, if true return true
    void add(int index, T o);
    
    // return the current amount of elements inside the list
    int size();
    
    // replace the current element at the given position
    boolean replace(Integer givenPosition, T newEntry);
    
    // this will to get the item from the list
    T get(int entry);
    void removeAll();
    void remove(int index);
    void remove(T o);
    boolean contains(T o);
    boolean isEmpty();
    boolean isFull();
    int indexOf(T o);
    //int lastIndexOf(Object o);
}
