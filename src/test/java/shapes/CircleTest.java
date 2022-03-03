package shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void shouldThrowIllegalArgumentException1() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Circle test = new Circle("#ffffff", false, -22);
        });
    }

    @Test
    void shouldThrowIllegalArgumentException2() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            Circle test = new Circle("#ffffff", false, 0);
        });
    }

    @Test
    void testGetArea1() throws IllegalArgumentException {
        Circle test = new Circle("#ffffff", false, 4.8);
        assertEquals(72.382, test.getArea(), 0.001);
    }

    @Test
    void testGetArea2() throws IllegalArgumentException {
        Circle test = new Circle("#ffffff", false, 48.3);
        assertEquals(7328.99, test.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter1() throws IllegalArgumentException {
        Circle test = new Circle("#ffffff", false, 4.8);
        assertEquals(30.159, test.getPerimeter(), 0.001);
    }

    @Test
    void testGetPerimeter2() throws IllegalArgumentException {
        Circle test = new Circle("#ffffff", false, 48.3);
        assertEquals(303.478, test.getPerimeter(), 0.001);
    }
}
