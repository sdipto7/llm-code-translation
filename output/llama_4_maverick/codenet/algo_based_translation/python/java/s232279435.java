
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class s232279435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String s = scanner.nextLine();
        System.out.println(maxCommonChars(n, s));
    }

    public static int maxCommonChars(int n, String s) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> x = new HashSet<>();
            Set<Character> y = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                x.add(s.charAt(j));
            }
            for (int j = i + 1; j < n; j++) {
                y.add(s.charAt(j));
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
        return ans;
    }
}

