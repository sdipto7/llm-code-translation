
import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                temp.add(sc.nextInt());
            }
            li.add(temp);
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(sc.nextInt());
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
            for (Set<Integer> s : combinations(q, i)) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    Set<Integer> temp = new HashSet<>(s);
                    temp.retainAll(li.get(j));
                    if (temp.size() % 2 != p.get(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    private static List<Set<Integer>> combinations(Set<Integer> set, int k) {
        List<Set<Integer>> result = new ArrayList<>();
        combinations(new ArrayList<>(set), k, 0, new HashSet<>(), result);
        return result;
    }

    private static void combinations(List<Integer> list, int k, int start, Set<Integer> current, List<Set<Integer>> result) {
        if (current.size() == k) {
            result.add(new HashSet<>(current));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            current.add(list.get(i));
            combinations(list, k, i + 1, current, result);
            current.remove(list.get(i));
        }
    }
}

