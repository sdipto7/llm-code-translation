
import java.util.*;

public class s232279435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String first = s.substring(0, i + 1);
            String second = s.substring(i + 1);

            Set<Character> x = new HashSet<>();
            for (char c : first.toCharArray()) {
                x.add(c);
            }

            Set<Character> y = new HashSet<>();
            for (char c : second.toCharArray()) {
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

