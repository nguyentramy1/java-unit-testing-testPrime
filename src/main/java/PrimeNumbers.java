import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> computePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 1) {
            return primes; // Trả về danh sách rỗng nếu n <= 1
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i); // Thêm số nguyên tố vào danh sách
            }
        }

        return primes;
    }
    // Phương thức kiểm tra số nguyên tố
    public boolean isPrime(int n) {
        if (n <= 1) return false;  // Loại trừ số âm, 0 và 1
        if (n <= 3) return true;   // 2 và 3 là số nguyên tố
        if (n % 2 == 0 || n % 3 == 0) return false;  // Loại bỏ bội số của 2 và 3

        int sqrt = (int) Math.sqrt(n);  // Kiểm tra đến căn bậc hai
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
