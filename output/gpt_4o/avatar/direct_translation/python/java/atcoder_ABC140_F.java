
import java.util.*;

public class atcoder_ABC140_F {
    public static int I() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static List<Integer> LI() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String x : line) {
            list.add(Integer.parseInt(x));
        }
        return list;
    }

    public static String main() {
        int N = I();
        List<Integer> S = LI();
        Collections.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[S.size()];
        Arrays.fill(flag, true);
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag[0] = false;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < S.size(); k++) {
                if (flag[k] && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j != jM) {
                return "No";
            }
            cur.sort(Collections.reverseOrder());
        }
        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}

