
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        reverseArray(c);
        long mod = (long) (1e9 + 7);
        long b = power(2, 2L * n - 2, mod);
        long a = (2 * b) % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) c[i] * (a + (long) i * b)) % mod;
        }
        System.out.println(ans);
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    private static long power(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}

