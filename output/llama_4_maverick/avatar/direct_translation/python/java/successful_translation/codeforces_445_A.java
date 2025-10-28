
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] l = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                char c = s.charAt(j);
                if (c == '.') {
                    if ((i + j) % 2 == 1) l[i][j] = 'W';
                    else l[i][j] = 'B';
                } else l[i][j] = c;
            }
        }
        for (char[] c : l) {
            for (char ch : c) System.out.print(ch);
            System.out.println();
        }
    }
}

