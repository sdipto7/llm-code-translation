import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.next());
        }
        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            c.put(s, c.getOrDefault(s, 0) + 1);
        }
        int count = Collections.max(c.values());
        List<String> ans = new ArrayList<>();
        List<Map.Entry<String, Integer>> p = new ArrayList<>(c.entrySet());
        p.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < c.size(); i++) {
            if (p.get(i).getValue() == count) {
                ans.add(p.get(i).getKey());
            } else {
                break;
            }
        }
        Collections.sort(ans);
        for (String i : ans) {
            System.out.println(i);
        }
    }
}
