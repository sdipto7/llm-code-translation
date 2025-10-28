
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s267613210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        List<Integer> dist = new ArrayList<>();
        for (int i = 0; i < A.size() - 1; i++) {
            dist.add(A.get(i + 1) - A.get(i));
        }
        dist.add(K + A.get(0) - A.get(A.size() - 1));
        int maxv = Integer.MIN_VALUE;
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

