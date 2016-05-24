package TestTaking;

<<<<<<< .mine
import Administration.Student;
import Administration.Course;
import TestManager.Page;
import java.util.Date;
import TestManager.Time;
=======
import Administration.Student;
import Administration.Course;
import TestManager.Page;
>>>>>>> .r180

import java.util.Date;

/** Represents a test that has been assigned to a student. */
public abstract class TestAssignment
{
   /** Contains relevant data for displaying and presenting the test. */
   PublishedTest test;
   /** Student the test was assigned to. */
   Student assignedTo;
   /** Course through which the test was assigned. */
   Course assignedBy;
   /** Date on which the test expires (answers can no longer be submitted) */
   Date expirationDate;
   /** True if the student has began taking the test. */
   boolean isActive;
   /** submission actively built as student works on the test
     * automatically submitted @ expiration date or when time limit == 0 */
   StudentTestSubmission submission;
   /** The page currently displayed in the test. */
   Page activePage;
   /** When the student began taking the test. */
   Time startTime;
   /** When the student must submit their answers to the test */
   Time endTime;

   /** Starts the test and associated timer. */
   abstract void beginTest();
   /** Finalizes test submission and adds to other submissions for the course. */
   abstract void finishTest();

   /** Changes activePage to next page in test. */
   abstract void nextPage();
   /** Changes activePage to prev page in test. */
   abstract void prevPage();
}
