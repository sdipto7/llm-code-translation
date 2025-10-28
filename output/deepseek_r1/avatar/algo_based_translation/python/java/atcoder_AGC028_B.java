
import java.util.Scanner;

public class atcoder_AGC028_B {
    private static final long MOD = 1000000007;
    private static final int Nsq = 1000;
    private static final int M = Nsq * Nsq;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(inputValues[i]);
        }

        long[][] factMatrix = new long[Nsq][Nsq];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                factMatrix[i][j] = i * Nsq + j;
            }
        }
        factMatrix[0][0] = 1;

        for (int col = 1; col < Nsq; col++) {
            for (int row = 0; row < Nsq; row++) {
                factMatrix[row][col] = (factMatrix[row][col] * factMatrix[row][col - 1]) % MOD;
            }
        }

        for (int row = 1; row < Nsq; row++) {
            long multiplier = factMatrix[row - 1][Nsq - 1];
            for (int col = 0; col < Nsq; col++) {
                factMatrix[row][col] = (factMatrix[row][col] * multiplier) % MOD;
            }
        }

        long[] fact = new long[M];
        int index = 0;
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact[index++] = factMatrix[i][j];
            }
        }

        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = modularExponentiation(i + 1, MOD - 2);
        }

        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i] + inv[i - 1]) % MOD;
        }

        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            int reverseIndex = N - 1 - i;
            long sum = (inv[i] + inv[reverseIndex]) % MOD;
            temp[i] = (sum - 1 + MOD) % MOD;
        }

        long result = 0;
        for (int i = 0; i < N; i++) {
            result = (result + (A[i] * temp[i]) % MOD) % MOD;
        }
        result = (result * fact[N]) % MOD;

        System.out.println(result);
    }

    private static long modularExponentiation(long base, long exponent) {
        long result = 1;
        base = base % MOD;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % MOD;
            }
            exponent >>= 1;
            base = (base * base) % MOD;
        }
        return result;
    }
}

