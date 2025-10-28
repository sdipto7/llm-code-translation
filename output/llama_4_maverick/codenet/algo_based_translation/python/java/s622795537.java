
import java.util.*;

public class s622795537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Map<String, Integer> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            arr.put(s, arr.getOrDefault(s, 0) + 1);
        }

        int maxCount = Collections.max(arr.values());
        List<String> dic = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxCount) {
                dic.add(entry.getKey());
            }
        }

        Collections.sort(dic);
        for (String s : dic) {
            System.out.println(s);
        }
    }
}

