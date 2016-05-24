
package testtool.model.administration;

/**
 * Encapsulates the data representing an entry in the user table of the database.
 * 
 * @author Petar Georgiev
 */
public class User {
    /**
     * id of the user
     */
    public int id;

    /**
     * unique username of the user
     */
    public String username;

    /**
     * the provided password of the user
     */
    public String password;

    /**
     * email of the user
     */
    public String email;

    /**
     * user's first name
     */
    public String firstname;

    /**
     * user's last name
     */
    public String lastname;
    
    /**
     * 
     */
    public UserPermission type;
    
    
    public User (
                int id,
                String username,
                String password,
                String email,
                String firstname,
                String lastname,
                UserPermission type
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.type = type;
    }
    
    /**
     * FOR TESTING!!!
     * TO BE REMOVED.
     */
    public User() {
        this.id = 0;
        this.username = "gfisher";
        this.password = "password";
        this.email = "email@gmail.com";
        this.firstname = "Gene";
        this.lastname = "Fisher";
        this.type = new UserPermission(true, true, true, true);
    }
            
    public String toString() {
       return lastname + ", " + firstname;
    }
    
    /**
    * put the test information into an array
    */
   public Object[] toArray() {
      return new Object[] {this.firstname+" "+this.lastname, this.email, this.password, this.id, this.type};
   }
}

