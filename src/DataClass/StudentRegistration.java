package DataClass;

import java.util.Calendar;
import java.util.Date;

public class StudentRegistration {
    // count is for the total number of student registered 
    private static long count = 0;
    private String registrationID;
    private Date registrationDate;
    private String registrationStatus;
    private Student student;
    private String password;

    public StudentRegistration() {
    }

    public StudentRegistration(Date registrationDate, String registrationStatus, Student student) {
        this.registrationDate = registrationDate;
        this.student = student;
        this.registrationStatus = registrationStatus;
        this.password = this.student.getIc();
        setRegistrationID();
    }

    public static long getCount() {
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

    public String getStatus() {
        return registrationStatus;
    }

    public void setStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
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
    
/*************************** Override**********************************************/
    @Override
    public String toString() {
        return "Student Registration ID : " + this.registrationID
                + "\nRegister Date : " + this.registrationDate
                + "\nRegister Status : " + this.registrationStatus
                + "\nPassword : " + this.password
                + this.student; 
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
