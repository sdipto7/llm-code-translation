
import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    chars[j] = (i + j) % 2 != 0 ? 'W' : 'B';
                }
            }
            System.out.println(new String(chars));
        }
    }
}

