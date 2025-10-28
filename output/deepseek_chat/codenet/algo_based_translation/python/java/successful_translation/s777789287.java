
import java.util.*;

public class s777789287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a, Collections.reverseOrder());
        double s = a.stream().mapToInt(Integer::intValue).sum() / (4.0 * m);
        if (a.get(m - 1) >= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

