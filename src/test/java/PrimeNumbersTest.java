import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PrimeNumbersTest {

    @Test
    public void testComputePrimes_ValidInput() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int n = 10;
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7);
        List<Integer> actualPrimes = primeNumbers.computePrimes(n);
        assertEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testComputePrimes_InputZeroOrNegative() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertTrue(primeNumbers.computePrimes(0).isEmpty());
        assertTrue(primeNumbers.computePrimes(-10).isEmpty());
    }

    @Test
    public void testComputePrimes_InputIsOne() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertTrue(primeNumbers.computePrimes(1).isEmpty());
    }

    @Test
    public void testComputePrimes_LargeInput() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int n = 100;
        List<Integer> primes = primeNumbers.computePrimes(n);
        assertNotNull(primes);
        assertTrue(primes.size() > 0);
        assertEquals(25, primes.size());
    }

    @Test
    public void testComputePrimes_OnlyPrimeNumbersReturned() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int n = 30;
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        List<Integer> actualPrimes = primeNumbers.computePrimes(n);
        assertEquals(expectedPrimes, actualPrimes);
    }
    @Test
    public void testSpecialCases() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        assertFalse(primeNumbers.isPrime(-5));  // Số âm không phải số nguyên tố
        assertFalse(primeNumbers.isPrime(0));   // 0 không phải số nguyên tố
        assertFalse(primeNumbers.isPrime(1));   // 1 không phải số nguyên tố
        assertTrue(primeNumbers.isPrime(2));    // 2 là số nguyên tố
        assertTrue(primeNumbers.isPrime(97));   // 97 là số nguyên tố
        assertFalse(primeNumbers.isPrime(100)); // 100 không phải số nguyên tố
        assertTrue(primeNumbers.isPrime(104729)); // Một số nguyên tố lớn
    }
}
