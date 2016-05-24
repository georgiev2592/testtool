package Administration;

import QuestionManager.*;
import java.util.*;

/**  
 * The Grader class will be used for people besides the teacher who will have
 * ability to grade finished test questions.  Some of the types of questions
 * that this grader can grade are essays, short answer and programming.
 */
public abstract class Grader extends User {

   /**  
    * This collection is used to store all ungraded questions that are in the queue
    * for the grader.  
    */
   private Collection<Question> ungradedQuestions;
   
   /**
    * This collection is used to store all the graded questions that will
    * be sent to the teacher.
    */
   private Collection<Question> finishedQuestions;


   /**  
    * This method is passed in a Question and the question will be 
    * graded by the grader.
    */
   abstract void gradeQuestion(Question q);

   /**  
    * This method send the graded questions back to the teacher
    * from the collection of finished questions.
    */
   abstract void sendGradedQuestions();
}

