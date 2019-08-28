import Fibonacci.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestFibonacci {


    @Test
    public void testMakesSimpleFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        int number= fibonacci.fib(3);
        assertEquals(2,number);
    }

    @Test
    public void testZeroFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        int number= fibonacci.fib(0);
        assertEquals(0,number);
    }

    @Test
    public void testOneFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        int number= fibonacci.fib(1);
        assertEquals(1,number);
    }

    @Test
    public void testNegativeFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        int number= fibonacci.fib(-5);
        assertEquals(-1,number);
    }

    @Test
    public void testLargeFibonacci() {
        Fibonacci fibonacci=new Fibonacci();
        int number= fibonacci.fib(17);
        assertEquals(1597,number);
    }
}