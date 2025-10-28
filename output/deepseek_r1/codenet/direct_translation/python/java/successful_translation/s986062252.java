
import java.util.Scanner;

public class s986062252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().trim();
        String t = sc.nextLine().trim();
        
        int aa = gcd(n, m);
        long lcm = (long) n * m / aa;
        
        for (int i = 0; i < aa; i++) {
            int sIndex = (n / aa) * i;
            int tIndex = (m / aa) * i;
            if (s.charAt(sIndex) != t.charAt(tIndex)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(lcm);
    }
    
    public static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

