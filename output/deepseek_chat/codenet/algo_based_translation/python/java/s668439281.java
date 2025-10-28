import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextLine());
        }
        
        Map<String, Integer> countMap = new HashMap<>();
        for (String item : ls) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                ans.add(entry.getKey());
            }
        }
        
        Collections.sort(ans);
        for (String item : ans) {
            System.out.println(item);
        }
        
        scanner.close();
    }
}
