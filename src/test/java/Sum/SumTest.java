package Sum;
import static org.junit.Assert.*;
import org.junit.Test;

public class SumTest {

    @Test
    public void testCalculateSum() {
        assertEquals("Test case with positive numbers", 5.0, Sum.calculateSum(2.0, 3.0), 0.001);
        assertEquals("Test case with negative numbers", -1.0, Sum.calculateSum(-2.0, 1.0), 0.001);
        assertEquals("Test case with zero", 0.0, Sum.calculateSum(0.0, 0.0), 0.001);
        assertEquals("Test case with positive and negative", 1.0, Sum.calculateSum(3.0, -2.0), 0.001);
    }
}
