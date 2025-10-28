
import java.util.Scanner;

public class s636719275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int ans = 1000000;
        int tLen = t.length();
        int sLen = s.length();
        for (int i = 0; i <= sLen - tLen; i++) {
            String sub = s.substring(i, i + tLen);
            ans = Math.min(ans, check(sub, t));
        }
        System.out.println(ans);
    }

    private static int check(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
        }
        return count;
    }
}

