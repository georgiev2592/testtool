package testtool.database;

import testtool.model.administration.User;
import java.util.ArrayList;
import java.util.Date;
import testtool.model.administration.Course;
import testtool.model.testmanager.Test;

/**
 * Front-end for database of raw test data.
 *
 */
public class TestDB {
    
   private ArrayList<Test> list = new ArrayList<Test>();
   
   public TestDB() {
      Course[] courses = {
      new Course (5001, "Test5001", "CSC", 111),
      new Course (5001, "Test5002", "CSC", 222),
      new Course (5001, "Test5003", "CSC", 333)
      };
      
      list.add(new Test("Final Exam", 
         "Instructions: Answer questions 1 through 8 on the paper provided. Answer the remaining questions by using handin on unix1, submitting the files indicated in each question. You have up to 3 hours to complete the exam. The test is open book and open note. It is worth a total of 140 points.", 
         courses[0], 
         new User()));

      list.add(new Test("Final Exam", 
         "The exam is open-book and open-note. Most of your answers will be submitted via handin. Answers to the last two questions are written on the final exam paper. Instructions for the individual questions indicate the form of your answer. In all cases, you may use the computer to generate and/or check your answers.", 
         courses[1], 
         new User()));

      list.add(new Test("Final Exam", 
         "The final exam is comprehensive so it will include all midterm topics. Be familiar with all the programming projects assigned during the quarter and be able to predict the output for a given set of test data. Be familiar with the implementation of all the ADT's we studied this quarter and be able to make small enhancements or modifications. ", 
         courses[2], 
         new User()));
      
      list.add(new Test("Midterm 1", 
         "Instructions: Answer questions 1 through 8 on the paper provided. Answer the remaining questions by using handin on unix1, submitting the files indicated in each question. You have up to 3 hours to complete the exam. The test is open book and open note. It is worth a total of 140 points.", 
         courses[0], 
         new User()));

      list.add(new Test("Midterm 1", 
         "The exam is open-book and open-note. Most of your answers will be submitted via handin. Answers to the last two questions are written on the final exam paper. Instructions for the individual questions indicate the form of your answer. In all cases, you may use the computer to generate and/or check your answers.", 
         courses[1], 
         new User()));

      list.add(new Test("Midterm 1", 
         "The final exam is comprehensive so it will include all midterm topics. Be familiar with all the programming projects assigned during the quarter and be able to predict the output for a given set of test data. Be familiar with the implementation of all the ADT's we studied this quarter and be able to make small enhancements or modifications. ", 
         courses[2], 
         new User()));
      
      list.add(new Test("Midterm 2", 
         "Instructions: Answer questions 1 through 8 on the paper provided. Answer the remaining questions by using handin on unix1, submitting the files indicated in each question. You have up to 3 hours to complete the exam. The test is open book and open note. It is worth a total of 140 points.", 
         courses[0], 
         new User()));

      list.add(new Test("Midterm 2", 
         "The exam is open-book and open-note. Most of your answers will be submitted via handin. Answers to the last two questions are written on the final exam paper. Instructions for the individual questions indicate the form of your answer. In all cases, you may use the computer to generate and/or check your answers.", 
         courses[1], 
         new User()));

      list.add(new Test("Midterm 2", 
         "The final exam is comprehensive so it will include all midterm topics. Be familiar with all the programming projects assigned during the quarter and be able to predict the output for a given set of test data. Be familiar with the implementation of all the ADT's we studied this quarter and be able to make small enhancements or modifications. ", 
         courses[2], 
         new User()));
   }
   
    /**
     * insert a test into the test database
     * @param title
     * @param introduction
     * @param createdBy
     * @param createdOn
     */
    public void insert(String title, String introduction, User createdBy, Date createdOn) {
        System.out.println("Entering testtol.model.database.insertTest()");
        System.out.println("Exiting testtol.model.database.insertTest()");
    }
    
   // Not sure what this method is supposed to return (collection of tests maybe) -- modify if needed
   /**
    * method searches for a test with the given name
    * @param name
    */
   public ArrayList<Test> search(String name) {
      System.out.println("Entering testtol.model.database.search(name)");
      
      ArrayList<Test> temp = new ArrayList<Test>();
      
      for (Test t : list) 
         if (t.title.toLowerCase().contains(name)) 
            temp.add(t);
       
      System.out.println("Exiting testtol.model.database.search(name)");
      
      return temp;
   }
    
   /*
    * TEMPORARY METHOD -- delete after db is connected
    */
   public ArrayList<Test> getAll() {
      System.out.println("Entering testtol.model.database.getAll");
      System.out.println("Exiting testtol.model.database.getAll");
      
      return list;
   }
      
    // Not sure what this method is supposed to return (collection of tests maybe) -- modify if needed
    /**
     * Search for the test with the given parameters in the database
     * @param author
     * @param course
     * @param keywords
     * @param time
     */
    public void search(String author, String course, ArrayList<String> keywords, String time, 
       int difficulty) {
       System.out.println("Entering testtol.model.database.search(advanced)");
       System.out.println("Exiting testtol.model.database.search(advanced)");
    }
    
    // Not sure what this method is supposed to take as a parameter (test id or test object) -- modify if needed
    /**
     * delete the specified test from the database
     */
    public void delete() {
       System.out.println("Entering testtol.model.database.delete()");
       System.out.println("Exiting testtol.model.database.delete()");
    }
}
