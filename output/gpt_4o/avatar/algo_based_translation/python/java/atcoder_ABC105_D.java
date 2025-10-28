
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and M
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Read array A
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        // Compute cumulative remainders
        long[] cum_remainders = new long[N + 1];
        cum_remainders[0] = 0;
        for (int i = 1; i <= N; i++) {
            cum_remainders[i] = (cum_remainders[i - 1] + A[i - 1]) % M;
        }

        // Count occurrences of each remainder
        Map<Long, Integer> remainderCounts = new HashMap<>();
        for (long remainder : cum_remainders) {
            remainderCounts.put(remainder, remainderCounts.getOrDefault(remainder, 0) + 1);
        }

        // Calculate combinations
        long combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += (long) count * (count - 1) / 2;
        }

        // Output result
        System.out.println(combinations);

        scanner.close();
    }
}

