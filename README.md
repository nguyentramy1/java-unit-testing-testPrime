![image](https://github.com/user-attachments/assets/1ecee84e-1066-4005-8441-8f83547f3a2b)# Kiểm thử đơn vị với java - kiểm tra số nguyên tố

Dự án này chứa bộ unit test cho lớp `NumberUtils`, bao gồm một phương thức kiểm tra số nguyên có phải là số nguyên tố hay không. Các bài kiểm tra kiểm tra các trường hợp khác nhau như số nguyên tố, số không phải nguyên tố, và số âm.

## File NumberUtils.java
Lớp `NumberUtils` cung cấp một phương thức tĩnh `isPrime(int n)` để xác định liệu một số có phải là số nguyên tố hay không.


```java
public class NumberUtils {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

```
## File NumberUtilsTest.java

Các bài kiểm tra được viết bằng JUnit 5 để kiểm tra chức năng của phương thức isPrime trong các trường hợp sau:

### 1. Kiểm Tra với Các Số Nguyên Tố
Kiểm tra xem phương thức có nhận dạng chính xác các số nguyên tố không.
```java
@Test
void testIsPrimeWithPrimeNumbers() {
    assertTrue(NumberUtils.isPrime(2));
    assertTrue(NumberUtils.isPrime(3));
    assertTrue(NumberUtils.isPrime(5));
    assertTrue(NumberUtils.isPrime(7));
    assertTrue(NumberUtils.isPrime(13));
}
```
### 2. Kiểm Tra với Các Số Không Phải Nguyên Tố
Kiểm tra xem phương thức có nhận dạng chính xác các số không phải nguyên tố không.
```java
@Test
void testIsPrimeWithNonPrimeNumbers() {
    assertFalse(NumberUtils.isPrime(0));
    assertFalse(NumberUtils.isPrime(1));
    assertFalse(NumberUtils.isPrime(4));
    assertFalse(NumberUtils.isPrime(6));
    assertFalse(NumberUtils.isPrime(8));
}
```
### 3. Kiểm Tra với Các Số Âm
Kiểm tra xem phương thức có trả về false với các số âm không.
```java
@Test
void testIsPrimeWithNegativeNumbers() {
    assertFalse(NumberUtils.isPrime(-1));
    assertFalse(NumberUtils.isPrime(-2));
    assertFalse(NumberUtils.isPrime(-17));
}
```
## Tác giả : 
Nguyễn Trà My
## Nguồn tham khảo: 
https://chatgpt.com/share/677b4af5-6a20-8006-bead-461da2aefddd
## Kết quả:
![image](https://github.com/user-attachments/assets/68a26f16-956a-449e-9470-8330386a7624)

