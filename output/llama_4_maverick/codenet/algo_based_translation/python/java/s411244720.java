
import java.util.*;

public class s411244720 {
    public static int calculateUnseenElements(int N, int K, Scanner scanner) {
        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            Set<Integer> A = new HashSet<>();
            for (int j = 0; j < d; j++) {
                A.add(scanner.nextInt());
            }
            S.addAll(A);
        }
        return N - S.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        System.out.println(calculateUnseenElements(N, K, scanner));
        scanner.close();
    }
}

