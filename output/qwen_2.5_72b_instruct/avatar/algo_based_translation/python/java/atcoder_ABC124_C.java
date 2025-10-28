import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static int calculateMinOperations(char[] s) {
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                even.put(s[i], even.getOrDefault(s[i], 0) + 1);
            } else {
                odd.put(s[i], odd.getOrDefault(s[i], 0) + 1);
            }
        }

        int minOperations1 = s.length - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0));
        int minOperations2 = s.length - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0));

        return Math.min(minOperations1, minOperations2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        int result = calculateMinOperations(s);
        System.out.println(result);
    }
}
