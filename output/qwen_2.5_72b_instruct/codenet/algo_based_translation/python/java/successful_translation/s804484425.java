import java.util.*;
import java.util.stream.Collectors;

public class s804484425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<List<Integer>> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> pair = Arrays.asList(scanner.nextInt(), scanner.nextInt());
            info.add(pair);
        }
        info.sort(Comparator.comparingInt((List<Integer> pair) -> pair.get(1)).reversed());
        List<List<Integer>> selected = info.subList(0, k);
        List<Integer> selected_only = new ArrayList<>();
        List<Integer> selected_chohuku = new ArrayList<>();
        List<Integer> unselected_only = new ArrayList<>();
        Map<Integer, Integer> memo = new HashMap<>();
        for (List<Integer> pair : selected) {
            int t = pair.get(0);
            int d = pair.get(1);
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selected_only.add(d);
            } else {
                selected_chohuku.add(d);
            }
        }
        int cnt_type = memo.size();
        for (List<Integer> pair : info.subList(k, info.size())) {
            int t = pair.get(0);
            int d = pair.get(1);
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselected_only.add(d);
            }
        }
        int sum_select = selected_chohuku.stream().mapToInt(Integer::intValue).sum() + selected_only.stream().mapToInt(Integer::intValue).sum();
        int ans = cnt_type * cnt_type + sum_select;
        Collections.reverse(unselected_only);
        for (int i = 0; i < Math.min(selected_chohuku.size(), unselected_only.size()); i++) {
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
