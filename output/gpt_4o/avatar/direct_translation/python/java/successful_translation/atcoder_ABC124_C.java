
import java.util.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();

        for (int i = 0; i < s.length; i += 2) {
            even.put(s[i], even.getOrDefault(s[i], 0) + 1);
        }
        for (int i = 1; i < s.length; i += 2) {
            odd.put(s[i], odd.getOrDefault(s[i], 0) + 1);
        }

        int even0 = even.getOrDefault('0', 0);
        int odd1 = odd.getOrDefault('1', 0);
        int even1 = even.getOrDefault('1', 0);
        int odd0 = odd.getOrDefault('0', 0);

        int result = Math.min(s.length - (even0 + odd1), s.length - (even1 + odd0));
        System.out.println(result);
    }
}

