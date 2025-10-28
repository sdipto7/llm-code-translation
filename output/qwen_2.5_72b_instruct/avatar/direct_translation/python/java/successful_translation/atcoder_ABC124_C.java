import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();

        for (int i = 0; i < s.length; i += 2) {
            even.put(s[i], even.getOrDefault(s[i], 0) + 1);
        }
        for (int i = 1; i < s.length; i += 2) {
            odd.put(s[i], odd.getOrDefault(s[i], 0) + 1);
        }

        int result = Math.min(s.length - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0)),
                             s.length - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0)));
        System.out.println(result);
    }
}
