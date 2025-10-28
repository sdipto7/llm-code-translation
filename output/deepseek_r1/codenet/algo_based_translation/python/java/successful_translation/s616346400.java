
import java.util.Scanner;

public class s616346400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.next();
        System.out.println(atc079a(inputValue));
    }

    public static String atc079a(String inputValue) {
        int n = 3;
        for (int i = 0; i <= inputValue.length() - n; i++) {
            boolean allMatch = true;
            for (int j = 1; j < n; j++) {
                if (inputValue.charAt(i) != inputValue.charAt(i + j)) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                return "Yes";
            }
        }
        return "No";
    }
}

