package testtool.model.questionmanager;

import java.util.Collection;
import java.util.Date;
import java.sql.Time;
import testtool.model.administration.Course;
import testtool.model.administration.User;

/**
 * Collection of data representing an entry in the question database.
 * 
 */
public class Question {
    /**
     * unique id of the question
     */
    public final int id;

    /**
     * the type of question
     */
    public final QuestionType type;

    /**
     * course the question belongs to
     */
    public final Course course;

    /**
     * the prompt of the question
     */
    public final String prompt;

    /**
     * the difficulty rating of the question
     */
    public final QuestionDifficulty difficulty;

    /**
     * the time given to complete the question
     */
    public final int timeToComplete;

    /**
     * the user that created the question
     */
    public final User createdBy;

    /**
     * the date the question was created on
     */
    public final Date createdOn;
    
    /**
     * the collection of answers that correspond to the question
     */
    public final Collection<Answer> answers;

    /**
     * the keywords that correspond to the question
     */
    public final Collection<String> keywords;
    
    /**
     * question constructor
     */
    public Question (
            int id,
            QuestionType type,
            Course course, 
            String prompt, 
            QuestionDifficulty difficulty,
            int timeToComplete, 
            User createdBy,
            Date createdOn,
            Collection<Answer> answers,
            Collection<String> keywords
    ) {
        this.id = id;
        this.type = type;
        this.course = course;
        this.prompt = prompt;
        this.difficulty = difficulty;
        this.timeToComplete = timeToComplete;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.answers  = answers;
        this.keywords = keywords;
    }
    
   /**
    * get a string representation of the test
    */
   @Override
   public String toString() {
      return "Test.toString --> id: " + this.id + ", prompt: " + this.prompt + ", course: " + this.course + ", createdBy: " + this.createdBy + ", createdOn: " + this.createdOn;
   }
   
   /**
    * put the test information into an array
    */
   public Object[] toArray() {
      return new Object[] {this.prompt, this.type, this.course, this.createdBy, this.difficulty, this.timeToComplete};
   }
}
