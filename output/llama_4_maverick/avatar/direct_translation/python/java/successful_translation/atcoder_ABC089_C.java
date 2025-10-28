
import java.util.*;

public class atcoder_ABC089_C {
    static final int mod = (int)1e9 + 7;
    static final long INF = (long)1e18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];
        for (String s : S) {
            String firstChar = s.substring(0, 1).toUpperCase();
            for (int i = 0; i < 5; i++) {
                if (firstChar.equals(march[i])) {
                    marchLis[i]++;
                    break;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long)marchLis[i] * marchLis[j] * marchLis[k];
                }
            }
        }
        System.out.println(ans);
    }
}

