import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            char[] s = scanner.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (s[j] == '.') {
                    if ((i + j) % 2 == 1) s[j] = 'W';
                    else s[j] = 'B';
                }
            }
            l[i] = new String(s);
        }
        for (String c : l) System.out.println(c);
    }
}
