package testtool.model.database;

import testtool.model.database.Course;
import testing.CombinationSupport;

import org.junit.runner.RunWith;
import testing.runner.SpestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import testing.JavaTestUtility;
import format.ClassNameFormat;
import testtool.model.database.Course;

import java.io.File;
import com.rits.cloning.Cloner;

import java.util.*;

import static testing.JavaTestUtility.getFieldValue;

@RunWith(SpestRunner.class)
public class CourseTest
{
    @Before
    public void setUp()
    {
        testObj = (testtool.model.database.Course)javaTestUtility.getSampleObject(clazz);

    }

    /*Start generated tests*/
    private Class clazz = testtool.model.database.Course.class;

    private Cloner cloner = new Cloner();
    private File rootDirectory = new File("/Users/PetarGeorgiev/Documents/CalPoly/cpe307/implementation/source/java");
    private File sourceFile = new File("/Users/PetarGeorgiev/Documents/CalPoly/cpe307/implementation/source/java/testtool/model/database/Course.java");
    private JavaTestUtility javaTestUtility = new JavaTestUtility(rootDirectory, sourceFile, false);
    private testtool.model.database.Course testObj;    /*End generated tests*/
}