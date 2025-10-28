
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> s = new HashMap<>();
        String[] l = new String[n];
        for (int j = 0; j < n; j++) {
            l[j] = scanner.next();
        }
        String f = "Yes";
        int i = -1;
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (i != -1 && l[i].charAt(l[i].length() - 1) != v.charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
        scanner.close();
    }
}

