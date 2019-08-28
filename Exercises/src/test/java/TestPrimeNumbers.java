import PrimeNumbers.PrimeNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPrimeNumbers {


    @Test
    public void testIsPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true,pN.isPrime(3));
    }

    @Test
    public void testIsNotPrimeNumber() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false,pN.isPrime(4));
    }
}