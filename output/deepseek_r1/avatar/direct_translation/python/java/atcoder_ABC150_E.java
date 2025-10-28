
import java.util.*;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cStr = scanner.nextLine().split(" ");
        int[] c = new int[cStr.length];
        for (int i = 0; i < cStr.length; i++) {
            c[i] = Integer.parseInt(cStr[i]);
        }
        Arrays.sort(c);
        reverse(c);
        long mod = 1000000007;
        long exponent = 2L * n - 2;
        long b = powMod(2, exponent, mod);
        long a = (2 * b) % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long part = (a + i * b) % mod;
            part = (part * c[i]) % mod;
            ans = (ans + part) % mod;
        }
        System.out.println(ans);
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }


