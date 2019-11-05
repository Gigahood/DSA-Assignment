package SearchEngine;

import DataClass.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        banner();
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
    
}
