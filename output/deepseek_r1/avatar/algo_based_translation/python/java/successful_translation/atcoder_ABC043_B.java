
import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().strip();
        String result = processInputString(s);
        System.out.println(result);
    }

    private static String processInputString(String s) {
        StringBuilder myStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() > 0) {
                myStr.deleteCharAt(myStr.length() - 1);
            }
        }
        return myStr.toString();
    }
}

