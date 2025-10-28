**Java Code:**


import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int sa = (int) scanner.nextLine().chars().filter(ch -> ch == '-').count();
        sa = Math.min(n - sa, sa);
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            boolean condition = (b % 2 != 0 && b <= sa * 2);
            ss.append(condition ? "1\n" : "0\n");
        }
        System.out.print(ss.toString());
    }
}

