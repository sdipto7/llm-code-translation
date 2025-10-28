
import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        List<Integer> unselectedOnly = new ArrayList<>();
        Map<Integer, Integer> memo = new HashMap<>();
        
        for (int[] item : selected) {
            int t = item[0];
            int d = item[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }
        
        int cntType = memo.size();
        
        for (int i = k; i < info.size(); i++) {
            int[] item = info.get(i);
            int t = item[0];
            int d = item[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselectedOnly.add(d);
            }
        }
        
        int sumSelect = selectedChohuku.stream().mapToInt(Integer::intValue).sum() + 
                       selectedOnly.stream().mapToInt(Integer::intValue).sum();
        int ans = cntType * cntType + sumSelect;
        
        Collections.reverse(unselectedOnly);
        
        int iterations = Math.min(selectedChohuku.size(), unselectedOnly.size());
        for (int i = 0; i < iterations; i++) {
            cntType++;
            int unselectedValue = unselectedOnly.remove(unselectedOnly.size() - 1);
            int selectedValue = selectedChohuku.remove(selectedChohuku.size() - 1);
            sumSelect += unselectedValue - selectedValue;
            int tmp = cntType * cntType + sumSelect;
            if (tmp > ans) {
                ans = tmp;
            }
        }
        
        System.out.println(ans);
    }
}

