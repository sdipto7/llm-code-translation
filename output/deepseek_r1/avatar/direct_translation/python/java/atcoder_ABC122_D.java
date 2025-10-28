
import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC122_D {
    static int n;
    static int mod = (int) 1e9 + 7;
    static HashMap<String, Integer>[] memo;

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] arr = last4.toCharArray();
            if (i >= 1) {
                char temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            String s = new String(arr);
            if (s.contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    public static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        char[] chars = {'A', 'C', 'G', 'T'};
        for (char c : chars) {
            String new4 = last3 + c;
            if (ok(new4)) {
                String newLast3 = new4.substring(1);
                ret = (ret + dfs(cur + 1, newLast3)) % mod;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = (HashMap<String, Integer>[]) new HashMap<?, ?>[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
    }
}

