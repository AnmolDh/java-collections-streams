import com.testing.calculator.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calc.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(1, calc.divide(5, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
