
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC150_E {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        scanner.close();

        long result = computeSpecialSum(n, c);
        System.out.println(result);
    }

    private static long computeSpecialSum(int n, int[] c) {
        Arrays.sort(c);
        reverseArray(c);

        long b = powMod(2, 2 * n - 2, MOD);
        long a = (2 * b) % MOD;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + c[i] * (a + i * b) % MOD) % MOD;
        }

        return ans;
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

    private static long powMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}

