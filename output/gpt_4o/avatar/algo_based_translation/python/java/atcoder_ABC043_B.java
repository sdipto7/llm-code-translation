
import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = processString(s);
        System.out.println(result);
        scanner.close();
    }

    public static String processString(String s) {
        String myStr = "";

        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c == 'B' && !myStr.isEmpty()) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }

        return myStr;
    }
}

