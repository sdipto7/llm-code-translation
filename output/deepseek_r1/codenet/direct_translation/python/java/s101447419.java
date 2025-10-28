
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
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
        List<Map.Entry<Integer, Integer>> ceEntries = new ArrayList<>(ce.entrySet());
        ceEntries.sort((a, b) -> b.getValue() - a.getValue());

        Map<Integer, Integer> co = new HashMap<>();
        for (int num : vo) {
            co.put(num, co.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> coEntries = new ArrayList<>(co.entrySet());
        coEntries.sort((a, b) -> b.getValue() - a.getValue());

        int ans = n;

        if (!ceEntries.isEmpty() && !coEntries.isEmpty()) {
            int ceTopKey = ceEntries.get(0).getKey();
            int ceTopCount = ceEntries.get(0).getValue();
            int coTopKey = coEntries.get(0).getKey();
            int coTopCount = coEntries.get(0).getValue();

            if (ceTopKey != coTopKey) {
                ans = n - ceTopCount - coTopCount;
            } else {
                if (ceEntries.size() == 1 && coEntries.size() == 1) {
                    ans = n - ceTopCount;
                } else if (ceEntries.size() == 1) {
                    ans = n - ceTopCount - coEntries.get(1).getValue();
                } else if (coEntries.size() == 1) {
                    ans = n - coTopCount - ceEntries.get(1).getValue();
                } else {
                    int option1 = n - ceTopCount - coEntries.get(1).getValue();
                    int option2 = n - coTopCount - ceEntries.get(1).getValue();
                    ans = Math.min(option1, option2);
                }
            }
        }

        System.out.println(ans);
    }
}

