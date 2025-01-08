import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> computePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 1) {
            return primes; // Trả về danh sách rỗng nếu n <= 1
        }

        for (int i = 2; i <= n; i++) {
            if (NumberUtils.isPrime(i)) {
                primes.add(i); // Thêm số nguyên tố vào danh sách
            }
        }

        return primes;
    }
}
