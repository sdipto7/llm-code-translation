
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC124_C {

    public static int minChangesToAlternateBinaryString(String s) {
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();

        // Initialize counters
        even.put('0', 0);
        even.put('1', 0);
        odd.put('0', 0);
        odd.put('1', 0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                even.put(c, even.get(c) + 1);
            } else {
                odd.put(c, odd.get(c) + 1);
            }
        }

        int changesForPatternOne = s.length() - (even.get('0') + odd.get('1'));
        int changesForPatternTwo = s.length() - (even.get('1') + odd.get('0'));

        return Math.min(changesForPatternOne, changesForPatternTwo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = minChangesToAlternateBinaryString(s);
        System.out.println(result);
    }
}

