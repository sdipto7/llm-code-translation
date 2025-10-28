import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class s232279435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> x = new HashSet<>();
            for (char c : s.substring(0, i + 1).toCharArray()) {
                x.add(c);
            }
            Set<Character> y = new HashSet<>();
            for (char c : s.substring(i + 1).toCharArray()) {
                y.add(c);
            }
            int z = 0;
            for (char w : x) {
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
