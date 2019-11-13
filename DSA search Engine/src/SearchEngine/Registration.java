package SearchEngine;

import DataClass.*;
import java.util.Date;
import java.util.Scanner;

public class Registration {
    Scanner scan = new Scanner(System.in);

    public Registration() {
        start();
    }
    
    public  void start() {
        registration();
    }
    
    public void registration() {
        System.out.print("Please enter first name : ");
        String firstName = scan.nextLine();
        System.out.print("Please enter last name : ");
        String lastName = scan.nextLine();
        System.out.print("Please enter you IC : ");
        String ic = scan.nextLine();
        System.out.print("Please enter your highest level of education : ");
        String edubg = scan.nextLine();
        
        Student newStudent = new Student(firstName, lastName, ic, edubg);
        StudentRegistration newRegister = new StudentRegistration(new Date(), "pending", newStudent);
        Main.db.registerList.add(newRegister);
        
        System.out.println(Main.db.registerList.size());
        System.out.println(Main.db.registerList.get(1));
    }
}
