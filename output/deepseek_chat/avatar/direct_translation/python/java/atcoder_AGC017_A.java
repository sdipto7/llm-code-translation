
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
        int one = 0;
        int zero = 0;
        for (int a : lis) {
            if (a % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        long patternA = 0;
        long patternB = 0;
        for (int j = 0; j <= zero; j++) {
            patternB += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                patternA += combi(one, time);
            }
            time++;
        }
        System.out.println((long) (patternA * patternB));
    }

    public static long combi(int n, int k) {
        long a = 1;
        for (int i = 0; i < k; i++) {
            a *= (n - i);
        }
        for (int j = 0; j < k; j++) {
            a /= (j + 1);
        }
        return a;
    }
}

