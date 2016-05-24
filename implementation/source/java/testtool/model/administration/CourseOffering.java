
package testtool.model.administration;

import testtool.model.administration.Course;
import testtool.database.TestToolDB;
import java.util.Collection;
import testtool.model.testmanager.PublishedTest;

/**
 *
 *
 * @author Timothy Jyung
 */

/**
    *Creats a course offering
    */
public class CourseOffering {
  TestToolDB database;
 
  public Course course;
  public String term;
  public Collection<PublishedTest> tests;

  
  public CourseOffering(TestToolDB database) {
      this.database = database;
   }
  
   /**
    *Adds a student
    
   
      pre:
       exists (User user; database.contains(user));     
     */
   public void enrollStudent() {
      System.out.println("In Course.enrollStudent");
   }

   /**
    *Drops a student
    
   
      pre:
       exists (User user; database.contains(user));
     */
   public void dropStudent() {
      System.out.println("In Course.dropStudent");
   }

   /**
    *Adds a test
    
  
      pre:
       exists (User user; database.contains(user));
   */
   public void addTest() {
      System.out.println("In Course.addTest");
   }
	
   /**
    *Removes a test from the database.
     
      pre:
       exists (User user; database.contains(user));
   */
   public void removeTest() {
      System.out.println("In Course.removeTest");
   }
   
}
