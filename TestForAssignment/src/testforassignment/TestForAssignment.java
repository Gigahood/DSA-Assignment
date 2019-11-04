package testforassignment;

import java.util.ArrayList;
import java.util.List;

public class TestForAssignment {

    public static void main(String[] args) {
        MyList<Integer> a = new MyArrayList<Integer>();
        List<Integer> b  =  new ArrayList<Integer>(10);
        
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.add("t");
        
        System.out.println(a.contains("t"));
    }
    
}
