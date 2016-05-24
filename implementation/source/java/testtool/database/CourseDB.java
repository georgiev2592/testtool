package testtool.database;

import testtool.database.selection.Tuple;
import testtool.model.administration.CourseOffering;
import testtool.model.administration.User;
import testtool.model.administration.Course;
import java.util.ArrayList;
import java.util.Collection;
import testtool.database.query.Query;
import testtool.database.selection.Selection;

import testtool.model.testmanager.PublishedTest;
import testtool.model.testmanager.PublishedQuestion;
import testtool.model.questionmanager.Answer;
import testtool.model.questionmanager.QuestionType;
import testtool.model.grademanager.TestSubmission;
import testtool.model.grademanager.AnswerSubmission;

/**
 * Front-end for database of registered courses and course offerings.
 *
 */
public class CourseDB {
    
    /**
     * 
     */
    private final TestToolDB database;
    
    /**
     * Initialize components. 
     */
    public CourseDB(TestToolDB database) {
        this.database = database;
    }
    
    /**
     * 
     * @param title
     * @param dept
     * @param num 
     */
    public void insertCourse(String title, String dept, int num) {
        Query query = new Query("Course");
        query.addItem("title", title);
        query.addItem("dept", dept);
        query.addItem("num", num);
        
        database.executeUpdate(query.buildInsert());
    }
    
    /**
     * 
     * @param title
     * @param dept
     * @param num 
     * pre:
     * exists (Course course; database.courseBank.contains(course);
           course.id.equals(id);
     * post:
     * !exists (Course course; database.courseBank.contains(course);
           course.title.equals(title) 
     *     course.department.equals(dept) 
     *     course.number.equals(num));  
     */
    public void deleteCourse(String title, String dept, int num) {
        Query query = new Query("Course");
        query.addItem("title", title);
        query.addItem("dept", dept);
        query.addItem("num", num);
        
        database.executeUpdate(query.buildDelete());
    }
    
    /**
     * 
     * @return 
     */

    public Collection<Course> selectAllCourses() {
       return buildCourses("SELECT * FROM Course ORDER BY dept, num;");
    }
    
    /**
     * 
     * @param id
     * @return 
     * pre:
     * exists (Course user; database.courseBank.contains(course);
           course.id.equals(id);
     *
     */
    public Course selectCourse(int id) {
        Query query = new Query("Course");
        query.addItem("id", id);
        Collection<Course> courses = buildCourses(query.build());
        if (!courses.isEmpty()) {
            return (Course) courses.toArray()[0];
        } else {
            return null;
        }
    }
    
    /**
     * 
     */
    private Collection<Course> buildCourses(String query) {
        Collection<Course> selection = new ArrayList<>();
        Selection results = database.executeQuery(query);
        
        for (Tuple tuple : results) {
            selection.add(buildCourse(tuple));
        }
        return selection;
    }
    /**
     * 
     * @param tuple
     * @return 
     */
    private Course buildCourse(Tuple tuple) {
        int id = Integer.parseInt(tuple.getValue("id"));
        String title = tuple.getValue("title");
        String dept = tuple.getValue("dept");
        int num = Integer.parseInt(tuple.getValue("num"));
        return new Course(id, title, dept, num);
    }
    
    /**
     * TEMPORARY: TO BE REPLACED!!!
     * TEMPORARY: TO BE REPLACED!!!
     * TEMPORARY: TO BE REPLACED!!!
     * initialize the course database with the courses
     */
    public Collection<CourseOffering> selectCourseOfferingsOfUser(User user) {
        // we need this for selecting the course in 
        // test manager and grade manager
        ArrayList<CourseOffering> list = new ArrayList<>();
        
        Course fakeCourse = new Course(0, "Fake title", "fake dept", 0);
        
        // give it a testtooldb eventually
        CourseOffering fakeCourseO = new CourseOffering(null);
        fakeCourseO.course = fakeCourse;
        fakeCourseO.term = "Fake Term";
        list.add(fakeCourseO);

        PublishedTest fakeTest = new PublishedTest();
        fakeTest.title = "Fake Test title";
        fakeTest.id = -1;
        fakeTest.submissions = new ArrayList<>();
        fakeTest.questions = new ArrayList<>();
        TestSubmission fakeSub = new TestSubmission();
        AnswerSubmission fakeASub = new AnswerSubmission();
        fakeSub.answers = new ArrayList<>();
        fakeSub.answers.add(fakeASub);
        fakeSub.totalGradeScore = 0;
        fakeSub.student = user;

        fakeASub.answer = "Butt lick";
        fakeASub.gradeScore = 0;
        fakeASub.gradeComment = null;
        fakeASub.isGraded = false;
        fakeASub.questionId = 0; // what id is this?

        PublishedQuestion fakeQ = new PublishedQuestion();
        fakeQ.type = QuestionType.MultipleChoice;
        fakeQ.prompt = "What would make you happy?";
        fakeQ.points = 4;
        fakeQ.answers = new ArrayList<>();
        fakeQ.answers.add(new Answer("Butt lick", false));
        fakeQ.answers.add(new Answer("Armpit rub", true));

        fakeTest.questions.add(fakeQ);
        fakeTest.submissions.add(fakeSub);
         
        fakeCourseO.tests = new ArrayList<>();
        fakeCourseO.tests.add(fakeTest);
        
        return list;
    }
}
