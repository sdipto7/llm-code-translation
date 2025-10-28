
import java.util.Scanner;

public class s986062252 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] nm = il(scanner);
        int n = nm[0];
        int m = nm[1];
        
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        int aa = gcd(n, m);
        int bb = lcm(n, m);
        int cc = aa / bb;
        
        for (int i = 0; i < aa; i++) {
            if (s.charAt(n / aa * i) != t.charAt(m / aa * i)) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(bb);
        scanner.close();
    }

    private static int[] il(Scanner scanner) {
        String[] parts = scanner.nextLine().trim().split("\\s+");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}

