import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PrimeNumbersTest {

    private PrimeNumbers primeNumbers;

    @BeforeEach
    public void setup() {
        primeNumbers = new PrimeNumbers();
    }

    @Test
    public void testComputePrimes_ValidInput() {
        int n = 10;
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7);
        List<Integer> actualPrimes = primeNumbers.computePrimes(n);
        assertEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testComputePrimes_InputZeroOrNegative() {
        assertTrue(primeNumbers.computePrimes(0).isEmpty());
        assertTrue(primeNumbers.computePrimes(-10).isEmpty());
    }

    @Test
    public void testComputePrimes_InputIsOne() {
        assertTrue(primeNumbers.computePrimes(1).isEmpty());
    }

    @Test
    public void testComputePrimes_LargeInput() {
        int n = 1000;
        List<Integer> primes = primeNumbers.computePrimes(n);
        assertNotNull(primes);
        assertFalse(primes.isEmpty());
        assertTrue(primes.size() > 0); // Kiểm tra nếu có số nguyên tố trả về
    }

    @Test
    public void testComputePrimes_OnlyPrimeNumbersReturned() {
        int n = 30;
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        List<Integer> actualPrimes = primeNumbers.computePrimes(n);
        assertEquals(expectedPrimes, actualPrimes);
    }

    @Test
    public void testSpecialCases() {
        assertAll("Check for prime cases",
                () -> assertFalse(primeNumbers.isPrime(-5)),
                () -> assertFalse(primeNumbers.isPrime(0)),
                () -> assertFalse(primeNumbers.isPrime(1)),
                () -> assertTrue(primeNumbers.isPrime(2)),
                () -> assertTrue(primeNumbers.isPrime(97)),
                () -> assertFalse(primeNumbers.isPrime(100)),
                () -> assertTrue(primeNumbers.isPrime(104729))
        );
    }

    @Test
    public void testComputePrimes_Performance() {
        long startTime = System.nanoTime();
        primeNumbers.computePrimes(10000);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        assertTrue(duration < 1000000000, "Test duration is too long!");
    }
}
