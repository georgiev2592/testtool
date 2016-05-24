package GradeManager;

import QuestionManager.Question;
import TestTaking.StudentAnswerSubmission;

/**
 * Represents a grade on a specific question for a specific student.
 * Contains some of the code to auto grade question.
 */
abstract class QuestionSubmissionGrade {

    /**
     * Depending on the quesiton type and StudentAnswerSubmission assigns points to this grade.
     */
    abstract void attemptAutoGradeQuestion(Question question, StudentAnswerSubmission answer);

    /**
     * The amount of points earned on this question. It's of type double so
     * that fractional points are possible.
     */
    double points;

    /**
     * An optional comment to the student on this question.
     */
    String comment;

    /**
     * If the question was fully graded yet.
     */
    boolean isGraded;
}
