package TestTaking;

import QuestionManager.Question;
import QuestionManager.Answer;

/** Represents a student's answer to a question on a test. */
public abstract class StudentAnswerSubmission
{
   /** The question being answered. */
   Question answeredQuestion;
   /** The answer to the question. */
   Answer submission;

   /** Accessor to the question. */
   abstract Question getQuestion();
}
