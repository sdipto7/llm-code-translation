
import java.util.*;

public class s934308496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        List<Integer> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m.add(scanner.nextInt());
        }
        Collections.sort(m);
        int total = 0;
        for (int num : m) {
            total += num;
        }
        int remaining = x - total;
        int minValue = m.get(0);
        int additionalItems = remaining / minValue;
        int result = n + additionalItems;
        System.out.println(result);
    }
}

