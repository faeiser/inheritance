package shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void shouldThrowIllegalArgumentException1() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Square test = new Square("#ffffff", true, 0);
        });
    }

    @Test
    void shouldThrowIllegalArgumentException2() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Square test = new Square("#ffffff", true, -10);
        });
    }

    @Test
    void testGetArea1() throws IllegalArgumentException {
        Square test = new Square("#ffffff", true, 10);
        assertEquals(100, test.getArea());
    }

    @Test
    void testGetArea2() throws IllegalArgumentException {
        Square test = new Square("#ffffff", true, 32.8);
        assertEquals(1075.84, test.getArea());
    }

    @Test
    void testGetPerimeter1() throws IllegalArgumentException {
        Square test = new Square("#ffffff", true, 10);
        assertEquals(40, test.getPerimeter());
    }

    @Test
    void testGetPerimeter2() throws IllegalArgumentException {
        Square test = new Square("#ffffff", true, 32.8);
        assertEquals(131.20, test.getPerimeter());
    }
}
