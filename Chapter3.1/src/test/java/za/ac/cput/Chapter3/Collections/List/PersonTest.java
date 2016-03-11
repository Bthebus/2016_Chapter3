package za.ac.cput.Chapter3.Collections.List;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class PersonTest extends TestCase{

    private Person person1, person2, person3;
    private List people;
    private String name;
    private String surname;
    private int age;
    private String IDNumber;

    @Before
    public void setUp() throws Exception
    {
        name = "Braedy";
        surname = "Thebus";
        age = 23;
        IDNumber = "1234567890111";

        people = new ArrayList();

        person1 = new Person(name, surname, age, IDNumber);
        person2 = new Person("John", surname, age, "7894125698745");
        person3 = new Person("Brad", surname, age, "1246987563125");


        people.add(0, person1);
        people.add(1, person2);
        people.add(2, person3);
    }

    @After
    public void tearDown() throws Exception
    {
        person1 = person2 = person3 = null;
        people = null;
    }

    @Test
    public void testPerson() throws Exception
    {
        //test person1 (testing to see if hashcodes are equal)
        assertEquals(person1.hashCode(), people.get(0).hashCode());

        //test person2 (testing to see if hashcodes are equal)
        assertEquals(person2.hashCode(), people.get(1).hashCode());

        //test person3 (testing to see if hashcodes are equal)
        assertEquals(person3.hashCode(), people.get(2).hashCode());
    }
}
