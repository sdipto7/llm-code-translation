
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        char[][] l = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            char[] row = s.toCharArray();

            for (int j = 0; j < m; j++) {
                if (row[j] == '.') {
                    if ((i + j) % 2 == 1) {
                        row[j] = 'W';
                    } else {
                        row[j] = 'B';
                    }
                }
            }
            l[i] = row;
        }

        for (char[] c : l) {
            System.out.println(new String(c));
        }

        scanner.close();
    }
}

