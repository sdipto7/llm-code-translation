
import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(sc.nextLine());
        }
        
        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            c.put(s, c.getOrDefault(s, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> p = new ArrayList<>(c.entrySet());
        p.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int count = p.get(0).getValue();
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : p) {
            if (entry.getValue() == count) {
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

