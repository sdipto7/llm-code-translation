
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class atcoder_ABC120_C {
    static final int INF = Integer.MAX_VALUE;
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (new HashSet<>(Arrays.asList(s.split(""))).size() == 1) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        int ans = Collections.min(a.values()) * 2;
        System.out.println(ans);
    }
}

