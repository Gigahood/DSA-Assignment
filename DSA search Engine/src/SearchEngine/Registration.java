package SearchEngine;

import DataClass.Student;
import DataClass.StudentRegistration;
import java.util.Date;
import java.util.Scanner;

public class Registration {
    Scanner scan = new Scanner(System.in);
    
    public static void start() {
        
    }
    
    public void registration() {
        System.out.println("Please enter first name : ");
        String firstName = scan.nextLine();
        System.out.println("Please enter last name : ");
        String lastName = scan.nextLine();
        System.out.println("Please enter you IC : ");
        long ic = Long.parseLong(scan.nextLine());
        System.out.println("Please enter your highest level of education : ");
        String edubg = scan.nextLine();
        System.out.println("Please select course : ");
        

        
    }
}
