
import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l1.add(scanner.nextInt());
        }

        Collections.sort(l1);

        int a = l1.get(l1.size() - 1);
        int b = l1.get(0);

        if (a == b) {
            int pairs = n * (n - 1) / 2;
            System.out.println((a - b) + " " + pairs);
        } else {
            int ac = Collections.frequency(l1, a);
            int bc = Collections.frequency(l1, b);
            System.out.println((a - b) + " " + (ac * bc));
        }

        scanner.close();
    }
}

