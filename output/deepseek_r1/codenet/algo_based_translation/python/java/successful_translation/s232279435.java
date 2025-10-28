
import java.util.*;

public class s232279435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            String firstPart = s.substring(0, i + 1);
            String secondPart = s.substring(i + 1);
            
            Set<Character> x = new HashSet<>();
            for (char c : firstPart.toCharArray()) {
                x.add(c);
            }
            
            Set<Character> y = new HashSet<>();
            for (char c : secondPart.toCharArray()) {
                y.add(c);
            }
            
            int z = 0;
            for (Character w : x) {
                if (y.contains(w)) {
                    z++;
                }
            }
            
            if (z > ans) {
                ans = z;
            }
        }
        
        System.out.println(ans);
    }
}

