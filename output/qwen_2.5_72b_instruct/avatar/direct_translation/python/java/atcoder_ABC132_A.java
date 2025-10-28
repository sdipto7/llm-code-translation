import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (char i : S.toCharArray()) {
            c.put(i, c.getOrDefault(i, 0) + 1);
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
