import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
        Collections.sort(m, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(0).compareTo(o1.get(0));
            }
        });
        List<Integer> a = m.get(0);
        for (int i = 1; i < m.size(); i++) {
            List<Integer> row = m.get(i);
            if (row.get(1) > a.get(1)) {
                System.out.println("Happy Alex");
                return;
            }
            a = row;
        }
        System.out.println("Poor Alex");
    }
}
