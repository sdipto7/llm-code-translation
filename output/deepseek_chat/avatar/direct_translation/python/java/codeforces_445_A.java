import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] l = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 1) l[i][j] = 'W';
                    else l[i][j] = 'B';
                } else {
                    l[i][j] = s.charAt(j);
                }
            }
        }
        for (char[] c : l) {
            System.out.println(new String(c));
        }
    }
}
