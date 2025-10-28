
import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        List<Integer> S = new ArrayList<>();
        for (String val : inputValues) {
            S.add(Integer.parseInt(val));
        }
        Collections.sort(S, Collections.reverseOrder());
        
        boolean[] flag = new boolean[S.size()];
        Arrays.fill(flag, true);
        List<Integer> cur = new ArrayList<>();
        if (S.isEmpty()) {
            System.out.println("No");
            return;
        }
        cur.add(S.get(0));
        flag[0] = false;
        
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jMax = cur.size();
            for (int k = 0; k < S.size(); k++) {
                if (flag[k] && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    flag[k] = false;
                    j++;
                    if (j == jMax) break;
                }
            }
            if (j < jMax) {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}

