
import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(inputArray[i]);
        }
        long result = 0;
        final int MOD = 1000000007;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (long num : A) {
                if (((num >> b) & 1) != 0) {
                    bs++;
                }
            }
            long term = ((long) bs * (N - bs)) % MOD;
            term = (term * ((1L << b) % MOD)) % MOD;
            result = (result + term) % MOD;
        }
        System.out.println(result);
    }
}

