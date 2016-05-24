
package testtool.model.administration;

import testtool.database.TestToolDB;
import java.util.*;
/**
 * Module of the Test Tool containing all functionality related to managing the
 * question database.
 * 
 */
public class Administration {
    /** Reference to the Test Tool database */
    TestToolDB database;
    
    public Administration(TestToolDB database) {
       this.database = database;
    }

    /**
     * will add a user to the database
     */
    public void addUser(String username, String password, String email, String fname, String lname,
     UserPermission p) {
      System.out.println("Entering testtol.m0del.Administration.addUser");
      
      database.userBank.insertUser(username, password, email, fname, lname, p);
      
      System.out.println("Exiting testtol.m0del.Administration.addUser");
    }
    
    /**
     * 
     */
    public void addCourse(String title, String dept, int num) {
        System.out.println("Entering testtool.model.Administration.addCourse");
        
        database.courseBank.insertCourse(title, dept, num);
        
        System.out.println("Exiting testtool.model.Administration.addCourse");
    }
    
    public void deleteCourse(String title, String dept, int num) {
        database.courseBank.deleteCourse(title, dept, num);
    }
    
    
    /**
    *
    
   
      pre:
       exists (User user; database.contains(user)) && Id != null && username != null
       && password != null && email != null && fname != null && lname != null && p != null;
      
      post:
       database'.equals(database.add(user));
     */
    public void editUser(int Id, String username, String password, String email, String fname, String lname,
     UserPermission p) {
      
      database.userBank.updateUser(Id, username, password, email, fname, lname, p);
      
    }

    /**
    *
    
   
      pre:
       exists (User user; database.contains(user));     
     */
    public void deleteUser(User u)
    {
         database.userBank.removeUser(u.id);
    }

    /**
    *
    
   
      pre:
       exists (User user; database.contains(user));   
       
      post:
        forall(selection !== null)
     */
    public ArrayList<User> searchUsers(String name)
    {
	  ArrayList<User> selection = new ArrayList<>();
          selection = database.userBank.selectUserByName(name);
          return selection;
    }
    
    public Collection<Course> getCourses() {
        return database.courseBank.selectAllCourses();
    }
}
