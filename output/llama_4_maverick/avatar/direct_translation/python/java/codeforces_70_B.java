
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = Pattern.compile("[.?!]").split(sc.nextLine());
        int ans = 1, sumL = 0;
        for (String str : s) {
            str = str.trim() + '.';
            int L = str.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
                if (sumL + L + (sumL > 0) > n) {
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

