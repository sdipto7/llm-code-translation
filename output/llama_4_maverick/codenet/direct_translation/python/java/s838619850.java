
import java.util.Scanner;

public class s838619850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int N = S.length();
        int M = T.length();
        int ans = M;
        for (int i = 0; i <= N - M; i++) {
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (T.charAt(j) != S.charAt(i + j)) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
    }
}

