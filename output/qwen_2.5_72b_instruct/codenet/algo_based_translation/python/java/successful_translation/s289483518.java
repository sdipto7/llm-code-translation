
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class s289483518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);
        List<List<Integer>> ope = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> operation = new ArrayList<>();
            operation.add(scanner.nextInt());
            operation.add(scanner.nextInt());
            ope.add(operation);
        }
        ope.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) < ope.get(j).get(1)) {
                a.set(i, ope.get(j).get(1));
                ope.get(j).set(0, ope.get(j).get(0) - 1);
                if (ope.get(j).get(0) == 0) {
                    j++;
                    if (j == ope.size()) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println(sum);
        scanner.close();
    }
}

