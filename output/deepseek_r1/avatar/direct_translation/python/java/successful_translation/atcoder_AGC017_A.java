
import java.util.Scanner;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0, zero = 0;
        for (int a : lis) {
            if (a % 2 == 1) one++;
            else zero++;
        }
        long pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        long pattern_a = 0;
        for (int time = 0; time <= one; time++) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static long combi(int N, int K) {
        if (K > N) return 0;
        if (K == 0 || K == N) return 1;
        K = Math.min(K, N - K);
        long result = 1;
        for (int i = 1; i <= K; i++) {
            result = result * (N - K + i) / i;
        }
        return result;
    }
}

