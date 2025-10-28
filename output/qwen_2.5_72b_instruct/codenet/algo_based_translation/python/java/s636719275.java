
import java.util.Scanner;

public class s636719275 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int ans = 1000000;
        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i);
            if (a.length() >= t.length()) {
                ans = Math.min(ans, check(t, a.substring(0, t.length())));
            }
        }
        System.out.println(ans);
    }

    public static int check(String a, String b) {
        int s = 0;
        for (int j = 0; j < a.length(); j++) {
            if (a.charAt(j) != b.charAt(j)) {
                s++;
            }
        }
        return s;
    }
}

