import PrimeNumbers.PrimeNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testListNoPrime() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primes(0));
    }

    @Test
    public void testListWorkingNoPrime() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primes(0));
    }
    @Test
    public void testListReallyWorkingPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(9), pN.primes(9));
    }    @Test
    public void testListWorkingSmallPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(3), pN.primes(3));
    }        @Test
    public void testListWorkingNegativePrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(-8), pN.primes(-8));
    }

    @Test
    public void testListWorkingBigPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(4459), pN.primes(4459));
    }

}