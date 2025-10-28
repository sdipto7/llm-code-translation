
import java.util.*;
import java.util.stream.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        while (scanner.hasNextInt()) {
            A.add(scanner.nextInt());
        }
        
        long[] S = new long[A.size()];
        S[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            S[i] = S[i - 1] + A.get(i);
        }
        
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= S.length; k++) {
            long sum = 0;
            for (int j = N - 2 * k - 1; j >= 0; j -= k) {
                sum += S[j];
            }
            long E = k * X + 2 * sum;
            if (E < ans) {
                ans = E;
            }
        }
        
        long result = ans + N * X + 5 * S[S.length - 1];
        System.out.println(result);
    }
}

