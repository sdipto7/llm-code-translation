
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
        
        Collections.sort(info, (a, b) -> Integer.compare(b[1], a[1]));
        
        List<int[]> selected = info.subList(0, k);
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        Map<Integer, Boolean> memo = new HashMap<>();
        
        for (int[] item : selected) {
            int t = item[0];
            int d = item[1];
            if (!memo.containsKey(t)) {
                memo.put(t, true);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }
        
        List<Integer> unselectedOnly = new ArrayList<>();
        for (int i = k; i < info.size(); i++) {
            int[] item = info.get(i);
            int t = item[0];
            int d = item[1];
            if (!memo.containsKey(t)) {
                memo.put(t, true);
                unselectedOnly.add(d);
            }
        }
        
        int cntType = memo.size();
        long sumSelect = 0L;
        for (int d : selectedOnly) sumSelect += d;
        for (int d : selectedChohuku) sumSelect += d;
        long ans = (long) cntType * cntType + sumSelect;
        
        Collections.reverse(unselectedOnly);
        
        int loopLimit = Math.min(selectedChohuku.size(), unselectedOnly.size());
        for (int i = 0; i < loopLimit; i++) {
            cntType++;
            sumSelect += unselectedOnly.remove(unselectedOnly.size() - 1);
            sumSelect -= selectedChohuku.remove(selectedChohuku.size() - 1);
            ans = Math.max(ans, (long) cntType * cntType + sumSelect);
        }
        
        System.out.println(ans);
    }
}

