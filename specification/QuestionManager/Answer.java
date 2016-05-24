package QuestionManager;

import java.util.*;

/** Represents an answer to a question. */
public abstract class Answer
{
   /** Each answer is represented by a collection of strings. */
   Collection<String> values;
   /** The type of question determines how the answer values are interpretted. */
   QuestionType type;
   /** An answer can either be correct or a possible answer to the question. */
   boolean isCorrect;
}

