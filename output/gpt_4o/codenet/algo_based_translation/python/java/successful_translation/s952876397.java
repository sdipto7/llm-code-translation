
import java.util.Scanner;

public class s952876397 {

    public static String balanceParentheses(int n, String s) {
        int left = 0;
        for (char i : s.toCharArray()) {
            if (i == ')') {
                left++;
            } else {
                break;
            }
        }

        int left1 = 0;
        int right1 = 0;

        for (int i = left; i < n; i++) {
            if (s.charAt(i) == '(') {
                right1++;
            } else if (right1 > 0) {
                right1--;
            } else {
                left1++;
            }
        }

        left1 += left;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < right1; i++) {
            sb.append(')');
        }
        for (int i = 0; i < left1; i++) {
            sb.insert(0, '(');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        String s = scanner.nextLine();

        String result = balanceParentheses(n, s);
        System.out.println(result);
    }
}

