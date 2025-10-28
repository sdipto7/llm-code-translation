
import java.util.Scanner;

public class s922746568 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        scanner.close();

        int result = calculateCombinations(n, s);
        System.out.println(result);
    }

    public static int calculateCombinations(int n, String s) {
        int r_cnt = 0;
        int g_cnt = 0;
        int b_cnt = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') r_cnt++;
            else if (c == 'G') g_cnt++;
            else if (c == 'B') b_cnt++;
        }

        int ans = r_cnt * g_cnt * b_cnt;

        for (int i = 0; i < n; i++) {
            for (int d = 0; d < n; d++) {
                int j = i + d;
                int k = j + d;
                if (k >= n) break;
                
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)) {
                    ans--;
                }
            }
        }

        return ans;
    }
}

