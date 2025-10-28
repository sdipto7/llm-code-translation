import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int M = stdin.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdin.nextInt();
        }
        stdin.close();

        long[] cumRemainders = new long[N + 1];
        cumRemainders[0] = 0;
        for (int i = 0; i < N; i++) {
            cumRemainders[i + 1] = (cumRemainders[i] + A[i]) % M;
            if (cumRemainders[i + 1] < 0) {
                cumRemainders[i + 1] += M;
            }
        }

        Map<Long, Integer> remainderCounts = new HashMap<>();
        for (long remainder : cumRemainders) {
            remainderCounts.put(remainder, remainderCounts.getOrDefault(remainder, 0) + 1);
        }

        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }
}
