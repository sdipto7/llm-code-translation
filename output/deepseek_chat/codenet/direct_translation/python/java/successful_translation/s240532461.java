
import java.util.*;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        List<Integer> aji = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            aji.add(L + i - 1);
        }
        if (Collections.min(aji) >= 0) {
            aji.remove(Collections.min(aji));
        } else if (Collections.max(aji) <= 0) {
            aji.remove(Collections.max(aji));
        } else {
            aji.remove(Collections.min(aji, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b))));
        }
        int sum = aji.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

