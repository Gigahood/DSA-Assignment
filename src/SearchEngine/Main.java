package SearchEngine;

import DataClass.*;
import DataStructureClass.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static Database db = new Database();
    
    public static void main(String[] args) {
        mainMenu();
        //testingCI2222
        //test();
        
        //Registration r = new Registration();
        
        //Login l = new Login();
    }
    
    private static void test() {
        MyList<String> a = new MyArrayList<String>();
        
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        
        a.remove("1");
        
        System.out.println(a.indexOf(null));
    }
    
    public static void mainMenu() {
        String input;

        while (true) {
            // menu selection start
            while (true) {
                banner();
                mainMenuUI();
                input = scan.nextLine();

                if (checkInputMenu(4, input)) {
                    break;
                }
            } // menu selection end
            
            // if 4 end program else go into the category
            if (input.equals("4")) {
                break;
            }

            switch (input) {
                case "1":
                    new Login();
                    break;
                case "2":
                    new ViewRegistrationDetail();
                    break;
                case "3":
                    new Registration();
                    break;
            }
        }
    }
    
    private static void mainMenuUI() {
        System.out.println("");
        System.out.println("Please enter your selection : ");
        System.out.println("1. Login");
        System.out.println("2. View Registration Status");
        System.out.println("3. Register");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Your Selection ---> ");
    }
    
    public static boolean checkInputMenu(int limit, String input) {
        if (input.isEmpty()) {
            return false;
        }
        
        try {
            int inputInt = Integer.parseInt(input);
            return ((inputInt >= 1 && inputInt <= limit));
        } catch (Exception e) {
            return false;
        }
    }
    
//    public static void MenuOption() {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Main Menu");
//        System.out.println("01. Student Detail");
//        System.out.println("Please Enter Menu Code");
//
//        String input = scan.nextLine();
//        
//        switch (input) {
//            case "01":
//                StudentDetail studentDetail = new StudentDetail();
//                studentDetail.Show();
//                break;
//            default:
//                MenuOption();
//                break;
//        }
//    }

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
