import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.triangle.Main;

public class MainTest {

    @Test
    public void testANotInBounds() {
        assertEquals("Value of a is not in the range of permitted values.", Main.checkTriangle(500, 5, 5));
    }

    @Test
    public void testBNotInBounds() {
        assertEquals("Value of b is not in the range of permitted values.", Main.checkTriangle(5, 500, 5));
        assertEquals("Value of b is not in the range of permitted values.", Main.checkTriangle(5, -5, 5));
    }

    @Test
    public void testCNotInBounds() {
        assertEquals("Value of c is not in the range of permitted values.", Main.checkTriangle(5, 5, 500));
        assertEquals("Value of c is not in the range of permitted values.", Main.checkTriangle(5, 5, -1));
    }


    @Test
    public void testEquilateral() {
        assertEquals("Equilateral", Main.checkTriangle(10, 10, 10));
    }

    @Test
    public void testIsosceles() {
        assertEquals("Isosceles", Main.checkTriangle(5, 5, 1));
        assertEquals("Isosceles", Main.checkTriangle(5, 3, 3));
        assertEquals("Isosceles", Main.checkTriangle(3, 5, 3));
    }

    @Test
    public void testScalene() {
        assertEquals("Scalene", Main.checkTriangle(10, 15, 20));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Main.checkTriangle(200, 1, 1));
    }

    @Test
    public void testMain() {
        Main newInstance = new Main();
        assertNotNull(newInstance);
    }
}
