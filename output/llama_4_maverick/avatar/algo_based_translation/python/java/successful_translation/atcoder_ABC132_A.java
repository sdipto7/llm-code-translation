
import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        Set<Character> Sa = new HashSet<>(c.keySet());
        if (Sa.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (char i : Sa) {
            if (c.get(i) != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

