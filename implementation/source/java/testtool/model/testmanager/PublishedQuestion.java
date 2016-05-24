package testtool.model.testmanager;

import testtool.model.questionmanager.Answer;
import testtool.model.questionmanager.QuestionType;
import java.util.Collection;

/**
 * Encapsulates the data representing an entry in the PublishedQuestion table of the database.
 * 
 * @author Peter Georgiev
 */
public class PublishedQuestion {
  public QuestionType type;
  public String prompt;
  public int points;
  public Collection<Answer> answers;
  public int id;
}
