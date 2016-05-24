package GradeManager;

import java.util.Collection;
import Administration.Student;
import TestTaking.StudentTestSubmission;

/**
 * This class with the corresponding PublishedTest is everything needed to grade
 * one student on their submission.
 */
public abstract class StudentGradeAndSubmission {

  /**
   * All of the answers submitted by the student.
   */
  StudentTestSubmission submission;

  /**
   * The grade for on the specific test for the student.
   */
  TestSubmissionGrade grade;

  /**
   * The student that this submission and grade correspond to.
   */
  Student student;
}
