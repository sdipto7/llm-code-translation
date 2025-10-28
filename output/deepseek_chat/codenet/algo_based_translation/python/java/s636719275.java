
import java.util.Scanner;

public class s636719275 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        int ans = 1000000;
        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i);
            if (a.length() >= t.length()) {
                String candidate = a.substring(0, t.length());
                int currentCheck = check(t, candidate);
                ans = Math.min(ans, currentCheck);
            }
        }
        System.out.println(ans);
    }
    
    public static int check(String a, String b) {
        int s = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                s++;
            }
        }
        return s;
    }
}

