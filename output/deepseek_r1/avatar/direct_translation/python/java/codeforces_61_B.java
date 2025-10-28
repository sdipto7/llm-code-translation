
import java.util.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = f(scanner.nextLine());
        }
        Set<String> perms = new HashSet<>();
        perms.add(s[0] + s[1] + s[2]);
        perms.add(s[0] + s[2] + s[1]);
        perms.add(s[1] + s[0] + s[2]);
        perms.add(s[1] + s[2] + s[0]);
        perms.add(s[2] + s[0] + s[1]);
        perms.add(s[2] + s[1] + s[0]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String test = f(scanner.nextLine());
            System.out.println(perms.contains(test) ? "ACC" : "WA");
        }
    }

    private static String f(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}

