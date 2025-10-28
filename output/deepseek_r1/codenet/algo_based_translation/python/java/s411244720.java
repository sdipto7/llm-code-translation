
import java.util.*;

public class s411244720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);
        Set<Integer> S = new HashSet<>();
        
        for (int i = 0; i < K; i++) {
            Integer.parseInt(scanner.nextLine().trim());
            String[] numbers = scanner.nextLine().split(" ");
            for (String num : numbers) {
                S.add(Integer.parseInt(num));
            }
        }
        
        System.out.println(N - S.size());
    }
}

