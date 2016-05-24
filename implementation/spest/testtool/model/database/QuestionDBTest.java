package testtool.model.database;

import testtool.model.database.QuestionDB;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.database.QuestionDB;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class QuestionDBTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.database.QuestionDB)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.database.QuestionDB.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("C:\Users\Ian\Documents\CSC307\test\input\src");
    private File sourceFile = new File("C:\Users\Ian\Documents\CSC307\test\input\src\testtool\model\database\QuestionDB.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.database.QuestionDB testObj;
    @Test
    public void insertAnswersTest_0() throws Exception
    {
        int testComboIndex;

        String methodId = "insertAnswers_int_java.util.Collection";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        List<java.util.Collection> testPoints_1 = javaTestUtility.getSampleObjects(testObj, methodId, "answers", java.util.Collection.class, testtool.model.questionmanager.Answer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size(), testPoints_1.size());

        Class[] parameterClasses = {int.class,java.util.Collection.class};
        List<testtool.model.questionmanager.Answer> as_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean forall_19 = true;
        List<testtool.model.questionmanager.Answer> bs_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_20 = false;
        int param_0;
        java.util.Collection<testtool.model.questionmanager.Answer> param_1;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);
            param_1 = testPoints_1.get(combinations[testComboIndex][1]);

            Object[] paramValues = {param_0, param_1};
            Class[] paramClasses = {int.class, java.util.Collection.class};

            javaTestUtility.getMethodValue(testObj, "insertAnswers", paramValues, paramClasses);
            for(testtool.model.questionmanager.Answer a : as_0)
            {
                forall_19 = forall_19 && (answers.contains(a));
                for(testtool.model.questionmanager.Answer b : bs_0)
                {
                    exists_20 = exists_20 || (javaTestUtility.getFieldValue(a, "response", java.lang.String.class).equals(javaTestUtility.getFieldValue(b, "response", java.lang.String.class)));
                    exists_20 = exists_20 || (javaTestUtility.getFieldValue(a, "isCorrect", boolean.class) == javaTestUtility.getFieldValue(b, "isCorrect", boolean.class));
                }
                Assert.assertTrue(exists_20);
            }
            Assert.assertTrue(forall_19);

            setUp();
        }
    }

    @Test
    public void insertKeywordsTest_1() throws Exception
    {
        int testComboIndex;

        String methodId = "insertKeywords_int_java.util.Collection";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        List<java.util.Collection> testPoints_1 = javaTestUtility.getSampleObjects(testObj, methodId, "keywords", java.util.Collection.class, java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size(), testPoints_1.size());

        Class[] parameterClasses = {int.class,java.util.Collection.class};
        List<java.lang.String> as_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean forall_21 = true;
        List<java.lang.String> bs_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_22 = false;
        int param_0;
        java.util.Collection<java.lang.String> param_1;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);
            param_1 = testPoints_1.get(combinations[testComboIndex][1]);

            Object[] paramValues = {param_0, param_1};
            Class[] paramClasses = {int.class, java.util.Collection.class};

            javaTestUtility.getMethodValue(testObj, "insertKeywords", paramValues, paramClasses);
            for(java.lang.String a : as_0)
            {
                forall_21 = forall_21 && (keywords.contains(a));
                for(java.lang.String b : bs_0)
                {
                    exists_22 = exists_22 || (a.equals(b));
                }
                Assert.assertTrue(exists_22);
            }
            Assert.assertTrue(forall_21);

            setUp();
        }
    }

    @Test
    public void removeQuestionTest_2() throws Exception
    {
        int testComboIndex;

        String methodId = "removeQuestion_int";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        int param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.removeQuestion(param_0);
            Assert.assertTrue(testObj.selectQuestion(param_0) == null);
            setUp();
        }
    }

    @Test
    public void selectQuestionTest_3() throws Exception
    {
        int testComboIndex;

        testtool.model.questionmanager.Question ret;
        String methodId = "selectQuestion_int";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        int param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            ret = testObj.selectQuestion(param_0);
            Assert.assertTrue(param_0 == param_0);
            setUp();
        }
    }

    @Test
    public void selectAnswersTest_4() throws Exception
    {
        int testComboIndex;

        java.util.Collection ret;
        String methodId = "selectAnswers_int";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {int.class};
        List<testtool.model.questionmanager.Answer> as_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean forall_23 = true;
        int param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            Object[] paramValues = {param_0};
            Class[] paramClasses = {int.class};

            ret = javaTestUtility.getMethodValue(testObj, "selectAnswers", paramValues, paramClasses);
            for(testtool.model.questionmanager.Answer a : as_0)
            {
                forall_23 = forall_23 && (param_0 == param_0);
                forall_23 = forall_23 && (javaTestUtility.getFieldValue(a, "response", java.lang.String.class) != null);
                forall_23 = forall_23 && (javaTestUtility.getFieldValue(a, "isCorrect", boolean.class) != null);
            }
            Assert.assertTrue(forall_23);

            setUp();
        }
    }

    @Test
    public void selectKeywordsTest_5() throws Exception
    {
        int testComboIndex;

        java.util.Collection ret;
        String methodId = "selectKeywords_int";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "qid", java.lang.Integer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        int param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            Object[] paramValues = {param_0};
            Class[] paramClasses = {int.class};

            ret = javaTestUtility.getMethodValue(testObj, "selectKeywords", paramValues, paramClasses);
            Assert.assertTrue(!(ret.isEmpty()));
            setUp();
        }
    }
    /*End generated tests*/
}