package SearchEngine;

import DataClass.*;
import DataStructureClass.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        System.out.println(db.registerList.get(0));
        System.out.println(db.studentList.get(0));
        //banner();
        //test();
        
        //Registration.start();
    }
    
    public static void banner() {
        System.out.println("-----------------------");
        System.out.println("   Welcome To TARUC    ");
        System.out.println("-----------------------");
    }
    
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
    public static void test() {
       MyList<Integer> a = new MyArrayList<Integer>();
       List<Integer>b = new ArrayList<Integer>();
       
       for (int i = 0; i< 10000000; i++) {
           b.add(i);
       }
    }
    
}
