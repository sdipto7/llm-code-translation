
import java.util.Scanner;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sentences = scanner.nextLine().split("[.?!]");
        int ans = 1, sumL = 0;
        for (String s : sentences) {
            s = s.trim() + '.';
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0 ? 1 : 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += L + (sumL > 0 ? 1 : 0);
                }
            }
        }
        System.out.println(ans);
    }
}

