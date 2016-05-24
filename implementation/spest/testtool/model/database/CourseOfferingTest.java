package testtool.model.database;

import testtool.model.database.CourseOffering;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.database.CourseOffering;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class CourseOfferingTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.database.CourseOffering)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.database.CourseOffering.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("C:\Users\Timothy\Desktop\input\implementation\source\java");
    private File sourceFile = new File("C:\Users\Timothy\Desktop\input\implementation\source\java\testtool\model\database\CourseOffering.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.database.CourseOffering testObj;
    @Test
    public void enrollStudentTest_0() throws Exception
    {

        String methodId = "enrollStudent";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_13 = false;

        testObj.enrollStudent();
        for(testtool.model.database.User user : users_0)
        {
            exists_13 = exists_13 || (database.contains(user));
        }
        Assert.assertTrue(exists_13);

        setUp();
    }

    @Test
    public void dropStudentTest_1() throws Exception
    {

        String methodId = "dropStudent";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_14 = false;

        testObj.dropStudent();
        for(testtool.model.database.User user : users_0)
        {
            exists_14 = exists_14 || (database.contains(user));
        }
        Assert.assertTrue(exists_14);

        setUp();
    }

    @Test
    public void addTestTest_2() throws Exception
    {

        String methodId = "addTest";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_15 = false;

        testObj.addTest();
        for(testtool.model.database.User user : users_0)
        {
            exists_15 = exists_15 || (database.contains(user));
        }
        Assert.assertTrue(exists_15);

        setUp();
    }

    @Test
    public void removeTestTest_3() throws Exception
    {

        String methodId = "removeTest";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_16 = false;

        testObj.removeTest();
        for(testtool.model.database.User user : users_0)
        {
            exists_16 = exists_16 || (database.contains(user));
        }
        Assert.assertTrue(exists_16);

        setUp();
    }
    /*End generated tests*/
}