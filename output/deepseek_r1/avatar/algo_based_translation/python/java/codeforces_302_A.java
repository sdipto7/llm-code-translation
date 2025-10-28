
import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        String str = scanner.nextLine();
        int sa = 0;
        for (char c : str.toCharArray()) {
            if (c == '-') {
                sa++;
            }
        }
        sa = Math.min(n - sa, sa);
        
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt() - a;
            if (b % 2 != 0 && b <= 2 * sa) {
                ss.append("1\n");
            } else {
                ss.append("0\n");
            }
        }
        
        System.out.print(ss.toString());
        scanner.close();
    }
}

