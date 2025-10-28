
import java.util.Scanner;
import java.util.ArrayList;

public class s267613210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            dist.add(A[i + 1] - A[i]);
        }
        dist.add(K + A[0] - A[N - 1]);
        int maxv = dist.get(0);
        for (int d : dist) {
            if (d > maxv) {
                maxv = d;
            }
        }
        int sum = 0;
        for (int d : dist) {
            sum += d;
        }
        System.out.println(sum - maxv);
    }
}

