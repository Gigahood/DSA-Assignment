package DataClass;

import java.util.Calendar;

public class Student {
    // count represent total number of student in current semester
    private static int count = 0;
    private String studentID;
    private String firstName;
    private String lastName;
    private String ic;
    private String eduBackground;
    private String password;
    private String studyStatus;
    private Double cgpa;
    //private StudentRegistration registration;

    public Student() {

    }
    
    public Student(String firstName, String lastName, String ic ,
            String eduBackground) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ic = ic;
        this.password = ic;
        this.eduBackground = eduBackground;
        this.cgpa = 0.00;
       // this.registration = registration;
        setStudentID();
    }

//    //<editor-fold desc="extra constructor tbc">
//    public Student(String firstName, String lastName, long ic, String eduBackground, Date dateOfBirth, String contactNumber, String homeAddress, String emailAddress) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.ic = ic;
//        this.eduBackground = eduBackground;
//        this.dateOfBirth = dateOfBirth;
//        this.contactNumber = contactNumber;
//        this.homeAddress = homeAddress;
//        this.emailAddress = emailAddress;
//    }
//    //</editor-fold>

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(String studyStatus) {
        this.studyStatus = studyStatus;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

//    public StudentRegistration getRegistration() {
//        return registration;
//    }
//
//    public void setRegistration(StudentRegistration registration) {
//        this.registration = registration;
//    }
    
/*************************** Override**********************************************/
    @Override
    public String toString() {
        return "Password" + this.password
                + "\nID : " + this.studentID; 
    }
    
/******************************************************************************/
    public void setStudentID() {
        count++;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String last2Digit = (Integer.toString(year)).substring(2);
        String formatedID = last2Digit + String.format("%05d",count);

        this.studentID = formatedID;
    }

}
