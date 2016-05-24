package TestManager;
import Administration.*;
import java.util.*;

/** 
 * A test is represented by a collection of pages.  Each test has different
 * sections that are the pages.  Therefore the collection of pages represents
 * the test as a whole.
 */
public abstract class Test {
   /**
    * A collection of pages represents the test, since each test has 
    * different sections.
    */
   Collection<Page> test;

   /**
    * String to represent the name of the test.
    */
   String name;

   /**
    * String to represent the introduction of the test.  This is for the 
    * teacher to explain any rules.
    */
   String introduction;

   /**
    * A Time object to represent the amount of time given for the test.
    */
   Time time_limit;

   /**
    * A Difficulty object to represent the intensity of the test, so that
    * teachers may administer different levels of tests.
    */
   Difficulty difficulty;

   /**
    * A Course object to represent the course the test belongs to.
    */
   Course course;

   /**
    * Boolean value used to show if a test is active or inactive.
    */
   boolean status;

   /**
    * User object that represents the person who created the test.
    */
   User created_by;

   /**
    * Date object to represent the date the test was created on so that 
    * teachers can search for a test by date.
    */
   Date created_on;
 
   /**
    * The number of questions in the test.
    */
   int num_questions;

   /**
    *  Method that returns the number of questions in the test.  This method
    *  will simply return the num_questions variable of the Test object.
    */
   abstract int get_number_questions();

   /**
    * Method to set the name of the test.  The name is passed to the method
    * and will simply change the name field of the Test object.
    */
   abstract void set_name(String name);

   /**
    * Method that returns the name field of the Test object.
    */
   abstract String get_name();

   /**
    * Method to set the status field of the test.  If the teacher sets the
    * status of a test to false, this means the test is inactive, otherwise
    * if the status is set to true, it means the test is active.
    */
   abstract void set_status(boolean status);

   /**
    * Method will return the status of the test.  This means the method tells 
    * the user if the test is active or inactive.
    */
   abstract boolean get_status();

   /**
    * Method to set the introduction of the test.  The teacher will type their
    * introduction as a string which will be sent to this method to set the 
    * introduction field of the test.
    */
   abstract void set_introduction(String intro);

   /**
    * Method returns the introduction of the Test if there is an introduction.
    * The introduction is a string set by the teacher to give the student an
    * idea what the test is about or to give the students instructions about
    * the test.
    */
   abstract String get_introduction();

   /**
    * Method to set the time limit of the test.  Pass a time object to the
    * method to change the field within the Test object.
    */
   abstract void set_time(Time time);

   /**
    * Method to get the time limit for the test which is returned in a Time 
    * object.  This time object contains the time limit for the test.
    */
   abstract Time get_time();

   /**
    * Method to set the difficulty of the test by passing a difficulty object
    * to the method.  This will change the field within the Test object.
    */
   abstract void set_difficulty(Difficulty difficulty);

   /**
    * Method that returns the difficulty of the test so that if a teacher
    * wants to look at how difficult a test is, the teacher may do so.  This
    * also allows teachers to find tests based on difficulty if need be.
    */
   abstract Difficulty get_difficulty();

   /**
    * Method to set the course the Test belongs to.  This will allow teachers
    * to give the test to only students in the course the Test belongs to.
    */
   abstract void set_course(Course course);

   /**
    * Method will return the course the test belongs to.  
    */
   abstract Class get_course();
}
