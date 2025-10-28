
import java.util.Scanner;

public class s652791025 {
    public static String determineSuffix(String inputStr) {
        String lastDigit = inputStr.substring(inputStr.length() - 1);
        int n = Integer.parseInt(lastDigit);
        if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
            return "hon";
        } else if (n == 0 || n == 1 || n == 6 || n == 8) {
            return "pon";
        } else {
            return "bon";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(determineSuffix(inputStr));
        scanner.close();
    }
}

