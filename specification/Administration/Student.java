package Administration;

import TestManager.*;
import java.util.*;

/**
 * This class will be used by students to take tests and have tests graded
 * by teachers.  
 */
public abstract class Student extends User {
   /**
    * This is a collection of all the courses that a student is enrolled in.
    */
   Collection<Course> courses;

   /**
    * This is a collection of tests that the user has assigned.
    */
   Collection<Test> tests;

   /**
    * This method will take in a test that the user wants to take and opens
    * the test to the user.
    */
   abstract void takeTest(Test t);

}
