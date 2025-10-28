
import java.util.*;

public class atcoder_ABC122_D {
    static int n;
    static final int mod = (int)1e9 + 7;
    static Map<String, Integer>[] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(dfs(0, "TTT"));
    }

    static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] arr = last4.toCharArray();
            if (i >= 1) {
                char temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            if (new String(arr).contains("AGC")) {
                return false;
            }
        }
        return true;
    }

    static int dfs(int cur, String last3) {
        if (memo[cur].containsKey(last3)) {
            return memo[cur].get(last3);
        }
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        String chars = "ACGT";
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            String s = last3 + c;
            if (ok(s)) {
                String newLast3 = s.substring(1);
                ret = (ret + dfs(cur + 1, newLast3)) % mod;
            }
        }
        memo[cur].put(last3, ret);
        return ret;
    }
}

