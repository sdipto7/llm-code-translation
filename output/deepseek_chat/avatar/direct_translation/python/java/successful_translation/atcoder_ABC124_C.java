import java.util.*;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.put(s.charAt(i), even.getOrDefault(s.charAt(i), 0) + 1);
            } else {
                odd.put(s.charAt(i), odd.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int option1 = s.length() - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0));
        int option2 = s.length() - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0));
        System.out.println(Math.min(option1, option2));
    }
}
