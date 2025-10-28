
import java.util.*;
import java.io.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }

        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(scanner.nextInt());
        }

        Set<Integer> qSet = new HashSet<>();
        for (List<Integer> list : li) {
            qSet.addAll(list);
        }
        List<Integer> qList = new ArrayList<>(qSet);

        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(qSet);

        int k = qList.size();
        long validSubsets = 0;
        for (int mask = 0; mask < (1 << k); mask++) {
            boolean valid = true;
            for (int i = 0; i < m; i++) {
                List<Integer> u = li.get(i);
                int w = p.get(i);
                int count = 0;
                for (int elem : u) {
                    if (qSet.contains(elem)) {
                        int index = qList.indexOf(elem);
                        if (index != -1 && (mask & (1 << index)) != 0) {
                            count++;
                        }
                    }
                }
                if (count % 2 != w) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                validSubsets++;
            }
        }

        long ans = validSubsets * (1L << v.size());
        System.out.println(ans);
    }
}

