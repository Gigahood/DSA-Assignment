package SearchEngine;

import Constant.StringVar;
import DataClass.Admin;

public class AdminModule {
    private Admin admin;
    private int index;
    private String input;

    public AdminModule() {
    }

    public AdminModule(Admin admin, int index) {
        this.admin = admin;
        this.index = index;
        
        Navigation();
    }
    
    public void Menu() {
        Main.clearScreen();
        System.out.println("------** Admin Page **-------");
        System.out.println("Welcome, "+Main.db.adminList.get(index).getGender()+" "+Main.db.adminList.get(index).getName()+" ~");
        System.out.println("1. Search Detail");
        System.out.println("2. Return");
        System.out.print("Your Selection ---> ");
    }
    
    public void Navigation() {

        while (true) {
            while (true) {
                Menu();
                input = Main.scan.nextLine();

                if (Main.checkInputMenu(2, input)) {
                    break;
                }
            }

            if (input.equals("2")) {
                Main.clearScreen();
                break;
            }

            switch (input) {
                case "1":
                    ShowSearchDetail();
                    break;
            }
        }
    }
    
    public void ShowSearchDetail(){
        System.out.println("Please enter the student ID:");
        String ID = Main.scan.nextLine();
        
        for (int index=0;index<Main.db.studentList.size();index++)
        {
            if (ID.equals(Main.db.studentList.get(index).getStudentID()))
            {
                System.out.println("-----------------------------------------------------");
                System.out.println(String.format("|%-50s|", StringVar.LBL_STUDENT_DETAIL));
                System.out.println("-----------------------------------------------------");
                System.out.println(String.format("|%-50s|", StringVar.LBL_STUDENT_ID + Main.db.studentList.get(index).getStudentID()));
                System.out.println(String.format("|%-50s|", StringVar.LBL_FIRST_NAME + Main.db.studentList.get(index).getFirstName()));
                System.out.println(String.format("|%-50s|", StringVar.LBL_LAST_NAME + Main.db.studentList.get(index).getLastName()));
                System.out.println(String.format("|%-50s|", StringVar.LBL_IC_NUMBER + Main.db.studentList.get(index).getIc()));
                System.out.println(String.format("|%-50s|", StringVar.LBL_STATUS + Main.db.studentList.get(index).getStudyStatus()));
                System.out.println(String.format("|%-50s|", StringVar.LBL_CGPA + Main.db.studentList.get(index).getCgpa()));
                System.out.println("----------------------------------------------------");
                System.out.println("Press Enter To Continue!");
                Main.scan.nextLine();
                System.out.println("");
                System.out.println("");
                break;
            }
            else
            {
               if (index==Main.db.studentList.size()-1)
               {
                    System.out.println("Student ID doesn't exist!");
                    System.out.println("Please press again.");
                    break;
               }

            }
        }
    }
}
