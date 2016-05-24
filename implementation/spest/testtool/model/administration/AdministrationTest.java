package testtool.model.database;

import testtool.model.administration.Administration;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.administration.Administration;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class AdministrationTest
{
    @Before
    public void setUp()
    {
     	testObj = (testtool.model.database.CourseOffering)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.administration\Administration.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("C:\Users\Timothy\Desktop\input\implementation\source\java");
    private File sourceFile = new File("C:\Users\Timothy\Desktop\input\implementation\source\java\testtool\model\administration\Administration.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.database.Administration testObj;
    @Test
    public void editUserTest_0() throws Exception
    {

     	String methodId = "editUser";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_13 = false;

        testObj.deleteUser();
        for(testtool.model.database.User user : users_0)
        {
            exists_13 = exists_13 || (database.contains(user));
        }
	Assert.assertTrue(exists_13);

        setUp();
    }

   @Test
    public void deleteUserTest_1() throws Exception
    {

     	String methodId = "deleteUser";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_14 = false;

        testObj.deleteUser();
        for(testtool.model.database.User user : users_0)
        {
            exists_14 = exists_14 || (database.contains(user));
        }
	Assert.assertTrue(exists_14);

        setUp();
    }

    @Test
    public void searchUsersTest_2() throws Exception
    {

     	String methodId = "searchUsers";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_15 = false;

        testObj.searchUsers();
        for(testtool.model.database.User user : users_0)
        {
            exists_15 = exists_15 || (database.contains(user));
        }
	Assert.assertTrue(exists_15);

        setUp();
    }
    /*End generated tests*/
}
