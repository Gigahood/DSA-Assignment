
package DataClass;

/**
 *
 * @author User
 */
public class Admin {
    private String gender;
    private String name;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String gender, String name, String username, String password) {
        this.gender = gender;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    
    
    
    
}
