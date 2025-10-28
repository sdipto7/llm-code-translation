
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int num : A) {
                if (((num >> b) & 1) == 1) {
                    bs++;
                }
            }
            result = (result + (long) bs * (N - bs) * (1L << b)) % 1000000007;
        }
        System.out.println(result);
    }
}

