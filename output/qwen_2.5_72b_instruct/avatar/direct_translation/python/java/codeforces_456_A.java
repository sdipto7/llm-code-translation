import java.util.*;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(scanner.nextInt());
            row.add(scanner.nextInt());
            m.add(row);
        }
        m.sort((o1, o2) -> o2.get(0) - o1.get(0));
        List<Integer> a = m.get(0);
        for (int i = 1; i < m.size(); i++) {
            List<Integer> current = m.get(i);
            if (current.get(1) > a.get(1)) {
                System.out.println("Happy Alex");
                return;
            }
            a = current;
        }
        System.out.println("Poor Alex");
    }
}
