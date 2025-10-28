
import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size - 1; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> list : li) {
            q.addAll(list);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            List<Set<Integer>> combinations = getCombinations(q, i);
            for (Set<Integer> s : combinations) {
                boolean valid = true;
                for (int j = 0; j < m; j++) {
                    List<Integer> u = li.get(j);
                    int w = p[j];
                    Set<Integer> intersection = new HashSet<>(s);
                    intersection.retainAll(u);
                    if (intersection.size() % 2 != w) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    private static List<Set<Integer>> getCombinations(Set<Integer> set, int k) {
        List<Set<Integer>> result = new ArrayList<>();
        if (k == 0) {
            result.add(new HashSet<>());
            return result;
        }
        List<Integer> list = new ArrayList<>(set);
        combine(list, k, 0, new HashSet<>(), result);
        return result;
    }

    private static void combine(List<Integer> list, int k, int start, Set<Integer> current, List<Set<Integer>> result) {
        if (current.size() == k) {
            result.add(new HashSet<>(current));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            current.add(list.get(i));
            combine(list, k, i + 1, current, result);
            current.remove(list.get(i));
        }
    }
}

