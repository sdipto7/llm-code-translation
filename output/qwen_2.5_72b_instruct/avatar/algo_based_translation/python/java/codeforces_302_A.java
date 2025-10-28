
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String inputString = scanner.next();
        int sa = 0;
        for (char c : inputString.toCharArray()) {
            if (c == '-') {
                sa++;
            }
        }
        sa = Math.min(n - sa, sa);
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 != 0 && b <= (sa << 1)) {
                ss.add("1\n");
            } else {
                ss.add("0\n");
            }
        }
        System.out.print(String.join("", ss));
    }
}

