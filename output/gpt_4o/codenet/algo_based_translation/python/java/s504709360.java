
import java.util.Scanner;

public class s504709360 {

    public static String generateLexicographicString(String s) {
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (s.indexOf(c) == -1) {
                    return s + c;
                }
            }
        } else {
            for (int i = 25; i > 0; i--) {
                if (s.charAt(i - 1) < s.charAt(i)) {
                    String s1 = s.substring(0, i - 1);
                    for (int j = 0; j < 26; j++) {
                        char c = (char) ('a' + j);
                        if (c > s.charAt(i - 1) && s1.indexOf(c) == -1) {
                            return s1 + c;
                        }
                    }
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(generateLexicographicString(input));
        scanner.close();
    }
}

