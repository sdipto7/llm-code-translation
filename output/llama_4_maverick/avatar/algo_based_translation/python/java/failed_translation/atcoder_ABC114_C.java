
import java.util.*;

public class atcoder_ABC114_C {
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
    }

    public static int aaa(String n) {
        if (Long.parseLong(n) > N) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        int ans = set.equals(new HashSet<>(Arrays.asList('7', '5', '3'))) ? 1 : 0;
        for (char i : new char[] {'7', '5', '3'}) {
            ans += aaa(n + i);
        }
        return ans;
    }
}

