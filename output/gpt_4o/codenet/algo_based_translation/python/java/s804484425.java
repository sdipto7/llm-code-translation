
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
        
        // Sort info in descending order based on deliciousness (second element)
        info.sort((a, b) -> Integer.compare(b[1], a[1]));
        
        List<int[]> selected = info.subList(0, k);
        List<Integer> selected_only = new ArrayList<>();
        List<Integer> selected_chohuku = new ArrayList<>();
        List<Integer> unselected_only = new ArrayList<>();
        Map<Integer, Integer> memo = new HashMap<>();
        
        for (int[] pair : selected) {
            int t = pair[0];
            int d = pair[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selected_only.add(d);
            } else {
                selected_chohuku.add(d);
            }
        }
        
        int cnt_type = memo.size();
        
        for (int i = k; i < n; i++) {
            int t = info.get(i)[0];
            int d = info.get(i)[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselected_only.add(d);
            }
        }
        
        int sum_select = 0;
        for (int val : selected_only) sum_select += val;
        for (int val : selected_chohuku) sum_select += val;
        
        int ans = cnt_type * cnt_type + sum_select;
        
        Collections.reverse(unselected_only);
        
        int minLength = Math.min(selected_chohuku.size(), unselected_only.size());
        for (int i = 0; i < minLength; i++) {
            cnt_type++;
            sum_select += unselected_only.get(unselected_only.size() - 1);
            sum_select -= selected_chohuku.get(selected_chohuku.size() - 1);
            unselected_only.remove(unselected_only.size() - 1);
            selected_chohuku.remove(selected_chohuku.size() - 1);
            int tmp = cnt_type * cnt_type + sum_select;
            ans = Math.max(ans, tmp);
        }
        
        System.out.println(ans);
    }
}

