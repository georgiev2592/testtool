
package testtool;

import testtool.model.administration.Login;
import testtool.model.questionmanager.QuestionManager;
import testtool.model.testmanager.TestManager;
import testtool.model.administration.Administration;
import testtool.model.grademanager.GradeManager;
import testtool.database.TestToolDB;

/**
 * Top-level model class for the TestTool program. TestTool has references to each of the functional
 * model components of the tool. There is also a reference to the TestToolDB class for interacting
 * with the database.
 * 
 * @author Ian Smith-Grove
 */
public class TestTool {
    public TestToolDB database;

    public Login login;
    public Administration administration;
    public QuestionManager questionmanager;
    public TestManager testmanager;
    //public TestTaking testtaking;
    public GradeManager grademanager;
    
    
    public TestTool() {
        database = new TestToolDB();
        login = new Login(database);
        administration = new Administration(database);
        questionmanager = new QuestionManager(database);
        testmanager = new TestManager(database);
        
        //testtaking = new TestTaking();
        grademanager = new GradeManager(database);
    }
}
