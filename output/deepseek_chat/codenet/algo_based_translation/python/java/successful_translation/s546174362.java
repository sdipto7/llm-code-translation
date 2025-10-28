
import java.util.*;

public class s546174362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        
        Collections.sort(A);
        
        while (M > 0) {
            int lastIndex = A.size() - 1;
            A.set(lastIndex, A.get(lastIndex) / 2);
            M--;
            int i = -2;
            
            while (M > 0 && i >= -N && A.get(A.size() + i) >= A.get(A.size() - 1)) {
                A.set(A.size() + i, A.get(A.size() + i) / 2);
                M--;
                i--;
            }
            
            Collections.sort(A);
        }
        
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        System.out.println(sum);
    }
}

