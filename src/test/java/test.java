import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class test {
    ArrayList<Student> student;
    ArrayList<Module> module;
    //ArrayList<Course> course;
    Course course;
    Date date;
    Student testStudent = new Student("Jarlath Healy", 21, 17419602, course, new ArrayList<Module>(), date);
    Module testModule = new Module("Maths", 246, new ArrayList<Student>(), new ArrayList<Course>());
    Course testCourse = new Course("BST", new ArrayList<Student>(), new ArrayList<Module>(), new LocalDate(2018-06-07), new LocalDate(2019-05-04) );


    
    @Test
    public void usernameReturnsNamePlusAge() {
        Assert.assertEquals("jarlathhealy21", testStudent.getUserName(), "" + "Correct, Test Passed");
    }

    @Test
    public void testAddCourse() {
        testStudent.addCourse(testCourse);
    }


}

