package za.ac.cput.Chapter3.Collections.Set.Athlete.Sprinter;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class SprinterTest extends TestCase{

    private Sprinter sprinter1, sprinter2, sprinter3;

    private Set athletes;



    @Before
    public void setUp() throws Exception{

        sprinter1 = new Sprinter("Braedy","Thebus", 5.7, 60.2, 8.5);
        sprinter2 = new Sprinter("Faizel","Jabbar", 5.8, 53.2, 11.25);
        sprinter3 = new Sprinter("Yusra","Ismail", 5.2, 30.2, 20.2);

        athletes = new HashSet();

        athletes.add(sprinter1);
        athletes.add(sprinter2);
        athletes.add(sprinter3);
    }

    @After
    public void tearDown() throws Exception
    {
        sprinter1 = sprinter2 = sprinter3 = null;
        athletes = null;
    }

    @Test
    public void testSprinter() throws Exception{

        //multiple tests to ensure data is written to the set

        //test1: testContains
        assertTrue(athletes.contains(sprinter1));
        assertTrue(athletes.contains(sprinter2));
        assertTrue(athletes.contains(sprinter3));

        //test2: testIsEmpty
        assertFalse(athletes.isEmpty());

        //test3: testSize
        assertEquals(3, athletes.size());
    }
}
