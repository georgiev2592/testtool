package testtool.model.grademanager;

import testtool.model.grademanager.GradeManager;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.grademanager.GradeManager;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class GradeManagerTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.grademanager.GradeManager)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.grademanager.GradeManager.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("C:\Users\Ian\Documents\CSC307\test\input\src");
    private File sourceFile = new File("C:\Users\Ian\Documents\CSC307\test\input\src\testtool\model\grademanager\GradeManager.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.grademanager.GradeManager testObj;
    @Test
    public void getCourseListTest_0() throws Exception
    {
        java.util.Collection<testtool.model.database.CourseOffering> courseList = cloner.deepClone(getFieldValue(testObj, "courseList", java.util.Collection.class));


        String methodId = "getCourseList";

        testObj.getCourseList();
        Assert.assertTrue(courseList != null);
        setUp();
    }

    @Test
    public void getTestListTest_1() throws Exception
    {
        java.util.Collection<testtool.model.testmanager.PublishedTest> testList = cloner.deepClone(getFieldValue(testObj, "testList", java.util.Collection.class));


        String methodId = "getTestList";

        testObj.getTestList();
        Assert.assertTrue(testList != null);
        setUp();
    }

    @Test
    public void gradeTestTest_2() throws Exception
    {
        testtool.model.grademanager.ActiveGradeTest activeTest = cloner.deepClone(getFieldValue(testObj, "activeTest", testtool.model.grademanager.ActiveGradeTest.class));

        int testComboIndex;

        String methodId = "gradeTest_testtool.model.testmanager.PublishedTest";
        List<testtool.model.testmanager.PublishedTest> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "test", testtool.model.testmanager.PublishedTest.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        testtool.model.testmanager.PublishedTest param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.gradeTest(param_0);
            Assert.assertTrue(activeTest != null);
            setUp();
        }
    }
    /*End generated tests*/
}