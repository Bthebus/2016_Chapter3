package za.ac.cput.Chapter3_2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter3_2.services.PersonInterface;
import za.ac.cput.Chapter3_2.services.impl.EmployeeServiceImpl;
import za.ac.cput.Chapter3_2.services.impl.StudentServiceImpl;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-12
 */
public class PersonTest extends TestCase{

    private PersonInterface employee, student;

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

        employee = student = null;
    }

    @Test
    public void testPerson() throws Exception{
        employee = new EmployeeServiceImpl("John", "Wick", "5555", "permanent");
        student = new StudentServiceImpl("Braedy", "Thebus", "213039168", "FullTime");

        //testing employee
        assertEquals("John",employee.getName());
        assertEquals("Wick", employee.getSurname());


        //testing student
        assertEquals("Braedy", student.getName());
        assertEquals("Thebus", student.getSurname());

    }
}
