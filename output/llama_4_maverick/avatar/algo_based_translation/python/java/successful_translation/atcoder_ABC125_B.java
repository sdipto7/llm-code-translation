
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] - C[i] > 0) {
                sum += V[i] - C[i];
            }
        }
        System.out.println(sum);
    }
}

