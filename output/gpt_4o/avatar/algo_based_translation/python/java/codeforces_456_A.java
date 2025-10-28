
import java.util.*;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<int[]> m = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] pair = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
            m.add(pair);
        }

        m.sort((a, b) -> Integer.compare(b[0], a[0]));

        int[] a = m.get(0);

        for (int j = 1; j < m.size(); j++) {
            int[] i = m.get(j);
            if (i[1] > a[1]) {
                System.out.println("Happy Alex");
                return;
            }
            a = i;
        }

        System.out.println("Poor Alex");
    }
}

