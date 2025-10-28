
import java.util.Scanner;

public class s922746568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String s = scanner.nextLine();

        int r_cnt = countChar(s, 'R');
        int g_cnt = countChar(s, 'G');
        int b_cnt = countChar(s, 'B');

        long ans = (long) r_cnt * g_cnt * b_cnt;

        for (int i = 0; i < n; i++) {
            for (int d = 1; d < n; d++) {
                int j = i + d;
                int k = j + d;
                if (k >= n) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k) && s.charAt(k) != s.charAt(i)) {
                    ans -= 1;
                }
            }
        }
        System.out.println(ans);
    }

    private static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}

