package testtool.database;

import testtool.model.grademanager.AnswerSubmission;

/**
 *
 * @author Patrick Riordan
 */
public class PublishedTestDB {
    public PublishedTestDB(TestToolDB db) {
    }
    public void UpdateAnswerSubmission(int testid, int qid, AnswerSubmission submission) {
        //ian's domain
        System.out.println("Updated AnswerSubmission in PublishedTestDB");
    }
}
