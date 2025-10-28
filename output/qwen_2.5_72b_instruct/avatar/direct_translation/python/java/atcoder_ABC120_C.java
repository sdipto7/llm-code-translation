import java.util.*;
import java.io.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (new HashSet<>(Arrays.asList(s.split(""))).size() == 1) {
            System.out.println(0);
            System.exit(0);
        }
        Map<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        int ans = Collections.min(a.values()) * 2;
        System.out.println(ans);
    }
}
