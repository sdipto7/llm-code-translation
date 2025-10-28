
import java.util.*;

public class atcoder_AGC017_A {
    public static double combi(int N, int K) {
        double a = 1.0;
        for (int i = 0; i < K; i++) {
            a *= (N - i);
        }
        for (int j = 0; j < K; j++) {
            a /= (j + 1);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int ans = 0;
        scanner.nextLine();
        String[] inputList = scanner.nextLine().split(" ");
        List<Integer> lis = new ArrayList<>();
        for (String num : inputList) {
            lis.add(Integer.parseInt(num));
        }
        List<Integer> ls = new ArrayList<>();
        for (int a : lis) {
            ls.add(a % 2);
        }
        int one = Collections.frequency(ls, 1);
        int zero = Collections.frequency(ls, 0);
        double pattern_a = 0.0;
        double pattern_b = 0.0;
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
        System.out.println((int)(pattern_a * pattern_b));
    }
}

