package TestTaking;

import QuestionManager.Question;
import java.util.*;

/** Represents student's submitted test answers. */
public abstract class StudentTestSubmission 
{
   /** A collection of student answers to the test questions */
   Collection<StudentAnswerSubmission> answers;

   /** Add answer to submission or replace the old answer if one exists. */
   abstract void addAnswer(StudentAnswerSubmission val);
   /** Returns the student's answer for the question if it exists. */
   abstract StudentAnswerSubmission getAnswer(Question question);
}

