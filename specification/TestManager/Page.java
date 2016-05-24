package TestManager;
import QuestionManager.*;
import java.util.*;

/**
 * Represents a section of the test and derives from Section 2.3.  
 * For example, some tests may have a multiple choice page, or an essay page, 
 * or a matching page, etc.  This allows teachers to separate 
 * their tests based on the types of questions in each section.  
 * Teachers choose how many questions are allocated per page, which means 
 * they can choose to have 10 multiple choice questions per page
 * of the multiple choice section, or have 1 essay question per page of the
 * essay section.
 */
public abstract class Page {
   /**
    * Each page has a certain amount and certain kind of question on the page.
    */
   Collection<Question> questions;

   /**
    *  The name of the page (e.g. multiple choice section, essay section,
    *  etc.)
    */
   String name;

   /**
    * Create a page to put questions of the teacher's choice.  This is 
    * essentially the constructor for the page object.  This creates a blank
    * page that is a blank template for the teacher to add the questions to.
    */
   abstract Page create_page();

   /**
    * Add a question to the Page.  Even though the page is generally used to
    * allocate a specific question type 
    */
   abstract void add_question(Question question);

   /**
    *  Remove a question from the Page.  The teacher provides the question he 
    *  or she wishes to remove from the page.  The method will parse through
    *  the collection of questions and remove it from the questionbank of the
    *  page, but not from the main questionbank.
    */
   abstract void remove_question(Question question);
}
