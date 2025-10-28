import java.util.*;

public class s804484425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            int d = scanner.nextInt();
            info.add(new int[]{t, d});
        }
        info.sort((a, b) -> b[1] - a[1]);
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        List<Integer> unselectedOnly = new ArrayList<>();
        Map<Integer, Integer> memo = new HashMap<>();
        for (int[] entry : info.subList(0, k)) {
            int t = entry[0];
            int d = entry[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }
        int cntType = memo.size();
        for (int[] entry : info.subList(k, n)) {
            int t = entry[0];
            int d = entry[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselectedOnly.add(d);
            }
        }
        int sumSelect = sum(selectedChohuku) + sum(selectedOnly);
        int ans = cntType * cntType + sumSelect;
        Collections.sort(unselectedOnly, Collections.reverseOrder());
        for (int i = 0; i < Math.min(selectedChohuku.size(), unselectedOnly.size()); i++) {
            cntType++;
            sumSelect += unselectedOnly.get(unselectedOnly.size() - 1);
            sumSelect -= selectedChohuku.get(selectedChohuku.size() - 1);
            unselectedOnly.remove(unselectedOnly.size() - 1);
            selectedChohuku.remove(selectedChohuku.size() - 1);
            int tmp = cntType * cntType + sumSelect;
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }

    private static int sum(List<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }
}
