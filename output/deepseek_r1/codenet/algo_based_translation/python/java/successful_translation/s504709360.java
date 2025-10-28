
import java.util.Scanner;

public class s504709360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (s.indexOf(c) == -1) {
                    System.out.println(s + c);
                    System.exit(0);
                }
            }
        } else {
            for (int i = 25; i >= 1; i--) {
                if (s.charAt(i - 1) < s.charAt(i)) {
                    String s1 = s.substring(0, i - 1);
                    for (int j = 0; j < 26; j++) {
                        char candidate = (char) ('a' + j);
                        if (candidate > s.charAt(i - 1) && s1.indexOf(candidate) == -1) {
                            System.out.println(s1 + candidate);
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println(-1);
        }
    }
}

