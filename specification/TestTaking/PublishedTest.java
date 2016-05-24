package TestTaking;
<<<<<<< .mine

=======

import Administration.Course;
import TestManager.Test;
import GradeManager.StudentGradeAndSubmission;
>>>>>>> .r180
import java.util.*;
<<<<<<< .mine
import TestManager.*;
import GradeManager.StudentGradeAndSubmission;
=======
>>>>>>> .r180

/** A finalized test that cannot be modified but can be assigned. */
public abstract class PublishedTest
{
   /** Copy of test date, separate from the TestBank and QuestionBank */
   Test testData;
   /** The date before which the student must submit their answers. */
   Date dueDate;
   /** Amount of time a student has to finish a test after starting. */
   Time timeLimit;
   /** The course for which the test is assigned. */
   Course course;
   /** Student submissions and grades corresponding to the published test. */
   Collection<StudentGradeAndSubmission> submissions;

   /** Add submission. */
   abstract void addSubmission(StudentTestSubmission test);
   /** Remove submission. */
   abstract void removeSubmission(StudentTestSubmission test);
}

