/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchEngine;

import Constant.StringVar;
import DataClass.Student;

/**
 *
 * @author User
 */
public class StudentModule {

    private Student student;
    private int index;
    private String input;

    public StudentModule(Student student, int index) {
        this.student = student;
        this.index = index;

        Navigation();
    }

    public void ShowStudentDetail() {
        System.out.println(String.format("|%-50s|", StringVar.LBL_STUDENT_DETAIL));
        System.out.println(String.format("|%-50s|", StringVar.LBL_STUDENT_ID + Main.db.studentList.get(index).getStudentID()));
        System.out.println(String.format("|%-50s|", StringVar.LBL_FIRST_NAME + Main.db.studentList.get(index).getFirstName()));
        System.out.println(String.format("|%-50s|", StringVar.LBL_LAST_NAME + Main.db.studentList.get(index).getLastName()));
        System.out.println(String.format("|%-50s|", StringVar.LBL_IC_NUMBER + Main.db.studentList.get(index).getIc()));
        System.out.println(String.format("|%-50s|", StringVar.LBL_STATUS + Main.db.studentList.get(index).getStudyStatus()));
        System.out.println(String.format("|%-50s|", StringVar.LBL_CGPA + Main.db.studentList.get(index).getCgpa()));
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
                break;
            }

            switch (input) {
                case "1":
                    ShowStudentDetail();
                    break;
            }
        }
    }

    public void Menu() {
        System.out.println("Student Module");
        System.out.println("1. View Student Detail");
        System.out.println("2. Return");
        System.out.print("Your Selection ---> ");
    }
}
