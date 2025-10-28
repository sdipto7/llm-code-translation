
import java.util.*;

public class s733189960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        HashMap<String, Integer> sdic = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine().trim();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sdic.put(sorted, sdic.getOrDefault(sorted, 0) + 1);
        }
        
        int ans = 0;
        for (int v : sdic.values()) {
            ans += v * (v - 1) / 2;
        }
        
        System.out.println(ans);
    }
}

