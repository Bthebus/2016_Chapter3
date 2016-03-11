package za.ac.cput.Chapter3.Collections.Map;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class RectangleTest extends TestCase {

    private Rectangle rectangle1, rectangle2, rectangle3;
    private Map shapes;

    @Before
    public void setUp() throws Exception{

        rectangle1 = new Rectangle(10.5, 45);
        rectangle2 = new Rectangle(9, 32.1);
        rectangle3 = new Rectangle(13, 20.2);

        shapes = new HashMap();
        shapes.put("1", rectangle1);
        shapes.put("2", rectangle2);
        shapes.put("3", rectangle3);
    }

    @After
    public void tearDown() throws Exception
    {
        rectangle1 = rectangle2 = rectangle3 = null;
        shapes = null;
    }

    @Test
    public void testRectangle() throws Exception
    {
        //testing rectangle1 to see if hash codes are equal
        assertEquals(rectangle1.hashCode(), shapes.get("1").hashCode());

        //testing rectangle2 to see if hash codes are equal
        assertEquals(rectangle2.hashCode(), shapes.get("2").hashCode());

        //testing rectangle3 to see if hash codes are equal
        assertEquals(rectangle3.hashCode(), shapes.get("3").hashCode());

    }
}
