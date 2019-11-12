package SearchEngine;

import DataClass.*;
import DataStructureClass.*;
import java.util.Date;

public class Database {
    
    public MyList<StudentRegistration> registerList = new MyArrayList<>();
    public MyList<Student> studentList = new MyArrayList<>();
    public MyList<Admin> adminList = new MyArrayList<>();
    
    public Database() {
        addStudentData();
        addAdminData();
    }
    
    private void addStudentData() {
        Student s1 = new Student("Kuek", "Yong Boon", "940526105481", "Foundation");
        StudentRegistration r1 = new StudentRegistration(new Date(), "Pending", s1);
        registerList.add(r1);
        studentList.add(s1);
        //System.out.println(s1);
    }
    
    private void addAdminData() {
        Admin a1 = new Admin("Ms","LIM YI EN","admin", "admin");
        Admin a2 = new Admin("Mr","SEE E JET","admin01", "admin01");
        adminList.add(a1);
        adminList.add(a2);
    }
    
}
