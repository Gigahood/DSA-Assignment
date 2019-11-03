package testforassignment;

import java.util.ArrayList;
import java.util.List;

public class TestForAssignment {

    public static void main(String[] args) {
        MyList<Integer> a = new MyArrayList<Integer>();
        
        for (int i = 0; i < 100; i++) {
            a.add(i);
            System.out.println(a.get(i));
        }
    }
    
}
