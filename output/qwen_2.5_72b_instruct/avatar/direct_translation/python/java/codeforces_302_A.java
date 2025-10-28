import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = scanner.next().split("-").length - 1;
        sa = Math.min(n - sa, sa);
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            ss.append(((b % 2 == 1 && b <= sa * 2) ? "1\n" : "0\n"));
        }
        System.out.print(ss.toString());
    }
}
