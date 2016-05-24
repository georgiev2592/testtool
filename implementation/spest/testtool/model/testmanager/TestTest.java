package testtool.model.testmanager;

import testtool.model.testmanager.Test;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.testmanager.Test;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class TestTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.testmanager.Test)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.testmanager.Test.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("/Users/PetarGeorgiev/Documents/CalPoly/NetBeansProjects/WBTestTool/src");
    private File sourceFile = new File("/Users/PetarGeorgiev/Documents/CalPoly/NetBeansProjects/WBTestTool/src/testtool/model/testmanager/Test.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.testmanager.Test testObj;
    @Test
    public void setIdTest_0() throws Exception
    {
        int testComboIndex;

        String methodId = "setId_int";
        List<java.lang.Integer> testPoints_0 = javaTestUtility.getSamplePrimitives(testObj, methodId, "id", java.lang.Integer.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {int.class};
        List<java.lang.Integer> ids_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_88 = false;
        int param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setId(param_0);
            for(int id : ids_0)
            {
                exists_88 = exists_88 || (id > 0);
            }
            Assert.assertTrue(exists_88);

            setUp();
        }
    }

    @Test
    public void setQuestionsTest_1() throws Exception
    {
        int testComboIndex;

        String methodId = "setQuestions_java.util.Collection";
        List<java.util.Collection> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "questions", java.util.Collection.class, testtool.model.questionmanager.Question.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {java.util.Collection.class};
        List<java.lang.Integer> is_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_91 = false;
        java.util.Collection<testtool.model.questionmanager.Question> param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setQuestions(param_0);
            for(int i : is_0)
            {
                exists_91 = exists_91 || (questions.size() > 0);
            }
            Assert.assertTrue(exists_91);

            setUp();
        }
    }

    @Test
    public void setTitleTest_2() throws Exception
    {
        int testComboIndex;

        String methodId = "setTitle_java.lang.String";
        List<java.lang.String> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "title", java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {java.lang.String.class};
        List<java.lang.String> titles_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_92 = false;
        java.lang.String param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setTitle(param_0);
            for(java.lang.String title : titles_0)
            {
                exists_92 = exists_92 || (title.length() > 0);
            }
            Assert.assertTrue(exists_92);

            setUp();
        }
    }

    @Test
    public void setIntroductionTest_3() throws Exception
    {
        int testComboIndex;

        String methodId = "setIntroduction_java.lang.String";
        List<java.lang.String> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "introduction", java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {java.lang.String.class};
        List<java.lang.String> introductions_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_94 = false;
        java.lang.String param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setIntroduction(param_0);
            for(java.lang.String introduction : introductions_0)
            {
                exists_94 = exists_94 || (introduction.length() > 0);
            }
            Assert.assertTrue(exists_94);

            setUp();
        }
    }

    @Test
    public void setCourseTest_4() throws Exception
    {
        int testComboIndex;

        String methodId = "setCourse_testtool.model.administration.Course";
        List<testtool.model.administration.Course> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "course", testtool.model.administration.Course.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {testtool.model.administration.Course.class};
        List<testtool.model.administration.Course> courses_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_96 = false;
        testtool.model.administration.Course param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setCourse(param_0);
            for(testtool.model.administration.Course course : courses_0)
            {
                exists_96 = exists_96 || (course != null);
            }
            Assert.assertTrue(exists_96);

            setUp();
        }
    }

    @Test
    public void setCreatedByTest_5() throws Exception
    {
        int testComboIndex;

        String methodId = "setCreatedBy_testtool.model.administration.User";
        List<testtool.model.administration.User> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "createdBy", testtool.model.administration.User.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {testtool.model.administration.User.class};
        List<testtool.model.administration.User> createdBys_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_97 = false;
        testtool.model.administration.User param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setCreatedBy(param_0);
            for(testtool.model.administration.User createdBy : createdBys_0)
            {
                exists_97 = exists_97 || (createdBy != null);
            }
            Assert.assertTrue(exists_97);

            setUp();
        }
    }

    @Test
    public void setCreatedOnTest_6() throws Exception
    {
        int testComboIndex;

        String methodId = "setCreatedOn_java.util.Date";
        List<java.util.Date> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "createdOn", java.util.Date.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {java.util.Date.class};
        List<java.util.Date> createdOns_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_99 = false;
        java.util.Date param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.setCreatedOn(param_0);
            for(java.util.Date createdOn : createdOns_0)
            {
                exists_99 = exists_99 || (createdOn != null);
            }
            Assert.assertTrue(exists_99);

            setUp();
        }
    }
    /*End generated tests*/
}
