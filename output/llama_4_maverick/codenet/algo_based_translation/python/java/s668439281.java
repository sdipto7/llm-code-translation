
import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextLine());
        }
        Map<String, Integer> c = new HashMap<>();
        for (String str : ls) {
            c.put(str, c.getOrDefault(str, 0) + 1);
        }
        int count = Collections.max(c.values());
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : c.entrySet()) {
            if (entry.getValue() == count) {
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        for (String str : ans) {
            System.out.println(str);
        }
    }
}

