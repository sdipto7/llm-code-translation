
import java.util.*;

public class s804484425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();
            info.add(new int[]{t, d});
        }
        info.sort((a, b) -> Integer.compare(b[1], a[1]));
        List<int[]> selected = info.subList(0, k);
        Map<Integer, Integer> memo = new HashMap<>();
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        for (int[] arr : selected) {
            int t = arr[0];
            int d = arr[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }
        int cntType = memo.size();
        List<Integer> unselectedOnly = new ArrayList<>();
        for (int[] arr : info.subList(k, info.size())) {
            int t = arr[0];
            int d = arr[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselectedOnly.add(d);
            }
        }
        int sumSelect = selectedChohuku.stream().mapToInt(Integer::intValue).sum() + selectedOnly.stream().mapToInt(Integer::intValue).sum();
        long ans = (long) cntType * cntType + sumSelect;
        Collections.sort(unselectedOnly, Collections.reverseOrder());
        for (int i = 0; i < Math.min(selectedChohuku.size(), unselectedOnly.size()); i++) {
            cntType++;
            sumSelect += unselectedOnly.get(unselectedOnly.size() - 1);
            sumSelect -= selectedChohuku.get(selectedChohuku.size() - 1);
            unselectedOnly.remove(unselectedOnly.size() - 1);
            selectedChohuku.remove(selectedChohuku.size() - 1);
            long tmp = (long) cntType * cntType + sumSelect;
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}

