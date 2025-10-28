
public class s840967243 {
    static final long MOD = (long)1e9 + 7;
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        System.out.println((Math.max(2 - m + n, 0) * fact(n) % MOD * fact(m) % MOD) % MOD);
    }
    static long fact(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }
}

