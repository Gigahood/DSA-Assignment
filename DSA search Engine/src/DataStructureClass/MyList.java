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
                    2. Item is not null
    Postcondition : 1. size of the list is increased
                    2. an item being added to the list
    Return        :    void
 */
    void add(T obj);
    
    //add a new Object to the list at the given position, if fail return
    // false, if true return true
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    void add(int index, T o);
    
    // return the current amount of elements inside the list
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    int size();
    
    // replace the current element at the given position
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    boolean replace(Integer givenPosition, T newEntry);
    
    // this will to get the item from the list
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    T get(int entry);
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    void removeAll();
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    void remove(int index);
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    void remove(T o);
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        : return true if contain the item
                        return false if it does not contain the item
    */
    boolean contains(T o);
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    boolean isEmpty();
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    boolean isFull();
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    int indexOf(T o);
    
    /*
        Description   : 
        Precondition  : 
        Postcondition : 
        Return        :
    */
    //int lastIndexOf(Object o);
}
