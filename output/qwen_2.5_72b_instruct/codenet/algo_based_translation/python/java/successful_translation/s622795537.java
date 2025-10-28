
import java.util.*;

public class s622795537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> arr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (!arr.containsKey(s)) {
                arr.put(s, 1);
            } else {
                arr.put(s, arr.get(s) + 1);
            }
        }

        int max_count = Collections.max(arr.values());
        List<String> dic = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == max_count) {
                dic.add(entry.getKey());
            }
        }

        Collections.sort(dic);
        for (String i : dic) {
            System.out.println(i);
        }
    }
}

