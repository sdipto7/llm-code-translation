
import java.util.Scanner;

public class s838619850 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int N = S.length();
        int M = T.length();
        int ans = M;
        for (int i = 0; i <= N - M; i++) {
            String S2 = S.substring(i, i + M);
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (T.charAt(j) != S2.charAt(j)) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
    }
}

