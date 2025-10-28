
import java.util.Scanner;

public class s486032847 {
    public static int keta(String s) {
        if (s.length() < 2) {
            return Integer.parseInt(s);
        }
        int n = 0;
        for (char c : s.toCharArray()) {
            n += c - '0';
        }
        return keta(String.valueOf(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        scanner.close();

        if (keta(N) % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

