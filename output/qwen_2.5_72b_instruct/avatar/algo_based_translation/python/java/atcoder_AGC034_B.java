
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        solve();
    }

    public static int gcd(int a, int b) {
        a = Math.max(a, b);
        b = Math.min(a, b);
        while (a % b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder t = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t.append('A');
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t.append('D');
                        i += 2;
                    } else {
                        t.append('X');
                        i += 1;
                    }
                } else {
                    t.append('X');
                    i += 1;
                }
            } else {
                t.append('X');
                i += 1;
            }
        }
        int total = 0;
        int numA = 0;
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) == 'X') {
                numA = 0;
            } else {
                if (t.charAt(j) == 'A') {
                    numA += 1;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
        long INF = (long) Math.pow(10, 25);
        long mod = 7 + (long) Math.pow(10, 9);
    }
}

