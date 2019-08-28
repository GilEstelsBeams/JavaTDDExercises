import Fibonacci.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestFibonacci {


    @Test
    public void testMakesSimpleFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(3);
        assertEquals(2,number);
    }

    @Test
    public void testZeroFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(0);
        assertEquals(0,number);
    }

    @Test
    public void testOneFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(1);
        assertEquals(1,number);
    }

    @Test
    public void testNegativeFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(-5);
        assertEquals(-1,number);
    }

    @Test
    public void testLargeFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(17);
        assertEquals(1597,number);
    }

    @Test
    public void testFiftiethFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        long number= fibonacci.fib(50);
        assertEquals(12586269025L,number);
    }
}