package testtool.model.grademanager;

import testtool.model.grademanager.AnswerSubmission;
import java.util.Collection;
import java.util.Date;
import java.sql.Time;
import testtool.model.administration.User;

public class TestSubmission {
  public int totalGradeScore;
  public User student;
  public Date date;
  public Time time;
  public Collection<AnswerSubmission> answers;
}
