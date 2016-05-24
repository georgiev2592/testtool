package testtool.model.administration;

import testtool.model.administration.Login;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.administration.Login;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class LoginTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.administration.Login)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.administration.Login.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("C:\Users\Ian\Documents\CSC307\test\input\src");
    private File sourceFile = new File("C:\Users\Ian\Documents\CSC307\test\input\src\testtool\model\administration\Login.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.administration.Login testObj;
    @Test
    public void logoutTest_0() throws Exception
    {

        String methodId = "logout";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_7 = false;

        testObj.logout();
        for(testtool.model.database.User user : users_0)
        {
            exists_7 = exists_7 || (database.contains(user));
        }
        Assert.assertTrue(exists_7);

        setUp();
    }

    @Test
    public void loginTest_1() throws Exception
    {
        int testComboIndex;

        String methodId = "login_java.lang.String_java.lang.String";
        List<java.lang.String> testPoints_0 = javaTestUtility.getSampleObjects(testObj, methodId, "user", java.lang.String.class);
        List<java.lang.String> testPoints_1 = javaTestUtility.getSampleObjects(testObj, methodId, "pw", java.lang.String.class);
        int[][] combinations = CombinationSupport.getCombinations(testPoints_0.size(), testPoints_1.size());

        Class[] parameterClasses = {java.lang.String.class,java.lang.String.class};
        List<testtool.model.database.User> userpersons_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_10 = false;
        java.lang.String param_0;
        java.lang.String param_1;
        for(testComboIndex = 0; testComboIndex < combinations.length; testComboIndex++)
        {
            param_0 = testPoints_0.get(combinations[testComboIndex][0]);
            param_1 = testPoints_1.get(combinations[testComboIndex][1]);

            testObj.login(param_0, param_1);
            for(testtool.model.database.User userperson : userpersons_0)
            {
                exists_10 = exists_10 || (database.spestDB.contains(userperson));
                exists_10 = exists_10 || (userperson.username.equals(user));
                exists_10 = exists_10 || (userperson.password.equals(pw));
            }
            Assert.assertTrue(exists_10);

            setUp();
        }
    }

    @Test
    public void forgotPasswordTest_2() throws Exception
    {

        String methodId = "forgotPassword";
        Class[] parameterClasses = {};
        List<testtool.model.database.User> users_0 = javaTestUtility.getUniversalValues(testObj, methodId, 0);
        boolean exists_14 = false;

        testObj.forgotPassword();
        for(testtool.model.database.User user : users_0)
        {
            exists_14 = exists_14 || (javaTestUtility.getFieldValue(user, "email", java.lang.String.class) != null);
        }
        Assert.assertTrue(exists_14);

        setUp();
    }
    /*End generated tests*/
}