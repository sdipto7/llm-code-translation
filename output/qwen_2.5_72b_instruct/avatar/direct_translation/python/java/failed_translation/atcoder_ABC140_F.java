
import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] S = new Integer[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[S.length];
        Arrays.fill(flag, true);
        List<Integer> cur = new ArrayList<>();
        cur.add(S[0]);
        flag[0] = false;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < S.length; k++) {
                if (flag[k] && S[k] < cur.get(j)) {
                    cur.add(S[k]);
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            cur.sort(Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}

