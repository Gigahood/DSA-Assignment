package SearchEngine;

import DataClass.Admin;
import DataClass.Student;
import static SearchEngine.Main.scan;

public class Login {
    Admin admin;
    Student student;
    int index;
    
    public Login() {
        String input;
        Main.clearScreen();
        
        System.out.println(Main.db.studentList.get(0).getStudentID());
        System.out.println(Main.db.studentList.get(0).getPassword());
        
        while (true) {
            while (true) {
                loginUI();
                input = Main.scan.nextLine();

                if (Main.checkInputMenu(3, input)) {
                    break;
                }
            }// menu selection end
            
            if (input.equals("3")) {
                break;
            }
            
            switch (input) {
                case "1" :
                    studentLogin();
                    break;
                case "2" :
                    adminLogin();
                    break;
            }
        }

    }
    
    private void loginUI() {
        System.out.println("Please select your role : ");
        System.out.println("1. Student");
        System.out.println("2. Admin");
        System.out.println("3. Return");
        
        System.out.print("Your Selection ---> ");
    }
    
    private void studentLogin() {

        System.out.print("Username : ");
        String username = Main.scan.nextLine();
        System.out.print("Password : ");
        String password = Main.scan.nextLine();

        if (validateLogin(username, password, "student")) {
            
            // successful login will go into studentModule
            StudentModule sm = new StudentModule(student, index);

        } else {
            
            // fail login will go back to loginMain
            System.out.println("Wrong username or password!");
            System.out.println("Press Enter To Continue!");
            Main.scan.nextLine();
            Main.clearScreen();
        }

    }
    
    private void adminLogin() {
        System.out.print("Username : ");
        String username = Main.scan.nextLine();
        System.out.print("Password : ");
        String password = Main.scan.nextLine();

        if (validateLogin(username, password, "admin")) {
            
            // successful login will go into studentModule
            AdminModule am = new AdminModule(index);

        } else {
            
            // fail login will go back to loginMain
            System.out.println("Wrong username or password!");
            System.out.println("Press Enter To Continue!");
            Main.scan.nextLine();
            Main.clearScreen();
        }
    }
    
    private boolean validateLogin(String username, String password, String role) {
        boolean valid = false;
        
        if (role.equals("student")) {
            for (int i = 0; i < Main.db.studentList.size(); i++) {
                if (Main.db.studentList.get(i).getStudentID().equals(username)) {
                    valid = Main.db.studentList.get(i).getPassword().equals(password);
                    index = i;
                    student = Main.db.studentList.get(i);
                    break;
                }
            }// end loop
        } // end if
        else if (role.equals("admin")) {
            for (int i = 0; i < Main.db.adminList.size(); i++) {
                if (Main.db.adminList.get(i).getUsername().equals(username)) {
                    valid = Main.db.adminList.get(i).getPassword().equals(password);
                    index = i;
                    admin = Main.db.adminList.get(i);
                    break;
                }
            }// end loop
        }
        return valid;
    }
    
}
