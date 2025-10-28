
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if (s.chars().distinct().count() == 1) {
            System.out.println(0);
            return;
        }

        Map<Character, Integer> a = new HashMap<>();
        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;
        for (int count : a.values()) {
            if (count < ans) {
                ans = count;
            }
        }
        ans *= 2;

        System.out.println(ans);
    }
}

