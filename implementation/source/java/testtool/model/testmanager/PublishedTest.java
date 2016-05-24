
package testtool.model.testmanager;

import testtool.model.grademanager.TestSubmission;
import testtool.model.questionmanager.Question;
import java.util.Collection;

/**
 * Encapsulates the data representing an entry in the PublishedTest table of the database.
 * 
 * @author Peter Georgiev
 */
public class PublishedTest {
  public int id;
  public String title;
  public Collection<TestSubmission> submissions;
  public Collection<PublishedQuestion> questions;
}
