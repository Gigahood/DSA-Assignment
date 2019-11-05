package DataClass;

import java.util.Calendar;
import java.util.Date;

public class StudentRegistration {
    private static int count = 0;
    private String registrationID;
    private Date registrationDate;
    private String courseCode;
    private String status;
    private Double cgpa;
    private Student student;
    private String password;

    public StudentRegistration() {
    }

    public StudentRegistration(Date registrationDate, String courseCode, String status, Double cgpa, Student student) {
        this.registrationDate = registrationDate;
        this.courseCode = courseCode;
        this.status = status;
        this.cgpa = cgpa;
        this.student = student;
        this.password = Long.toString(this.student.getIc());
        setRegistrationID();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StudentRegistration.count = count;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
/******************************************************************************/
    private void setRegistrationID() {
        count++;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String last2Digit = (Integer.toString(year)).substring(2);
        String formatedID = last2Digit + String.format("%05d",count);

        this.registrationID = formatedID;
    }
    
    
}
