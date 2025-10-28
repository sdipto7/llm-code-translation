
import java.util.Scanner;

public class s267613210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int[] dist = new int[N];
        for (int i = 0; i < N - 1; i++) {
            dist[i] = A[i + 1] - A[i];
        }
        dist[N - 1] = K + A[0] - A[N - 1];

        int maxv = dist[0];
        for (int i = 1; i < N; i++) {
            if (dist[i] > maxv) {
                maxv = dist[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += dist[i];
        }

        System.out.println(sum - maxv);
    }
}

