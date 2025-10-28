
import java.util.Scanner;

public class s838619850 {

    public static int minimalDifference(String S, String T) {
        int N = S.length();
        int M = T.length();
        int ans = M;

        for (int i = 0; i <= N - M; i++) {
            String S_2 = S.substring(i, i + M);
            int cnt = 0;
            for (int j = 0; j < M; j++) {
                if (T.charAt(j) != S_2.charAt(j)) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        scanner.close();

        int result = minimalDifference(S, T);
        System.out.println(result);
    }
}

