
package testtool.model.testmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import testtool.database.TestToolDB;
import testtool.model.administration.Course;
import testtool.model.administration.User;

/**
 * Module of the Test Tool containing all functionality related to managing the
 * test database.
 * 
 * @author PetarGeorgiev
 */
public class TestManager {
   TestToolDB database;
   ArrayList<Test> list;
   Test activeTest;
   int activePage;

   /**
    * Constructs a TestManager object. This object has access to the TestTool DB.
    * 
    * @param database TestToolDB object.
    */
   public TestManager(TestToolDB database) {
      this.database = database;
      
      list = database.testBank.getAll();
      
      // Sample Test object -- for testing purpose only!!!
      activeTest = new Test("Quiz 1", "Instructions: Answer questions 1 through 8 on the paper provided. Answer the remaining questions by using handin on unix1, submitting the files indicated in each question. You have up to 3 hours to complete the exam. The test is open book and open note. It is worth a total of 140 points.", new Course (1010, "Test1010", "CSC", 999), new User());
   }
   
   /**
    * Adds a new test (entry) to the test bank (database).
    * 
    * @param title Test title.
    * @param introduction Test introduction.
    * 
     pre:
        exists(String title; title.length() > 0) && exists(String introduction; introduction.length() > 0);
    */
   public void createTest(String title, String introduction) {
      System.out.println("Entering testtol.model.testmanaget.createTest()");
      
      // Note: pass the current User ID instead of passing new User()
      database.testBank.insert(title, introduction, new User(), new Date());
      
      System.out.println("Exiting testtol.model.testmanaget.createTest()");
   }
   
   /**
    * Modifies a test (entry) in the test bank (database).
    * 
    * @param t Test object.
    * 
     pre:
        exists(Test t; database.contains(t));
    */
   public void editTest(Test t) {
      System.out.println("In edit test.");
   }
   
   /**
    * Deletes a test (entry) from the test bank (database).
    * 
    * @param t Test object.
    * 
     pre:
        exists(Test t; database.contains(t));
    */
   public void deleteTest(Test t) {
      System.out.println("Entering testtol.model.testmanaget.delete()");
      
      database.testBank.delete();
      
      System.out.println("Exiting testtol.model.testmanaget.delete()");
   }
   
   /**
    * Searches for a test(s) (entry) in the test bank (database).
    * 
    * @param testName Name of tests.
    * 
     pre:
        exists(String testName; testName.length() > 0);
    */
   public ArrayList<Test> search(String testName) {
      System.out.println("Entering testtol.model.testmanaget.search(testName)");
      
      this.list = database.testBank.search(testName);
      
      System.out.println("Exiting testtol.model.testmanaget.search(testName)");
      
      return list;
   }
   
   /**
    * Advanced search for a test(s) (entry) in the test bank (database).
    * 
    * @param author Author of the test.
    * @param course The course that the test is supposed to be for.
    * @param keywords Keywords to search for.
    * @param time Time stamp of the creation of the test.
    * @param type Nonsense - Will be fixed soon.
    * @param difficulty Difficulty of the test.
    * 
    */
   public void search(String author, String course, ArrayList<String> keywords, String time, 
      int difficulty) {
      System.out.println("Entering testtol.model.testmanaget.search(advanced)");
      
      database.testBank.search(author, course, keywords, time,difficulty);
      
      System.out.println("Exiting testtol.model.testmanaget.search(advanced)");
   }
   
   /**
    * Publishes a test(s) (entry) in the published test bank (database).
    * 
    * @param t Test object.
    * @param pt PublishedTest object.
    * @param c Course object.
    * 
     pre:
        exists(Test t; database.contains(t));
    */
   public void publishTest(Test t) {
      System.out.println("Entering testtol.model.testmanaget.publishTest");
      System.out.println("Exiting testtol.model.testmanaget.publishTest");
   }
   
   /**
    * TEMPOPRARY METHOD -- DELETE WHEN DB IS CONNECTED.
    * 
    * @return 
    */
   public ArrayList<Test> getList() {
      return list;
   }
   
   /**
    * Gets the active test at the moment.
    */
   public Test getActiveTest() {
      return this.activeTest;
   }
}
