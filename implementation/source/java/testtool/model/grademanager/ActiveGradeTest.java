package testtool.model.grademanager;

import testtool.model.testmanager.PublishedTest;
import testtool.model.testmanager.PublishedQuestion;
import java.util.ArrayList;
import java.util.Collection;
import testtool.database.TestToolDB;

/**
 * **
 * Class ActiveGradeTest contains the test actively being graded and all
 * relevant information to that.
 *
 *
 * @author Patrick Rirodan (psriorda@calpoly.edu)
 */
public class ActiveGradeTest {

    public PublishedTest test;
    public int qNum;
    public PublishedQuestion activeQuestion;
    public int sNum;
    public TestSubmission activeSubmission;

    public AnswerSubmission activeAnswer;

    public Collection<GradeQuestionStatistics> qStats;

    private TestToolDB db;
    public ActiveGradeTest(PublishedTest test, TestToolDB db) {
        this.db = db;
        this.test = test;
        ArrayList<GradeQuestionStatistics> stats = new ArrayList<GradeQuestionStatistics>();
        int index = 0;
        for (PublishedQuestion q : test.questions) {
            GradeQuestionStatistics stat = new GradeQuestionStatistics();
            stat.questionNumber = index++;
            stat.points = q.points;
            stat.avgScored = 0;
            stat.maxScored = 0;
            stat.numberGraded = 0;
            stats.add(stat);
        }
        for (TestSubmission t : test.submissions) {
            index = 0;
            for (AnswerSubmission a : t.answers) {
                if (a.isGraded) {
                    GradeQuestionStatistics stat = stats.get(index++);
                    stat.numberGraded += 1;
                    if (a.gradeScore > stat.maxScored) {
                        stat.maxScored = a.gradeScore;
                    }
                    stat.avgScored += a.gradeScore;
                }
            }
        }
        qStats = stats;
    }

    public void GradeTestSubmission(TestSubmission submission) {
        System.out.println("GradeTestSubmission");
        // This collection needs a strict order
        int index = 0;
        for (TestSubmission t : test.submissions) {
            if (submission == t) {
                activeSubmission = submission;
                sNum = index;
                break;
            }
            index += 1;
        }
        qNum = 0;
        if (test.questions.size() == 0) {
            System.out.println("PublishedTest has zero questions to grade");
        } else {
            activeQuestion = test.questions.toArray(new PublishedQuestion[0])[qNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void GradeQuestion(PublishedQuestion question) {
        int index = 0;
        for (PublishedQuestion q : test.questions) {
            if (q == question) {
                activeQuestion = question;
                qNum = index;
                break;
            }
            index += 1;
        }
        sNum = 0;
        if (test.submissions.size() == 0) {
            System.out.println("PublishedTest has zero submissions to grade");
        } else {
            activeSubmission = test.submissions.toArray(new TestSubmission[0])[sNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void GradeNextSubmission() {
        sNum += 1;
        if (test.submissions.size() >= sNum) {
            System.out.println("PublishedTest has no more submissions to grade");
        } else {
            activeSubmission = test.submissions.toArray(new TestSubmission[0])[sNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void GradePrevSubmission() {
        sNum -= 1;
        if (sNum < 0) {
            System.out.println("That was the first submission, can't grade any previous");
        } else {
            activeSubmission = test.submissions.toArray(new TestSubmission[0])[sNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void GradeNextQuestion() {
        qNum += 1;
        if (test.questions.size() >= qNum) {
            System.out.println("PublishedTest has no more questions to grade");
        } else {
            activeQuestion = test.questions.toArray(new PublishedQuestion[0])[qNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void GradePrevQuestion() {
        qNum -= 1;
        if (qNum < 0) {
            System.out.println("That was the first submission, can't grade any previous");
        } else {
            activeQuestion = test.questions.toArray(new PublishedQuestion[0])[qNum];
            activeAnswer = activeSubmission.answers.toArray(new AnswerSubmission[0])[qNum];
        }
    }

    public void UpdateGrade() {
        db.publishedTestBank.UpdateAnswerSubmission(test.id, activeQuestion.id, activeAnswer);
    }
}
