
import java.util.*;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if ((new HashSet<>(Arrays.asList(s.split("")))).size() == 1) {
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

