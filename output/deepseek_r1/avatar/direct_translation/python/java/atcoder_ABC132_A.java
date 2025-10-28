
import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : S.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        if (count.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (int val : count.values()) {
            if (val != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

