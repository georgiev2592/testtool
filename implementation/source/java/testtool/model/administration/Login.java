package testtool.model.administration;

import testtool.database.TestToolDB;
import java.util.ArrayList;
import java.util.Date;


/**
 * Model class associated with managing the active user of the tool.
 * 
 * @author Robert Mitsuda
 */
public class Login {    
    /**
     * database for the testtool information.
     */
    static TestToolDB database;
   
    /**
     * initialize the login screen with the testtool database
     * @param database 
     */
    public Login(TestToolDB database) {
        this.database = database;
    }
   
   
   
    /**
     * logout of the current user by setting the active user data to null
     * a new window is created for the next user
       pre:
        exists (User user; database.contains(user)); 
     */
    public static void logout() {
        System.out.println("In Login.logout.");
    }
    
    /**
     * logs the user in if they have a valid username and password
     * will check the userDB for the user, if they exist then they will be
     * logged in, otherwise an error message will appear
     *
     * <pre> 
      pre:
       exists (User user; database.spestDB.contains(user) &amp;&amp;
           user.username.equals(user) &amp;&amp;
           user.password.equals(pw))
     * </pre>
     */
    public static boolean login(String user, String pw) {
        System.out.println("Entering testtol.model.administration.login( username: " + user + " pw: " + pw + " )");
        
        User retVal = database.userBank.selectUser(user, pw);
        
        if (retVal == null) 
           return false;
        
        database.activeUser = retVal;
        
        return true;
    }
    
    /**
     * method that is called when the user clicks on the "forgot password"
     * button.  Will create a dialogue with which the user may enter 
     * information to retrieve a forgotten password
      pre:
       exists (User user; database.spestDB.contains(user); 
           user.email != null); 
     */
    public static void forgotPassword(String email) {
       System.out.println("Entering testtol.model.administration.forgotPassword( " + email + " )");
       
       User retVal = database.userBank.selectUser(email);
       Date time = new Date();
        
        if (retVal != null) {
            String to[] = { email , "peter_25@abv.bg"}; 

            SendMail.sendFromGMail("admin@wrecking-ball.xyz", 
               "junkyPASS307", 
               to, 
               "WreckingBall Testing Tool Password Recovery Email", 
               "Hello,\n\n" +
                  "A password recovery was requested on " + time.toString() + ".\n\n" +
                  "To login to WreckingBall Testing Tool, use the following credentials.\n\n" +
                  "Username: " + retVal.username + "\n" +
                  "Password: " + retVal.password + "\n\n" +
                  "If you have any questions or encounter any problems logging in, please contact a site administrator at admin@wrecking-ball.xyz .\n\n" +
                  "Sincerely,\n\n" +
                  "WreckingBall Team\n\n");
        }
         
        System.out.println("Exiting testtol.model.administration.forgotPassword");
    }
}

