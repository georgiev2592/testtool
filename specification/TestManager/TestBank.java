package TestManager;
import java.util.*;

/**
 * The TestBank is represented by a collection of tests.  The testbank 
 * represents the tests that the teacher has created which are stored away
 * so that the teacher may distribute the tests when he or she wishes to 
 * administer the test.
 */
public abstract class TestBank {
   /**
    * A collection of tests represents the test bank.
    */
   Collection<Test> tests;

   /**
    * Method to search for a test.  Will take in a string and see if there
    * is a Test object that matches the prompt provided by the user.  If 
    * there is a match, it will return the correct Test object, otherwise
    * an empty Test will be returned which means the prompt doesn't exist.
    */
   abstract Test search_for_test(String prompt);

   /**
    * Method will search for the test with the provided prompt.  If the Test
    * exists with the same prompt, the method will delete the test from the 
    * collection of tests(TestBank).
    */
   abstract void delete_test(String prompt);

   /**
    * Method is essentially a constructor for a Test.  This method will 
    * create a blank test to be populated through the edit_test() method. 
    */
   abstract Test create_test();

   /**
    * This method will be used to perform editing on an already created test.
    * This method is useful for adding to a test created from the create_test()
    * method, or for editing already populated tests.
    */
   abstract void edit_test();

   /**
    * This method will create a copy of a test and return it.  The teacher may
    * pass this method a test object that is to be duplicated.  The teacher
    * may want to duplicate a test to edit a few questions while keeping the
    * majority of the test intact.
    */
   abstract Test duplicate_test(Test test);
}
