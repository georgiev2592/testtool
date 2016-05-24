package Administration;

/**
 * The User class represents a User of the TestTool. It stores usee's username, password, and
 * permissions. 
 */
public abstract class User {
   private String username;
   private String password;
   private UserType permission;

   /**
    * A method to set the username of the User object. It takes a String as a parameter.
    */
   abstract void set_username(String a);

   /**
    * A method to get the username of the User object. It returns a String.
    */
   abstract String get_name();

   /**
    * A method to set the password of the User object. It takes a String as a parameter.
    */
   abstract void set_password(String a);

   /**
    * A method to get the password of the User object. It returns a String.
    */
   abstract String get_password();

   /**
    * A method to set the password of the User object. It takes a UserType as a parameter.
    */
   abstract void get_permission();

   /**
    * A method to get the password of the User object. It returns a UserType.
    */
   abstract UserType set_permission();
}
