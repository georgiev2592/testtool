package testtool.model.grademanager;

import testtool.database.TestToolDB;
import testtool.model.administration.CourseOffering;
import testtool.model.testmanager.PublishedTest;
import java.util.Collection;

/****
 * Class GradeManager holds everything needed when the user is either Grading a test,
 * seeing their grades on a test or getting statistics about a test of a CourseOffering
 * they teach.
 *
 * @author Patrick Riordan (psriorda@calpoly.edu)
 */
public class GradeManager {
    TestToolDB db;
    public Collection<CourseOffering> courseList;
    public Collection<PublishedTest> testList;

    public ActiveGradeTest activeTest;


    public GradeManager(TestToolDB database) {
      db = database;
    }
    /**
     *
     * This populates courseList with all the courses that the user could grade or see their grades for.
        pre:
            database != null;

        post:
            courseList != null;
    */
    public void GetCourseList() {
        courseList = db.courseBank.selectCourseOfferingsOfUser(db.activeUser);
    }

    /**
     * Call this after selecting a course from the courseList to populate the testList
     * with possible tests to grade or see grades for.
        pre:
            database != null;
        post:
            testList != null;
    */
    public void GetTestList(CourseOffering offering) {
      System.out.println("GradeManager: GetTestList");
      testList = offering.tests;
    }

    /**
     * Call this with a test from the testList to start grading that PublishedTest.
        pre:
            test != null;

        post:
            activeTest != null;
    */
    public void GradeTest(PublishedTest test) {
       activeTest = new ActiveGradeTest(test, db);
    }

    /**
     * Call this with a published test to get statistics about that PublishedTest
     */
    public /*PublishedTestStatistics*/ void GetTestStatistics(PublishedTest test) {}
}
