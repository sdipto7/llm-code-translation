
import java.util.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[2 * n - 2 - 2 * i];
        }
        System.out.println(sum);
    }
}

