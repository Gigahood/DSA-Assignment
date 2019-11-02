package testforassignment;

import java.util.ArrayList;
import java.util.List;

public class TestForAssignment {

    public static void main(String[] args) {
        MyList<Integer> a = new MyArrayList<Integer>();
        
        a.add(1);
        a.add(2);
        
        for (int i = 0; i < 2; i++) {
            System.out.println(a.get(i));
        }
        
        System.out.println("Helo!");
    }
    
}
