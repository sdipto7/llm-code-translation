
import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mainFunction(scanner));
    }

    public static int I(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static List<Integer> LI(Scanner scanner) {
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String part : parts) {
            result.add(Integer.parseInt(part));
        }
        return result;
    }

    public static String mainFunction(Scanner scanner) {
        int N = I(scanner);
        List<Integer> S = LI(scanner);
        S.sort(Collections.reverseOrder());
        
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

            if (j < jM) {
                return "No";
            }

            cur.sort(Collections.reverseOrder());
        }
        return "Yes";
    }
}

