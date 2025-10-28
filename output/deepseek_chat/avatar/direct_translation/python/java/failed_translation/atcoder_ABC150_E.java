import java.util.*;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int n = sc.nextInt();
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        int b = (int)Math.pow(2, 2 * n - 2) % mod;
        int a = 2 * b % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (long)(a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}
