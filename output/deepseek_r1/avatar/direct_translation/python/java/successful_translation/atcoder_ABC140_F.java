
import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        ArrayList<Integer> S = new ArrayList<>();
        for (String part : parts) {
            S.add(Integer.parseInt(part));
        }
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[S.size()];
        Arrays.fill(flag, true);
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag[0] = false;
        boolean possible = true;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < S.size(); k++) {
                if (flag[k] && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    flag[k] = false;
                    if (++j == jM) break;
                }
            }
            if (j < jM) {
                possible = false;
                break;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println(possible ? "Yes" : "No");
    }
}

