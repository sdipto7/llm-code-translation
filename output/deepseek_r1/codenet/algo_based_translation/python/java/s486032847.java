
import java.util.Scanner;

public class s486032847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int result = keta(N);
        System.out.println(result % 9 == 0 ? "Yes" : "No");
    }

    private static int keta(String s) {
        if (s.length() < 2) {
            return Integer.parseInt(s);
        }
        int n = 0;
        for (char c : s.toCharArray()) {
            n += Character.getNumericValue(c);
        }
        return keta(Integer.toString(n));
    }
}

