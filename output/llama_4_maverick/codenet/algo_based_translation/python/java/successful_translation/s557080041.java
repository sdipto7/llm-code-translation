
import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        System.out.println(checkDivisibleBy9(N));
    }

    public static String checkDivisibleBy9(String N) {
        if (N.equals("0")) {
            return "Yes";
        }
        int sum = 0;
        for (char c : N.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return (sum % 9 == 0) ? "Yes" : "No";
    }
}

