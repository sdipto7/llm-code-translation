
import java.util.Scanner;

public class s267613210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int K = Integer.parseInt(line1[0]);
        int N = Integer.parseInt(line1[1]);

        String[] line2 = scanner.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(line2[i]);
        }

        int[] dist = new int[N];
        for (int i = 0; i < N - 1; i++) {
            dist[i] = A[i + 1] - A[i];
        }
        dist[N - 1] = K + A[0] - A[N - 1];

        int maxv = dist[0];
        int sum = dist[0];
        for (int i = 1; i < N; i++) {
            if (dist[i] > maxv) {
                maxv = dist[i];
            }
            sum += dist[i];
        }

        System.out.println(sum - maxv);
        scanner.close();
    }
}

