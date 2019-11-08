package SearchEngine;

import DataClass.*;
import DataStructureClass.*;
import java.util.Date;

public class Database {
    
    public MyList<StudentRegistration> registerList = new MyArrayList<>();
    public MyList<Student> studentList = new MyArrayList<>();
    
    public Database() {
        addData();
    }
    
    private void addData() {
        Student s1 = new Student("Kuek", "Yong Boon", "940526105481", "Foundation");
        s1.setStudentID();
        StudentRegistration r1 = new StudentRegistration(new Date(), "Pending", s1);
        registerList.add(r1);
        studentList.add(s1);
        //System.out.println(s1);
    }
    
}
