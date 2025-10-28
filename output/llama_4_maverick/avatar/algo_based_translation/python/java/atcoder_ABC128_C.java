
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
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
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
        long ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            List<List<Integer>> combinations = getCombinations(new ArrayList<>(q), i);
            for (List<Integer> s : combinations) {
                boolean flag = true;
                for (int j = 0; j < li.size(); j++) {
                    int count = 0;
                    for (int num : li.get(j)) {
                        if (s.contains(num)) {
                            count++;
                        }
                    }
                    if (count % 2 != p[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += (1L << v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> getCombinations(List<Integer> list, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            List<Integer> rest = list.subList(i + 1, list.size());
            for (List<Integer> p : getCombinations(rest, n - 1)) {
                p.add(0, list.get(i));
                result.add(p);
            }
        }
        return result;
    }
}

