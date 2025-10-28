
import java.util.*;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Set<Character> vo = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'));
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (c == ' ' || c == '?') {
                continue;
            }
            System.out.println(vo.contains(c) ? "YES" : "NO");
            break;
        }
    }
}

