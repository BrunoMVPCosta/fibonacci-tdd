/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test 
    public void fibonacci_given0_returns0() {
        // arrange
        Fibonacci fibonacci = new Fibonacci();
        int number = 0;

        // act
        int result = fibonacci.calculate(number);

        // assert
        assertSame(result, 0);
    }

    @Test 
    public void fibonacci_given1_returns1() {
        // arrange
        Fibonacci fibonacci = new Fibonacci();
        int number = 1;

        // act
        int result = fibonacci.calculate(number);

        // assert
        assertSame(result, 1);
    }
}
