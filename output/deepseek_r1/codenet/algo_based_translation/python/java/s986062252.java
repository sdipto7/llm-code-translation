
import java.util.Scanner;

public class s986062252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        
        int aa = gcd(n, m);
        int bb = lcm(n, m);
        
        for (int i = 0; i < aa; i++) {
            int sIndex = (n / aa) * i;
            int tIndex = (m / aa) * i;
            if (s.charAt(sIndex) != t.charAt(tIndex)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(bb);
    }
    
    private static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

