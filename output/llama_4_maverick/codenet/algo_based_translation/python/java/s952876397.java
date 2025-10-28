
import java.util.Scanner;

public class s952876397 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(balanceParentheses(scanner));
    }

    public static String balanceParentheses(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String s = scanner.nextLine();

        int left = 0;
        for (char i : s.toCharArray()) {
            if (i == ')') {
                left += 1;
            } else {
                break;
            }
        }

        int left1 = 0;
        int right1 = 0;

        for (int i = left; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                right1 += 1;
            } else if (right1 > 0) {
                right1 -= 1;
            } else {
                left1 += 1;
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
}

