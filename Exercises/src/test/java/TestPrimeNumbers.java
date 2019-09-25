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
        assertEquals( list, pN.primesStatic(0));
    }

    @Test
    public void testListWorkingNoPrime() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primesStatic(0));
    }
    @Test
    public void testListReallyWorkingPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(24), pN.primesStatic(9));
    }    @Test
    public void testListWorkingSmallPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(6), pN.primesStatic(3));
    }        @Test
    public void testListWorkingNegativePrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(-8), pN.primesStatic(-8));
    }

    @Test
    public void testListWorkingBigPrime() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(2742), pN.primesStatic(400));
    }
@Test
    public void testListNoPrimeD() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primesDynamic(0));
    }

    @Test
    public void testListWorkingNoPrimeD() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primesDynamic(0));
    }
    @Test
    public void testListReallyWorkingPrimeD() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(24), pN.primesDynamic(9));
    }    @Test
    public void testListWorkingSmallPrimeD() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(6), pN.primesDynamic(3));
    }        @Test
    public void testListWorkingNegativePrimeD() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(-8), pN.primesDynamic(-8));
    }

    @Test
    public void testListWorkingBigPrimeD() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(2742), pN.primesDynamic(400));
    }

    @Test
    public void testListNoPrimeS() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primesNoThreadPool(0));
    }

    @Test
    public void testListWorkingNoPrimeS() {
        PrimeNumber pN=new PrimeNumber();
        List<Integer> list= new ArrayList<Integer>();
        assertEquals( list, pN.primesNoThreadPool(0));
    }
    @Test
    public void testListReallyWorkingPrimeS() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(24), pN.primesNoThreadPool(9));
    }    @Test
    public void testListWorkingSmallPrimeS() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(6), pN.primesNoThreadPool(3));
    }        @Test
    public void testListWorkingNegativePrimeS() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(-8), pN.primesNoThreadPool(-8));
    }

    @Test
    public void testListWorkingBigPrimeS() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals( pN.primes2(2742), pN.primesNoThreadPool(400));
    }

    @Test
    public void testIsPrimeNumberC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrimeCached(3));
    }

    @Test
    public void testIsNotPrimeNumberC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrimeCached(4));
    }

    @Test
    public void testNegativeIsNotPrimeNumberC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrimeCached(-3));
    }

    @Test
    public void testFiveIsPrimeNumberC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrimeCached(5));
    }


    @Test
    public void testSixIsNotPrimeNumberC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrimeCached(6));
    }

    @Test
    public void testBigNumberNotPrimeC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(false , pN.isPrimeCached(77));
    }

    @Test
    public void testBigNumberPrimeC() {
        PrimeNumber pN=new PrimeNumber();
        assertEquals(true , pN.isPrimeCached(53));
    }


}