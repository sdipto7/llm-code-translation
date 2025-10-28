
import java.util.Scanner;

public class codeforces_32_B {
    public static String processString(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i++;
                if (i < s.length() && s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = processString(s);
        System.out.println(result);
        scanner.close();
    }
}

