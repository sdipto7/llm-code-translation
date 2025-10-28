
import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        long[] A = new long[N];
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(input[i]);
        }
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (int i = 0; i < N; i++) {
                if ((A[i] >> b & 1) == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1L << b)) % 1000000007;
        }
        System.out.println(result);
    }
}

