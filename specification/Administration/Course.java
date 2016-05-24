package Administration;

import TestTaking.*;
import java.util.*;

/** represents a course */
public abstract class Course
{
   /** The teacher/professor instructing the course. */
   Teacher teacher;
   /** The collection of tests assigned through the course. */
   Collection<PublishedTest> tests;
   /** A collection of student test submissions for the course. */
   Collection<StudentTestSubmission> submissions;
   /** The course roster of students currently enrolled. */
   Collection<Student> roster;

   /** Adds a student to the course roster. */
   abstract void enrollStudent(Student s);
   /** Drops a student from the course roster, if they are enrolled. */
   abstract void dropStudent(Student s);
   
   /** Adds a student's test submission to the collection. */
   abstract void addSubmission(StudentTestSubmission test);
   /** Removes a test submission from the collection and returns it. */
   abstract StudentTestSubmission removeSubmission(StudentTestSubmission test);
   
   /** Adds test to assigned test collection. */
   abstract void addTest();
   /** Removes test from assigned test collection and returns it. */
   abstract void removeTest();
}
