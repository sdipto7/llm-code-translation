
import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        long[] A = new long[N];
        String[] parts = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(parts[i]);
        }
        long MOD = 1000000007;
        long result = 0;
        for (int b = 0; b < 60; b++) {
            int count = 0;
            for (long num : A) {
                if ((num & (1L << b)) != 0) {
                    count++;
                }
            }
            long term = ((long) count * (N - count) % MOD) * ((1L << b) % MOD) % MOD;
            result = (result + term) % MOD;
        }
        System.out.println(result);
    }
}

