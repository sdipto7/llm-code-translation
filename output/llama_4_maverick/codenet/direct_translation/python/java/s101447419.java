
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Map<Integer, Integer> ve = new HashMap<>();
        Map<Integer, Integer> vo = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            ve.put(v[2 * i], ve.getOrDefault(v[2 * i], 0) + 1);
            vo.put(v[2 * i + 1], vo.getOrDefault(v[2 * i + 1], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> ce = new ArrayList<>(ve.entrySet());
        List<Map.Entry<Integer, Integer>> co = new ArrayList<>(vo.entrySet());
        Collections.sort(ce, (a, b) -> b.getValue().compareTo(a.getValue()));
        Collections.sort(co, (a, b) -> b.getValue().compareTo(a.getValue()));
        int ans = n;
        if (ce.get(0).getKey() != co.get(0).getKey()) {
            ans = n - ce.get(0).getValue() - co.get(0).getValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ce.get(0).getValue();
        } else if (ce.size() == 1) {
            ans = n - ce.get(0).getValue() - (co.size() > 1 ? co.get(1).getValue() : 0);
        } else if (co.size() == 1) {
            ans = n - (ce.size() > 1 ? ce.get(1).getValue() : 0) - co.get(0).getValue();
        } else {
            ans = Math.min(n - ce.get(0).getValue() - (co.size() > 1 ? co.get(1).getValue() : 0), n - (ce.size() > 1 ? ce.get(1).getValue() : 0) - co.get(0).getValue());
        }
        System.out.println(ans);
    }
}

