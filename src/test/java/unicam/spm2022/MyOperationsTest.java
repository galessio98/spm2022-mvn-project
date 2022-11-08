package unicam.spm2022;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class MyOperationsTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyOperations tester = new MyOperations(); // MyClass is tested
        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}