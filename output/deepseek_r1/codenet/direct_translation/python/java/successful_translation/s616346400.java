
import java.util.Scanner;

public class s616346400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.next();
        System.out.println(atc079a(inputValue));
        scanner.close();
    }

    private static String atc079a(String inputValue) {
        for (int i = 0; i <= inputValue.length() - 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (inputValue.charAt(i) != inputValue.charAt(i + j)) {
                    break;
                }
                if (j == 2) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}

