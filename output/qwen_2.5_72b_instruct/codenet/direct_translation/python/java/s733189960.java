import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s733189960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> sdic = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine().strip();
            char[] chars = s.toCharArray();
            java.util.Arrays.sort(chars);
            s = new String(chars);
            sdic.put(s, sdic.getOrDefault(s, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<String, Integer> entry : sdic.entrySet()) {
            int v = entry.getValue();
            ans += v * (v - 1) / 2;
        }
        System.out.println(ans);
    }
}
