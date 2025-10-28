
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int I() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static List<Integer> LI() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String part : parts) {
            result.add(Integer.parseInt(part));
        }
        return result;
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
            Collections.sort(cur, Collections.reverseOrder());
        }
        return "Yes";
    }
}

