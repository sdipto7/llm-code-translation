
import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextLine());
        }
        
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : ls) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freqMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int cmp = e2.getValue().compareTo(e1.getValue());
                return cmp != 0 ? cmp : e1.getKey().compareTo(e2.getKey());
            }
        });
        
        int maxCount = entries.isEmpty() ? 0 : entries.get(0).getValue();
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == maxCount) {
                ans.add(entry.getKey());
            } else {
                break;
            }
        }
        
        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}

