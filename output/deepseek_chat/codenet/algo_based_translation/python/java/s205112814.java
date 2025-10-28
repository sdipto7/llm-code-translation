
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> gate_cond = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> pair = new ArrayList<>();
            pair.add(scanner.nextInt());
            pair.add(scanner.nextInt());
            gate_cond.add(pair);
        }
        List<Integer> firstElements = new ArrayList<>();
        for (List<Integer> list : gate_cond) {
            firstElements.add(list.get(0));
        }
        int max_under_th = Collections.max(firstElements);
        List<Integer> secondElements = new ArrayList<>();
        for (List<Integer> list : gate_cond) {
            secondElements.add(list.get(1));
        }
        int min_upper_th = Collections.min(secondElements);
        int result;
        if (min_upper_th >= max_under_th) {
            result = (min_upper_th - max_under_th) + 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}

