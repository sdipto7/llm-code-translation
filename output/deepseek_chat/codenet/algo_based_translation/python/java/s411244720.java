
import java.util.*;

public class s411244720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Set<Integer> S = new HashSet<>();
        
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            List<Integer> A = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                A.add(scanner.nextInt());
            }
            S.addAll(A);
        }
        
        System.out.println(N - S.size());
    }
}

