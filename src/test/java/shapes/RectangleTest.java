package shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void shouldThrowIllegalArgumentException1() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle test = new Rectangle("#ffffff", true, -1, 10);
        });
    }

    @Test
    void shouldThrowIllegalArgumentException2() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle test = new Rectangle("#ffffff", true, 10, 0);
        });
    }

    @Test
    void testGetArea1() throws IllegalArgumentException {
        Rectangle test = new Rectangle("#ffffff", true, 15, 10);
        assertEquals(150, test.getArea());
    }

    @Test
    void testGetArea2() throws IllegalArgumentException {
        Rectangle test = new Rectangle("#ffffff", true, 25, 31.1);
        assertEquals(777, 5, test.getArea());
    }

    @Test
    void testGetPerimeter1() throws IllegalArgumentException {
        Rectangle test = new Rectangle("#ffffff", true, 15, 10);
        assertEquals(50, test.getPerimeter());
    }

    @Test
    void testGetPerimeter2() throws IllegalArgumentException {
        Rectangle test = new Rectangle("#ffffff", true, 25, 31.1);
        assertEquals(112, 2, test.getPerimeter());
    }
}
