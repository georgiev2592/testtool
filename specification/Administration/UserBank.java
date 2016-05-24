package Administration;

import java.util.*;

/**
 * This class will be the bank of all the users using our tool.  It will
 * have a method to find a user in the bank for the administrator.
 */
public abstract class UserBank {
   /**
    * This is the collection of all users.
    */
   Collection<User> userbank;
 
   /**  
    * This method takes in a string name to find and return the
    * proper user.
    */
   abstract User findUser(String name);

   /**
    * This method will be used by the administrator to delete a user.
    */
   abstract void deleteUser(String name);
}

