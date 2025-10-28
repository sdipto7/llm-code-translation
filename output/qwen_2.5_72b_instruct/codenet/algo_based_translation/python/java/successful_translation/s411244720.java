
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class s411244720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int element = scanner.nextInt();
                S.add(element);
            }
        }
        int result = N - S.size();
        System.out.println(result);
        scanner.close();
    }
}

