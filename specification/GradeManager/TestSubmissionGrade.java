package GradeManager;
import java.util.Collection;

/**
 * This class contains all the grading information on a specific test for a specific student.
 * It is not necessarily completely graded.
 */
abstract class TestSubmissionGrade {

  /**
   * This is all of the grades for each specific question on a PublishedTest.
   */
  Collection<QuestionSubmissionGrade> questions;

  /**
   * This returns the number of points earned on each QuestionSubmissionGrade.
   */
  abstract double getTotalPoints();

  /**
   * If every QuestionSubmissionGrade is graded this returns true.
   * Otherwise false.
   */
  abstract boolean isGradingFinished();

  /**
   * An optional comment to the student from the teacher.
   */
  String comment;
}
