
import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String inputStr = scanner.nextLine();
        int sa = Math.min(inputStr.length() - inputStr.replace("-", "").length(), n - (inputStr.length() - inputStr.replace("-", "").length()));
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            int diff = (b - a) % 2;
            ss.append((diff == 1 && (b - a) <= 2 * sa) ? "1\n" : "0\n");
        }
        System.out.print(ss.toString());
    }
}

