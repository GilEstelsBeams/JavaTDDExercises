import PrimeNumbers.PrimeNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPrimeNumbers {


    @Test
    public void testIsPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrime(3));
    }

    @Test
    public void testIsNotPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrime(4));
    }

    @Test
    public void testNegativeIsNotPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrime(-3));
    }

    @Test
    public void testFiveIsPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrime(5));
    }


    @Test
    public void testSixIsNotPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrime(6));
    }

    @Test
    public void testBigNumberNotPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrime(77));
    }

    @Test
    public void testBigNumberPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrime(53));
    }
}