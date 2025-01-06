import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    void testIsPrimeWithPrimeNumbers() {
        assertTrue(NumberUtils.isPrime(2));
        assertTrue(NumberUtils.isPrime(3));
        assertTrue(NumberUtils.isPrime(5));
        assertTrue(NumberUtils.isPrime(7));
        assertTrue(NumberUtils.isPrime(13));
    }

    @Test
    void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(NumberUtils.isPrime(0));
        assertFalse(NumberUtils.isPrime(1));
        assertFalse(NumberUtils.isPrime(4));
        assertFalse(NumberUtils.isPrime(6));
        assertFalse(NumberUtils.isPrime(8));
    }

    @Test
    void testIsPrimeWithNegativeNumbers() {
        assertFalse(NumberUtils.isPrime(-1));
        assertFalse(NumberUtils.isPrime(-2));
        assertFalse(NumberUtils.isPrime(-17));
    }
}
