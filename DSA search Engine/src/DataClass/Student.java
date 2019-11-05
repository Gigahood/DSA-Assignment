package DataClass;

public class Student {
    private String firstName;
    private String lastName;
    private long ic;
    private String eduBackground;

    public Student() {
    }
    
    public Student(String firstName, String lastName, long ic ,String eduBackground) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ic = ic;
        this.eduBackground = eduBackground;
    }

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
 
}
