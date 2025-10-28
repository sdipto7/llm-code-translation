
import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ab = sc.next().split(" ");
        int A = Integer.parseInt(ab[0]);
        int B = Integer.parseInt(ab[1]);
        String S = sc.next();
        char[] s = S.toCharArray();
        int count = 0;
        for (char c : s) {
            if (c == '-') count++;
        }
        if (s[A] == '-' && count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

