
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v[2 * i]);
            vo.add(v[2 * i + 1]);
        }
        Map<Integer, Integer> ce = new HashMap<>();
        for (int num : ve) {
            ce.put(num, ce.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> co = new HashMap<>();
        for (int num : vo) {
            co.put(num, co.getOrDefault(num, 0) + 1);
        }
        int ans = n;
        if (!ce.isEmpty() && !co.isEmpty()) {
            int ceKey = ce.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
            int coKey = co.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
            if (ceKey != coKey) {
                ans = n - ce.get(ceKey) - co.get(coKey);
            } else if (ce.size() == 1 && co.size() == 1) {
                ans = n - ce.get(ceKey);
            } else if (ce.size() == 1) {
                int secondCoKey = co.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).skip(1).findFirst().get().getKey();
                ans = n - ce.get(ceKey) - co.get(secondCoKey);
            } else if (co.size() == 1) {
                int secondCeKey = ce.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).skip(1).findFirst().get().getKey();
                ans = n - ce.get(secondCeKey) - co.get(coKey);
            } else {
                int firstCeKey = ce.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
                int secondCoKey = co.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).skip(1).findFirst().get().getKey();
                int firstCoKey = co.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
                int secondCeKey = ce.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).skip(1).findFirst().get().getKey();
                ans = Math.min(n - ce.get(firstCeKey) - co.get(secondCoKey), n - ce.get(secondCeKey) - co.get(firstCoKey));
            }
        }
        System.out.println(ans);
    }
}

