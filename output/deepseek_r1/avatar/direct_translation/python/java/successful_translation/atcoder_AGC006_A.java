
import java.util.Scanner;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        sc.close();
        
        if (s.equals(t)) {
            System.out.println(n);
            return;
        }
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean match = true;
            for (int j = 0; j < n - i; j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                cnt = n - i;
            }
        }
        System.out.println(2 * n - cnt);
    }
}

