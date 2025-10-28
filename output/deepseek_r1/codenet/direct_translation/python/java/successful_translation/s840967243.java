import java.util.Scanner;

public class s840967243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.min(a, b);
        int m = Math.max(a, b);
        int MOD = 1000000007;
        long[] fact = new long[m + 1];
        fact[0] = 1;
        for (int i = 1; i <= m; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long res = Math.max(2 - m + n, 0) * fact[n] % MOD * fact[m] % MOD;
        System.out.println(res);
    }
}
