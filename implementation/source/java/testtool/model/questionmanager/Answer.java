
package testtool.model.questionmanager;

/**
 * Represents a possible response to a test question.
 * 
 * @author Ian Smith-Grove
 */
public class Answer {
   /**
    * string value of the response
    */
   public String response;
   /**
    * true if the answer is a correct response to the associated question
    */
   public boolean isCorrect;
    
   public Answer(String response, boolean isCorrect) {
       this.response = response;
       this.isCorrect = isCorrect;
   }
}
