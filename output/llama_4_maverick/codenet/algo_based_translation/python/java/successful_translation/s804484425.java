
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
        info.sort((a, b) -> Integer.compare(b[1], a[1]));
        List<int[]> selected = info.subList(0, k);
        Map<Integer, Integer> memo = new HashMap<>();
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        List<Integer> unselectedOnly = new ArrayList<>();
        for (int[] pair : selected) {
            if (!memo.containsKey(pair[0])) {
                memo.put(pair[0], 1);
                selectedOnly.add(pair[1]);
            } else {
                selectedChohuku.add(pair[1]);
            }
        }
        int cntType = memo.size();
        for (int i = k; i < n; i++) {
            int[] pair = info.get(i);
            if (!memo.containsKey(pair[0])) {
                memo.put(pair[0], 1);
                unselectedOnly.add(pair[1]);
            }
        }
        int sumSelect = selectedOnly.stream().mapToInt(Integer::intValue).sum() + selectedChohuku.stream().mapToInt(Integer::intValue).sum();
        long ans = (long) cntType * cntType + sumSelect;
        Collections.reverse(unselectedOnly);
        for (int i = 0; i < Math.min(selectedChohuku.size(), unselectedOnly.size()); i++) {
            cntType++;
            sumSelect += unselectedOnly.get(i);
            sumSelect -= selectedChohuku.get(selectedChohuku.size() - 1 - i);
            long tmp = (long) cntType * cntType + sumSelect;
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}

