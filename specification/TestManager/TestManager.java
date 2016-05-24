package TestManager;
import QuestionManager.*;
/**
 * Class TestManager will derive from Section 2.3 of the requirements.  The
 * test manager is used to perform functions on a test.  It also contains a 
 * test bank that contains all of the created tests of a teacher.  From the
 * test manager, a teacher may add questions to a test, or delete questions.
 * They may also edit the questions on an already existing test, as well as
 * get the links for the test so that the teacher may distribute the test to
 * student's easily.
 */
public abstract class TestManager {
   /**
    * A TestBank object to hold all of the tests so that the teacher may
    * choose which test to manage.
    */
   TestBank testbank;

   /**
    * This method will add a question to a given test.  The user must specify
    * which test to add to and what question to add.  Depending on the 
    * type of question, the question will be added to the appropriate page.
    */
   abstract void add_question_to_test(Test test, Question question);

   /**
    * Method to delete a question form the test.  The user provides the test
    * he or she wants to delete from and which question should be deleted.
    * The method will take care of deleting it from the test's collection of
    * questions.
    */
   abstract void delete_question(Test test, Question question);

   /**
    * This method will allow the teacher or user to edit a question that is in 
    * a test.  The user provides that test which contains the question to 
    * edit.  The user must also provide the question to search for so that the
    * method can find the correct question.
    */
   abstract void edit_question(Test test, Question question);

   /**
    * This method will return a string which is the link for the test.  The
    * teacher may use this link to send to students so that they take the test.
    * Teachers can also set a password so that even if student's have a link
    * to the test, they also need the password to access the test.
    */
   abstract String publish_test_link(Test test);
   
   /**
    *  This method will publish the test link only to certain users based on
    *  the email list provided to the method.  Since each user has an email,
    *  the email list will be parsed through and sent to the appropriate users.
    */
   abstract String publish_test_email(Test test, String user_emails);
}
