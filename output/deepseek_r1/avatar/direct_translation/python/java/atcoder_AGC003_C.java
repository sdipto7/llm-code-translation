
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            A[i] = num * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int remainder = A[i] % N;
            int d = remainder % 2;
            if (d != (i % 2)) {
                cnt++;
            }
        }
        System.out.println(cnt / 2);
    }
}

