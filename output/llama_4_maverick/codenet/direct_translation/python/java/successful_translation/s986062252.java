
import java.util.Scanner;

public class s986062252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String s = sc.nextLine();
        String t = sc.nextLine();
        long aa = gcd(n, m);
        long bb = lcm(n, m);
        for (long i = 0; i < aa; i++) {
            if (s.charAt((int) (n / aa * i)) != t.charAt((int) (m / aa * i))) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(bb);
    }

    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}

