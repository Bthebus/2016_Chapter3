package za.ac.cput.Chapter3_3;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Chapter3_3.appConfig.AppConfig;
import za.ac.cput.Chapter3_3.services.PersonInterface;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-12
 */
public class PersonTest extends TestCase{

    private PersonInterface student, employee;
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception{

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        student = (PersonInterface)ctx.getBean("student");
        employee = (PersonInterface)ctx.getBean("employee");
    }

    @After
    public void tearDOwn() throws Exception
    {
        student = employee = null;
        ctx = null;
    }

    @Test
    public void testPerson() throws Exception
    {

        //testing student
        assertEquals("Braedy", student.getName());
        assertEquals("Thebus", student.getSurname());

        //testing employee
        assertEquals("John", employee.getName());
        assertEquals("Wick", employee.getSurname());
    }
}
