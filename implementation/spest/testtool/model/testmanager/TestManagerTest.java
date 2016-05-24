package testtool.model.testmanager;

import testtool.model.testmanager.TestManager;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.testmanager.TestManager;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class TestManagerTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.testmanager.TestManager)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.testmanager.TestManager.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("/Users/PetarGeorgiev/Documents/CalPoly/NetBeansProjects/WBTestTool/src");
    private File sourceFile = new File("/Users/PetarGeorgiev/Documents/CalPoly/NetBeansProjects/WBTestTool/src/testtool/model/testmanager/TestManager.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.testmanager.TestManager testObj;
    @Test
    public void createTestTest_0() throws Exception
    {
        int testComboIndex;

        String methodId = "createTest_java.lang.String_java.lang.String";
        List<java.lang.String> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "title", java.lang.String.class);
        List<java.lang.String> testPoints_1 = javaTestUtility.getSampleObjects(testObj, methodId, "introduction", java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size(), testPoints_1.size());

        Class[] parameterClasses = {java.lang.String.class,java.lang.String.class};
        List<java.lang.String> titles_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_89 = false;
        List<java.lang.String> introductions_1 = javaTestUtility.getUniversalValues(testObj, methodId, 1);
        boolean exists_90 = false;
        java.lang.String param_0;
        java.lang.String param_1;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);
            param_1 = testPoints_1.get(combinations[testComboIndex][1]);

            testObj.createTest(param_0, param_1);
            for(java.lang.String title : titles_0)
            {
                exists_89 = exists_89 || (title.length() > 0);
            }
            Assert.assertTrue(exists_89);
            for(java.lang.String introduction : introductions_1)
            {
                exists_90 = exists_90 || (introduction.length() > 0);
            }
            Assert.assertTrue(exists_90);

            setUp();
        }
    }

    @Test
    public void editTestTest_1() throws Exception
    {
        int testComboIndex;

        String methodId = "editTest_testtool.model.testmanager.Test";
        List<testtool.model.testmanager.Test> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "t", testtool.model.testmanager.Test.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {testtool.model.testmanager.Test.class};
        List<testtool.model.testmanager.Test> ts_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_93 = false;
        testtool.model.testmanager.Test param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.editTest(param_0);
            for(testtool.model.testmanager.Test t : ts_0)
            {
                exists_93 = exists_93 || (database.contains(t));
            }
            Assert.assertTrue(exists_93);

            setUp();
        }
    }

    @Test
    public void deleteTestTest_2() throws Exception
    {
        int testComboIndex;

        String methodId = "deleteTest_testtool.model.testmanager.Test";
        List<testtool.model.testmanager.Test> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "t", testtool.model.testmanager.Test.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {testtool.model.testmanager.Test.class};
        List<testtool.model.testmanager.Test> ts_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_95 = false;
        testtool.model.testmanager.Test param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.deleteTest(param_0);
            for(testtool.model.testmanager.Test t : ts_0)
            {
                exists_95 = exists_95 || (database.contains(t));
            }
            Assert.assertTrue(exists_95);

            setUp();
        }
    }

    @Test
    public void searchTest_3() throws Exception
    {
        int testComboIndex;

        String methodId = "search_java.lang.String";
        List<java.lang.String> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "testName", java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {java.lang.String.class};
        List<java.lang.String> testNames_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_98 = false;
        java.lang.String param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            testObj.search(param_0);
            for(java.lang.String testName : testNames_0)
            {
                exists_98 = exists_98 || (testName.length() > 0);
            }
            Assert.assertTrue(exists_98);

            setUp();
        }
    }

    @Test
    public void publishTestTest_4() throws Exception
    {
        int testComboIndex;

        String methodId = "publishTest_testtool.model.testmanager.Test";
        List<testtool.model.testmanager.Test> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "t", testtool.model.testmanager.Test.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size());

        Class[] parameterClasses = {testtool.model.testmanager.Test.class};
        List<testtool.model.testmanager.Test> ts_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_100 = false;
        testtool.model.testmanager.Test param_0;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);

            for(testtool.model.testmanager.Test t : ts_0)
            {
                exists_100 = exists_100 || (database.contains(t));
            }
            Assert.assertTrue(exists_100);

            setUp();
        }
    }
    /*End generated tests*/
}
