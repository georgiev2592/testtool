package testtool.view.testtaking;

import testtool.model.testmanager.PublishedQuestion;
import testtool.model.questionmanager.QuestionType;
import testtool.model.grademanager.AnswerSubmission;
import javax.swing.JPanel;

// This is pretty much an interface with a static method
public abstract class QuestionViewUI extends JPanel {
  // other types here


  // To use with Question, first build a PublishedQuestion
  public static QuestionViewUI buildFromPublishedQuestion(PublishedQuestion question) {
    if (question.type == QuestionType.MultipleChoice) {
      return new MultipleChoiceUI(question); 
    } else {
      return null;
    }
  }

  // display the submitted answer
  public abstract void showSubmittedAnswer(AnswerSubmission submisstion);
  // If false don't let them change the answer
  public abstract void setAnswerEditable(boolean isEditable);
  
  public abstract AnswerSubmission getSubmittedAnswer();

  // Shows corret answer separately from the current submitted answer
  // useful for grade and question manager
  public abstract void showCorrectAnswer();

}
