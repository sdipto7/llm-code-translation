
import java.util.*;

public class s668439281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextLine());
        }

        Map<String, Integer> c = new HashMap<>();
        for (String s : ls) {
            c.put(s, c.getOrDefault(s, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(c.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int count = entries.get(0).getValue();
        List<String> ans = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : entries) {
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

        scanner.close();
    }
}

