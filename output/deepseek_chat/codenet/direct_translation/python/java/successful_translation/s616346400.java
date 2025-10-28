
import java.util.Scanner;

public class s616346400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(atc079a(inputStr));
    }

    public static String atc079a(String inputStr) {
        int n = 3;
        for (int i = 0; i <= inputStr.length() - n; i++) {
            boolean match = true;
            for (int j = 1; j < n; j++) {
                if (inputStr.charAt(i) != inputStr.charAt(i + j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return "Yes";
            }
        }
        return "No";
    }
}

