
import java.util.*;

public class s733189960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> sdic = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char[] sArray = scanner.nextLine().trim().toCharArray();
            Arrays.sort(sArray);
            String s = new String(sArray);
            sdic.put(s, sdic.getOrDefault(s, 0) + 1);
        }

        int ans = 0;
        for (int v : sdic.values()) {
            ans += v * (v - 1) / 2;
        }

        System.out.println(ans);
        scanner.close();
    }
}

