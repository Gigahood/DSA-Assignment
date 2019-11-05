package DataClass;

import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private long ic;
    private String eduBackground;
    //<editor-fold desc="extra entities tbc">
    private Date dateOfBirth;
    private String contactNumber;
    private String homeAddress;
    private String emailAddress;
    //</editor-fold>

    public Student() {

    }

    public Student(String firstName, String lastName, long ic, String eduBackground) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ic = ic;
        this.eduBackground = eduBackground;
    }

    //<editor-fold desc="extra constructor tbc">
    public Student(String firstName, String lastName, long ic, String eduBackground, Date dateOfBirth, String contactNumber, String homeAddress, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ic = ic;
        this.eduBackground = eduBackground;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
    }
    //</editor-fold>

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

    public long getIc() {
        return ic;
    }

    public void setIc(long ic) {
        this.ic = ic;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    //<editor-fold desc="extra get set method tbc">
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    //</editor-fold>
}
