import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(sc.next());
        }
        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            c.put(s, c.getOrDefault(s, 0) + 1);
        }
        List<Map.Entry<String, Integer>> p = new ArrayList<>(c.entrySet());
        p.sort((a, b) -> b.getValue().equals(a.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
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
        for (String i : ans) {
            System.out.println(i);
        }
    }
}
