
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        List<Integer> lis = new ArrayList<>();
        while (scanner.hasNextInt()) {
            lis.add(scanner.nextInt());
        }
        scanner.close();

        int ans = 0;
        List<Integer> ls = new ArrayList<>();
        for (int a : lis) {
            ls.add(a % 2);
        }
        int one = 0;
        int zero = 0;
        for (int num : ls) {
            if (num == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println((int) (pattern_a * pattern_b));
    }

    public static float combi(int N, int K) {
        float a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}

