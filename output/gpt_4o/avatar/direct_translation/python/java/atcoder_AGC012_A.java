
import java.util.*;

public class atcoder_AGC012_A {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        long ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}

