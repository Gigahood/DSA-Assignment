package SearchEngine;

import DataClass.*;
import Operation.StudentDetail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        banner();
        MenuOption();
    }
    
    public static void MenuOption() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Main Menu");
        System.out.println("01. Student Detail");
        System.out.println("Please Enter Menu Code");

        String input = scan.nextLine();
        
        switch (input) {
            case "01":
                StudentDetail studentDetail = new StudentDetail();
                studentDetail.Show();
                break;
            default:
                MenuOption();
                break;
        }
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
